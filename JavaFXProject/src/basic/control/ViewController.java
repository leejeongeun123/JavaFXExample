package basic.control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ViewController implements Initializable {
	
	@FXML
	ListView<String> listView;
	@FXML
	TableView<Phone> tableView;
	@FXML
	ImageView imageView; 

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<String> list = FXCollections.observableArrayList();
				list.add("갤럭시S1");
				list.add("갤럭시S2");
				list.add("갤럭시S3");
				list.add("갤럭시S4");
				list.add("갤럭시S5");
				list.add("갤럭시S6");
				list.add("갤럭시S7");
				listView.setItems(list);
				
				listView.getSelectionModel().selectedIndexProperty() // 리스트를 선택할때마다 테이블뷰 자동선택
				.addListener(new ChangeListener<Number>() {

					@Override
					public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
						tableView.getSelectionModel().select(newValue.intValue());
						tableView.scrollTo(newValue.intValue());
					}
				
				}); 			
				
				ObservableList<Phone> phoneList = FXCollections.observableArrayList();
				phoneList.add(new Phone("갤럭시S1", "Phone01.png"));
				phoneList.add(new Phone("갤럭시S2", "Phone02.png"));
				phoneList.add(new Phone("갤럭시S3", "Phone03.png"));
				phoneList.add(new Phone("갤럭시S4", "Phone04.png"));
				phoneList.add(new Phone("갤럭시S5", "Phone05.png"));
				phoneList.add(new Phone("갤럭시S6", "Phone06.png"));
				phoneList.add(new Phone("갤럭시S7", "Phone07.png"));
				tableView.setItems(phoneList);
				
				//리스트에 있는 값 == TableView 컬럼과 매핑.
				TableColumn<Phone, ?> tcSmartPhone = tableView.getColumns().get(0);
				tcSmartPhone.setCellValueFactory(new PropertyValueFactory<>("smartPhone"));
				
				TableColumn<Phone, ?> tcImage = tableView.getColumns().get(1);
				tcImage.setCellValueFactory(new PropertyValueFactory<>("Image"));
				
				tcSmartPhone.setStyle("-fx-alignment: CENTER;");
				tcImage.setStyle("-fx-alignment: CENTER;");
						
				
				tableView.setItems(phoneList);
				tableView.getSelectionModel() //ListView = <String> 타입 
				.selectedItemProperty() // 속성값 확인
				.addListener(new ChangeListener<Phone>() {

					@Override //이미지view UI controller에 등록 
					public void changed(ObservableValue<? extends Phone> obs, Phone oldV, Phone newV) {
						imageView.setImage(new Image("basic/images/"+newV.getImage()));
						
					}

				});
		
	}

}
