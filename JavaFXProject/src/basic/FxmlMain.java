package basic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FxmlMain extends Application{
	@Override
	
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("AnchorRoot.fxml")); // FXML 화면 호출  
		
		Scene scene = new Scene(root); // scene에 컨테이너 생성
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("FXML 화면");
	}
}
