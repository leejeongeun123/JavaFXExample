package basic;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {
	public void start(Stage primaryStage) throws Exception{
		HBox hbox = new HBox(); //컨테이너.
		hbox. setPadding(new Insets(10)); //옆에 여백 지정
		hbox.setSpacing(10);
		
		TextField tField = new TextField();
		tField.setPrefWidth(200); //값을 입력할 수 있는길이
		
		Button btn = new Button(); //버튼생성 
		btn.setText("확인");
		btn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				Platform.exit(); //화면종료
			}
		});
		
		//컨테이너에 컨트롤 달기.
		hbox.getChildren().add(tField);
		hbox.getChildren().add(btn);
		
		
		Scene scene = new Scene(hbox);
		primaryStage.setScene(scene);
		primaryStage.show(); // primaryStage로 만들어서 show로 확인.
		primaryStage.setTitle("FXML화면");
	} 
	public static void main(String[] args) {
		Application.launch(args);
	}
}


