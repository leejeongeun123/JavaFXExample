package basic.database.javafx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class BookListController implements Initializable{
	
	@FXML
	TableView tableView;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		AnchorPane ap = new AnchorPane();
		Button btnAdd = (Button) ap.lookup("#btnAdd");
		
	}

}
