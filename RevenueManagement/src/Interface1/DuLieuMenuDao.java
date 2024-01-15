package Interface1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DuLieuMenuDao implements MenuInterface<DuLieuMenu> {
    public static DuLieuMenuDao getinstance() {
        return new DuLieuMenuDao();
    }

    @Override
    public ArrayList<DuLieuMenu> selecta() {
        ArrayList<DuLieuMenu> listMenu = new ArrayList<DuLieuMenu>();
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();

            String sql = "SELECT * FROM thucdon WHERE taikhoanid="+TrangDangNhap.getId()+";";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                
                String TenMon = rs.getString("DanhMucThucPham");
                int GiaThanh = rs.getInt("NgayThang");
                int LoiNhuan = rs.getInt("SoluongDonHang");
                DuLieuMenu tin = new DuLieuMenu(TenMon,GiaThanh,LoiNhuan);
                 listMenu.add(tin);
             
            }
            JDBCUtil.colseConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMenu;
    }
  


}
