package sample6;


import java.io.IOException;
import java.util.Optional;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ContactOverviewController {
	@FXML
	private TableView<Contact> contactTable;
	private ObservableList<Contact> contactData = FXCollections.observableArrayList();
	
	@FXML
	private TableColumn<Contact, String> nameColumn;
	@FXML
	private TableColumn<Contact, String> phoneColumn;

	@FXML
	private Label nameLabel;
	@FXML
	private Label phoneLabel;
	@FXML
	private Label emailLabel;
	@FXML
	private Label addrLabel;
	@FXML
	private Label faxLabel;
	
	public ContactOverviewController(){
		contactData.add(new Contact("홍길동", "010-1234-5678", "hong@gmail.com", "종로", "02-1234-1234"));
		contactData.add(new Contact("홍길동", "010-1234-5678", "hong@gmail.com", "종로", "02-1234-1234"));
		contactData.add(new Contact("홍길동", "010-1234-5678", "hong@gmail.com", "종로", "02-1234-1234"));
		contactData.add(new Contact("홍길동", "010-1234-5678", "hong@gmail.com", "종로", "02-1234-1234"));
	}
	
	/*
	 * Controller의 initialize() 메소드는 fxml파일이 로드되고 나서 자동으로 실행된다.
	 * 주로, 화면과 관련된 초기화 작업을 구현한다.
	 * 	- 기본데이터 설정
	 * 	- 이벤트 등록
	 */
	@FXML
	private void initialize(){
		nameColumn.setCellValueFactory(celldata->celldata.getValue().nameProperty());
		phoneColumn.setCellValueFactory(celldata->celldata.getValue().phoneProperty());
		contactTable.setItems(contactData);
		
						
		contactTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue)->		{
			if(newValue != null){
				nameLabel.setText(newValue.getName());
				phoneLabel.setText(newValue.getPhone());
				emailLabel.setText(newValue.getEmail());
				addrLabel.setText(newValue.getAddr());
				faxLabel.setText(newValue.getFax());
			}
		});
		nameLabel.setText("");
		phoneLabel.setText("");
		emailLabel.setText("");
		addrLabel.setText("");
		faxLabel.setText("");
		
		//0번째 행 선택하기
		//contactTable.getSelectionModel().select(0);
		
		
	}
	@FXML
	public void addNewContact()throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("ContactEdit.fxml"));
		Parent page = loader.load();
		
		Scene scene = new Scene(page);
		
		//다이얼로그용 스테이지 만들기
		Stage dialogStage = new Stage();
		dialogStage.setTitle("신규 연락처 등록");
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.setScene(scene);
		
		//ContactEditController 가져오기
		ContactEditController editController = loader.getController();
		editController.setContactData(contactData);
		editController.setDialogStage(dialogStage);
		
		dialogStage.showAndWait();
		
	}
	@FXML
	public void deleteContact(){
		int selectedIndex = contactTable.getSelectionModel().getSelectedIndex();
		
		if(selectedIndex < 0){
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("경고 메세지");
			alert.setHeaderText("연락처 삭제 관련 경보");
			alert.setContentText("삭제할 연락처 정보를 선택하세요");
			
			alert.showAndWait();
		}else{
			Alert alert = new Alert(AlertType.CONFIRMATION);
			
			alert.setTitle("삭제 확인");
			alert.setHeaderText("연락처 삭제 확인");
			alert.setContentText("선택한 연락처를 삭제하시겠습니까?");
			
			Optional<ButtonType> result = alert.showAndWait();
			if(result.get() == ButtonType.OK){
				contactData.remove(selectedIndex);
			}
		}
	}
}
