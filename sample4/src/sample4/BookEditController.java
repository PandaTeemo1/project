package sample4;

import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class BookEditController {
	
	private BookDAO bookDao = new BookDAO();
	
	@FXML
	private TextField titleField;
	@FXML
	private TextField authorField;
	@FXML
	private TextField publisherField;
	@FXML
	private TextField priceField;
	
	@FXML
	private void addBook()throws SQLException{
		String title = titleField.getText();
		String author = authorField.getText();
		String publisher = publisherField.getText();
		int price = Integer.parseInt(priceField.getText());
		
		BookVO VO = new BookVO();
		VO.setTitle(title);
		VO.setAuthor(author);
		VO.setPublisher(publisher);
		VO.setPrice(price);
		bookDao.insertBook(VO);
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("책 등록");
		alert.setContentText("책 등록이 완료되었습니다");
		alert.showAndWait();
	}
	
	@FXML
	private void clearField(){
		titleField.setText("");
		authorField.setText("");
		publisherField.setText("");
		priceField.setText("");
	}
}
