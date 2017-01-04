package Client;

import java.sql.SQLException;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class RegControllor {
	private ObservableList<Acc> AccData;
	private Stage dialogStage;
	public void setAccData(ObservableList<Acc> AccData){
		this.AccData = AccData;
	}
	public void setDialogStage(Stage dialogStage){
		this.dialogStage = dialogStage;
	}
	
	AccDAO dao = new AccDAO();
	@FXML
	private TextField idField;
	@FXML
	private TextField pwdField;
	@FXML
	private TextField nameField;
	@FXML
	private TextField emailField;
	@FXML
	private TextField phoneField;
	
	@FXML
	public void reg()throws SQLException{
		String id = idField.getText();
		String pwd = pwdField.getText();
		String name = nameField.getText();
		String email = emailField.getText();
		String phone = phoneField.getText();
		
		Acc Ac = new Acc();
		Ac.setId(id);
		Ac.setPwd(pwd);
		Ac.setName(name);
		Ac.setEmail(email);
		Ac.setPhone(phone);

		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("회원 가입");
		alert.setContentText("회원 가입이 완료되었습니다\n");
		alert.showAndWait();
		
		AccData.add(Ac);
		dialogStage.close();
	}
}
