package basic.container.eventhandle;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	@FXML Label label;
	@FXML Slider slider;
	@Override
	public void initialize(URL location, ResourceBundle resouce) {
		slider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number StartValue, Number endValue) {
				label.setFont(new Font(endValue.doubleValue()));
				
			}
			
		});
		
	}
	

}
