package Client;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TransControllor {
	@FXML
	private TableView<Acc> AccTable;
	@FXML
	private TableColumn<Acc, String> AccCol;
	@FXML
	private TableColumn<Acc, String> dateCol;
	@FXML
	private TableColumn<Acc, String> nameCol;
	@FXML
	private TableColumn<Acc, Integer> priceCol;
	@FXML
	private TableColumn<Acc, Integer> balanceCol;
	
	@FXML
	private Label mainLabel;
	@FXML
	private Label nameLabel;
	@FXML
	private Label accLabel;
	@FXML
	private Label balLabel;
	@FXML
	private TextField nameTextField;
	@FXML
	private TextField accTextField;
	@FXML
	private TextField balTextField;
}
