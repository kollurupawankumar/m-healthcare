package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection {
private static Connection conn;
public static Connection getConnection(){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/PSMPA","root","root");
	}catch( Exception e){
		e.printStackTrace();
	}
	return conn;
	}
}
