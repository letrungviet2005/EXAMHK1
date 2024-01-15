package Interface1;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SanPhamDao implements SanPhamInteface<DuLieuSanPham> {

    public static SanPhamDao getInstance1() {
        return new SanPhamDao();
    }

    @Override
    public ArrayList<DuLieuSanPham> selectAll2() {
        ArrayList<DuLieuSanPham> list = new ArrayList<DuLieuSanPham>();
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();

            String sql = "SELECT * FROM sanpham Where taikhoanid="+TrangDangNhap.getId()+";";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int taikhoanid = rs.getInt("taikhoanid");
                String Ten = rs.getString("Ten");
                String LoaiSanPham = rs.getString("LoaiSanPham");
                int GiaNhap=rs.getInt("GiaNhap");
                int GiaBan=rs.getInt("GiaBan");
                int SL=rs.getInt("SL");
              
                DuLieuSanPham tin = new DuLieuSanPham(taikhoanid, Ten, LoaiSanPham,GiaNhap,GiaBan,SL);
                list.add(tin);
                
            }
            JDBCUtil.colseConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
   }



