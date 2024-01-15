package Interface1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ThongTinBanDao implements BanInterface<ThongTinBan> {
    public static ThongTinBanDao getinstanceBan() {
        return new ThongTinBanDao();
    }

    @Override
    public ArrayList<ThongTinBan> selectALLBan() {
        ArrayList<ThongTinBan> listMenu = new ArrayList<ThongTinBan>();
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();

            String sql = "SELECT * FROM quanlyban WHERE taikhoanid="+TrangDangNhap.getId()+";";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                
               int taikhoanid =rs.getInt("taikhoanid");
               String TenBan = rs.getString("TenBan");
               String Vitri = rs.getString("ViTri");
               String TrangThai = rs.getString("TrangThai");
                ThongTinBan tin = new ThongTinBan(taikhoanid ,TenBan,Vitri,TrangThai);
                 listMenu.add(tin);
             
            }
            JDBCUtil.colseConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMenu;
    }


	
  


}
