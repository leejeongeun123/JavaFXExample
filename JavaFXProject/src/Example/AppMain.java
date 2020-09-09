package Example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AppMain extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane Root = FXMLLoader.load(getClass().getResource("Root.fxml"));
		Scene scene= new Scene(Root);
		primaryStage.setScene(scene);
		
		
		primaryStage.show();

	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
