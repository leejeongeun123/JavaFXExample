package basic.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	public static Connection getDB() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr" , passwd = "hr";
		Connection conn = null;
		try {
		Class.forName ("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("db에 연결되었습니다.");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		
}
		return conn;
}
}