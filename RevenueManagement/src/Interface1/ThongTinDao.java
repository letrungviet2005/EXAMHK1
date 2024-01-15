package Interface1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ThongTinDao implements DAOInterface<Thongtin> {

    public static ThongTinDao getInstance() {
        return new ThongTinDao();
    }

    @Override
    public ArrayList<Thongtin> selectAll() {
        ArrayList<Thongtin> list = new ArrayList<Thongtin>();
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();

            String sql = "SELECT * FROM taikhoan";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("ID");
                String email = rs.getString("email");
                String pass = rs.getString("password");
                int DoanhThu=rs.getInt("DoanhThu");
                int LoiNhuan=rs.getInt("LoiNhuan");
                int DonTonKho=rs.getInt("DonTonkho");
                String DuLieuAnh = rs.getString("DuLieuAnh");
                Thongtin tin = new Thongtin(id, email, pass,DoanhThu,LoiNhuan,DonTonKho,DuLieuAnh);
                list.add(tin);
                
            }
            JDBCUtil.colseConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    } public static int getDoanhThuByID(ArrayList<Thongtin> list, int id) {
        for (Thongtin tin : list) {
            if (tin.getID() == id) {
                return tin.getDoanhThu();
            }
        }
        return 0; // Trả về giá trị mặc định nếu không tìm thấy ID trong danh sách
    }
    public static int getLoiNhuanbyid(ArrayList<Thongtin> list, int id) {
        for (Thongtin tin : list) {
            if (tin.getID() == id) {
                return tin.getLoiNhuan();
            }
        }
        return 0; // Trả về giá trị mặc định nếu không tìm thấy ID trong danh sách
    }
    public static int getDonTonKhobyid(ArrayList<Thongtin> list, int id) {
        for (Thongtin tin : list) {
            if (tin.getID() == id) {
                return tin.getDonTonKho();
            }
        }
        return 0; // Trả về giá trị mặc định nếu không tìm thấy ID trong danh sách
    }
    public static String getTenTaiKhoanbyID(ArrayList<Thongtin> list, int id) {
        for (Thongtin tin : list) {
            if (tin.getID() == id) {
                return tin.getEmail();
            }
        }
        return null; // Trả về giá trị mặc định nếu không tìm thấy ID trong danh sách
    }
    public static String getDuLieuAnhbyID(ArrayList<Thongtin> list, int id) {
        for (Thongtin tin : list) {
            if (tin.getID() == id) {
                return tin.getDuLieuAnh();
            }
        }
        return null; // Trả về giá trị mặc định nếu không tìm thấy ID trong danh sách
    }

}
