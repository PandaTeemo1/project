package Client;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class LoginControllor {
	@FXML
	private ObservableList<Acc> AccData = FXCollections.observableArrayList();
	

	@FXML
	private TextField accTextField;
	@FXML
	private TextField pwdTextField;
	
	@FXML
	public void Reg()throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("RegSter.fxml"));
		Parent page = loader.load();
		
		Scene scene = new Scene(page);
		
		//다이얼로그용 스테이지 만들기
		Stage dialogStage = new Stage();
		dialogStage.setTitle("신규 연락처 등록");
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.setScene(scene);
		
		//ContactEditController 가져오기
		RegControllor regController = loader.getController();
		regController.setAccData(AccData);
		regController.setDialogStage(dialogStage);
		
		dialogStage.showAndWait();
	}
}
