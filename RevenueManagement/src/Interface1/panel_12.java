package Interface1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;

public class panel_12 extends JPanel {

	private static String TenBan;
	private static String ViTri;
	private static String HoaDon;
	private static String TongTien;
	private static String ThoiGian;
	
	/**
	 * Create the panel.
	 */
	public panel_12() {
		setLayout(null);
        setBackground(Color.WHITE);
        setSize(1277,735);
		ArrayList<String> doanhthu11 = new ArrayList<String>();
		ArrayList<String> doanhthunam = new ArrayList<String>();
		JPanel LichSuBan = new JPanel();
		LichSuBan.setBounds(0, 0, 1277, 735);
		add(LichSuBan);
		LichSuBan.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel.setBounds(10, 86, 1257, 13);
		LichSuBan.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lịch Sử Bàn");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 10, 189, 56);
		LichSuBan.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 135, 1204, 365);
		LichSuBan.add(scrollPane);
		

		
		
		
		
        
        // noi dung can luu
    	JTable table11 = new JTable();
        table11.setModel(new DefaultTableModel(
			    new Object[][]{},
			    new String[]{ "Tên bàn","Vị Trí","Hóa Đơn","Tổng Tiền","Thời Gian"}
			));
        DefaultTableModel model11 = (DefaultTableModel) table11.getModel();
			scrollPane.setViewportView(table11);
			 Connection con10 = JDBCUtil.getConnection();
	            Statement st10 = null;
	            try {
					st10 = con10.createStatement();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            String sql10 = "SELECT * FROM lichsuban Where taikhoanid="+TrangDangNhap.getId()+";";
	            try {
					ResultSet rs10 = st10.executeQuery(sql10);
					while (rs10.next()) {
					    int taikhoanid = rs10.getInt("taikhoanid");
					    
					    String TenBan = rs10.getString("TenBan");
					    String ViTri = rs10.getString("ViTri");
					    String HoaDon = rs10.getString("HoaDon");
					    int TongTien =rs10.getInt("TongTien");
					    String ThoiGian = rs10.getString("ThoiGian");
					   
					   
					    model11.addRow(new Object[]{TenBan,ViTri,HoaDon,TongTien,ThoiGian});
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	          
		
		
		  ListSelectionModel selectionModel = table11.getSelectionModel();
          selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Chỉ cho phép chọn một dòng
          selectionModel.addListSelectionListener(new ListSelectionListener() {
              @Override
              public void valueChanged(ListSelectionEvent e) {
                  if (!e.getValueIsAdjusting()) {
                      int selectedRow = table11.getSelectedRow();
                      if (selectedRow != -1) {
                          Object[] rowData = new Object[model11.getColumnCount()];
                          for (int i = 0; i < model11.getColumnCount(); i++) {
                              rowData[i] = model11.getValueAt(selectedRow, i);
                          }
                          String tenban=String.valueOf(rowData[0]);
                          String vitri=String.valueOf(rowData[1]);
                          String hoadon=String.valueOf(rowData[2]);
                          String tongtien=String.valueOf(rowData[3]);
                          String thoigian=String.valueOf(rowData[4]);
                          TenBan=tenban;
                         ViTri=vitri;
                         HoaDon=hoadon;
                         TongTien=tongtien;
                         ThoiGian=thoigian;
                         ThongTinlichsuban.main(null);
                          // Xử lý thông tin của dòng được chọn theo ý của bạn
                      }
                  }
              }
          });
		
		JLabel lblNewLabel_2 = new JLabel("Lịch Sử Chi Tiết :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 109, 269, 13);
		LichSuBan.add(lblNewLabel_2);
		
		
	}

	public static String getTenBan() {
		return TenBan;
	}

	public static void setTenBan(String tenBan) {
		TenBan = tenBan;
	}

	public static String getViTri() {
		return ViTri;
	}

	public static void setViTri(String viTri) {
		ViTri = viTri;
	}

	public static String getHoaDon() {
		return HoaDon;
	}

	public static void setHoaDon(String hoaDon) {
		HoaDon = hoaDon;
	}

	public static String getTongTien() {
		return TongTien;
	}

	public static void setTongTien(String tongTien) {
		TongTien = tongTien;
	}

	public static String getThoiGian() {
		return ThoiGian;
	}

	public static void setThoiGian(String thoiGian) {
		ThoiGian = thoiGian;
	}
}
