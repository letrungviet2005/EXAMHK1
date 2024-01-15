package Interface1;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCUtil {

	public static Connection getConnection() {
		Connection c = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url= "jdbc:mySQL://localhost:3306/test";
			String username = "root";
			String passworld="";
			
			c= DriverManager.getConnection(url, username, passworld);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return c;
		
	}
	public static void colseConnection(Connection c) {
		try {
			if (c!=null) {
				c.close();
			}
			} catch (Exception e) {
				e.printStackTrace();
				
			}

	}
}

