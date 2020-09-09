package basic.database.javafx;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Board {
	SimpleIntegerProperty boardNo;
	SimpleStringProperty title;
	SimpleStringProperty content;
	SimpleStringProperty writer;
	SimpleStringProperty createDate;
	public Board(int boardNo, String title, String content,String writer, String createDate) {
		this.boardNo = new SimpleIntegerProperty();
		this.title = new SimpleStringProperty();		
	}
	
}
