package basic.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class RootController2 implements Initializable {
	@FXML
	TableView<Student> tableView;
	
	ObservableList<Student> list;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TableColumn<Student, ?> tc = tableView.getColumns().get(0);
		tc.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		tc = tableView.getColumns().get(1);
		tc.setCellValueFactory(new PropertyValueFactory<>("korean"));
	
	list = FXCollections.observableArrayList();
	tableView.setItems(list);
	
	}
	
	
	


}
