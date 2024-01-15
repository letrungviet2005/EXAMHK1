package Interface1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int doanhthu = 0;
        int loinhuan=0;
		 Connection con = JDBCUtil.getConnection();
		 Statement statement3 = null;
		 for (int i1 = 2034; i1 >2022; i1--) {
             
             String sql3 = "INSERT INTO doanhthutheonam (taikhoanid, nam, doanhthu, loinhuan) VALUES (  9, '" + i1 + "', " + doanhthu +","+loinhuan+ ")";
             try {
             	 statement3 = con.createStatement();
                 statement3.executeUpdate(sql3);
             } catch (SQLException e1) {
                 e1.printStackTrace();
             }}
		 
		 
		 
		 
		 
		 
	}

}
