package basic.container.eventhandle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EventHandlerExample extends Application {
 // 화면start
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		BorderPane root
		= FXMLLoader.load(getClass().getResource("Root.fxml"));
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	
}

//VBoxExample 에 ui생성, 이벤트생성, main 메소드에 모두 start 한화면에 모두 실행.
//EventExample은 main메소드 실행. ui는 FXML(화면생성)/ controller 
