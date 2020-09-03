package basic.control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ButtonController implements Initializable {
   @FXML private CheckBox chk1;
   @FXML private CheckBox chk2;
   @FXML private ImageView checkImageView;
   @FXML private ToggleGroup group;
   @FXML private ImageView radioImageView; //34행 redioImageView.setImage(new Image("basic/images/" + newValue.getUserData().toString()+".png"));
   @FXML private Button btnExit;
   
   @Override
   public void initialize(URL location, ResourceBundle resources) {
      group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

         @Override
         public void changed(ObservableValue<? extends Toggle> observable,
               Toggle oldValue, Toggle newValue) {
            Image image = new Image(getClass().getResource("/basic/images/" +
               newValue.getUserData().toString() + ".png").toString());
            radioImageView.setImage(image);
         }
      });
      
    
      
   }	//end of initialize
   
   
   public void handleChkAction() { //이벤트 발생시 마다 hand 시행 
	   String imgName = "";
      if(chk1.isSelected() && chk2.isSelected()) {
              imgName = "geek-glasses-hair.gif";
      } else if(chk1.isSelected()) {
    	  		imgName = "geek-glasses.gif";
      } else if(chk2.isSelected()) {
    	  		imgName = "geek-hair.gif";
      } else {
        		 imgName = "geek.gif";
      }
      checkImageView.setImage(new Image("/basic/image/"+ imgName));
   }
   public void handleBntExitAction(ActionEvent e) {
      Platform.exit();
   }
}




//	rad1.setOnMouseClicked(new EventHandler<MouseEvent>() {
//		@Overried
//		public void handle(MouseEvent me) {
//			System.out.println("rad1 clicked.");
//		}
//	});
//	rad2.setOnMouseClicked((a) -> System.out.println("rad2 clicked."));
//	rad3.setSelected(true);
//	}









