package Interface1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class panel_11 extends JPanel {
	private JPanel panel_3;
	private String thongketheo;
	private String selectedYear;
	/**
	 * Create the panel.
	 */
	public panel_11() {
		setLayout(null);
        setBackground(Color.WHITE);
        setSize(1277,735);
		ArrayList<String> doanhthu11 = new ArrayList<String>();
		ArrayList<String> doanhthunam = new ArrayList<String>();
		JPanel panelthongke = new JPanel();
		panelthongke.setBounds(0, 0, 1277, 735);
		panelthongke.setLayout(new BorderLayout());
		add(panelthongke);
        
		JScrollPane sc = new JScrollPane();

		// Code vẽ đường thẳng ở đây
				int x1 = 70; // Tọa độ x điểm đầu
				int y1 = 290; // Tọa độ y điểm đầu
				int x2 = 70; // Tọa độ x điểm cuối
				int y2 = 970; // Tọa độ y điểm cuối
				int x3 = 70; // Tọa độ x điểm đầu
				int y3 = 970; // Tọa độ y điểm đầu
				int x4 = 1170; // Tọa độ x điểm cuối
				int y4 = 970; // Tọa độ y điểm cuối
		JPanel panel_11 = new JPanel() {
		    @Override
		    protected void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        g.drawLine(x1, y1, x2, y2);
		        g.drawLine(x3, y3, x4, y4);
		    }
		};
		panel_11.setBackground(Color.WHITE);
		panel_11.setLayout(null); // Sử dụng layout manager phù hợp

		


		
		sc.setViewportView(panel_11);
		panelthongke.add(sc, BorderLayout.CENTER);

		panel_11.setPreferredSize(new Dimension(1, 1100));
		JLabel bbbb1111111 = new JLabel(" -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		bbbb1111111.setForeground(new Color(30, 144, 255));
		bbbb1111111.setFont(new Font("Tahoma", Font.PLAIN, 8));
		bbbb1111111.setBounds(10, 77, 1244, 13);
		panel_11.add(bbbb1111111);
		
		JLabel bbbb111 = new JLabel("Thống Kê");
		bbbb111.setFont(new Font("Tahoma", Font.PLAIN, 32));
		bbbb111.setBounds(10, 24, 240, 43);
		panel_11.add(bbbb111);
		
		JLabel lblNewLabel_4_1 = new JLabel(" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_4_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_4_1.setBounds(27, 1000, 1175, 13);
		panel_11.add(lblNewLabel_4_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 0, 255));
		panel_2.setBounds(10, 100, 600, 54);
		panel_11.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_7_1 = new JLabel("Doanh Thu Của Quán :");
		lblNewLabel_7_1.setBounds(0, 0, 312, 43);
		panel_2.add(lblNewLabel_7_1);
		lblNewLabel_7_1.setForeground(Color.GREEN);
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		  ArrayList<Thongtin> list2 = ThongTinDao.getInstance().selectAll();
		  int id =TrangDangNhap.getId();
		  int doanhThu = ThongTinDao.getDoanhThuByID(list2, id);
		 String strNumber = String.valueOf(doanhThu);
		JLabel lblNewLabel_4 = new JLabel(strNumber+"   VND");
		
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(309, 6, 243, 36);
		panel_2.add(lblNewLabel_4);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(30, 144, 255));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(620, 100, 489, 54);
		panel_11.add(panel_2_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Lợi Nhuận :");
		lblNewLabel_7_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_7_1_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_7_1_1.setBounds(0, 0, 175, 43);
		panel_2_1.add(lblNewLabel_7_1_1);
		int loiNhuan = ThongTinDao.getLoiNhuanbyid(list2, id);
		String strNumber1 = String.valueOf(loiNhuan);
		
		JLabel lblNewLabel_4_2 = new JLabel(strNumber1+"  VND");
		lblNewLabel_4_2.setForeground(Color.RED);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_4_2.setBounds(159, 8, 292, 33);
		panel_2_1.add(lblNewLabel_4_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(0, 250, 154));
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(10, 164, 746, 64);
		panel_11.add(panel_2_2);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("Sản Phẩm Bán Chạy Nhất :");
		lblNewLabel_7_1_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_7_1_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_7_1_2.setBounds(0, 0, 354, 43);
		panel_2_2.add(lblNewLabel_7_1_2);
		
		String ten = null;
		int maxSL = 0;
		Connection con1 = JDBCUtil.getConnection();
		PreparedStatement ps1 = null;
		ResultSet rs11 = null;

		String sql = "SELECT Ten, SL FROM sanpham WHERE taikhoanid = ? ORDER BY SL DESC LIMIT 1";
		try {
		    ps1 = con1.prepareStatement(sql);
		    ps1.setInt(1, TrangDangNhap.getId());
		    rs11 = ps1.executeQuery();

		    if (rs11.next()) {
		        ten = rs11.getString("Ten");
		        maxSL = rs11.getInt("SL");
		    }
		} catch (SQLException e1) {
		    e1.printStackTrace();
		} finally {
		    // Đảm bảo đóng ResultSet, PreparedStatement và Connection
		    try {
		        if (rs11 != null) {
		            rs11.close();
		        }
		        if (ps1 != null) {
		            ps1.close();
		        }
		        if (con1 != null) {
		            con1.close();
		        }
		    } catch (SQLException e2) {
		        e2.printStackTrace();
		    }
		}
		
		
		
		JLabel lblNewLabel_4_3 = new JLabel(ten);
		lblNewLabel_4_3.setForeground(Color.RED);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_4_3.setBounds(355, 11, 381, 27);
		panel_2_2.add(lblNewLabel_4_3);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(0, 255, 255));
		panel_2_3.setLayout(null);
		panel_2_3.setBounds(766, 164, 482, 64);
		panel_11.add(panel_2_3);
		
		JLabel lblNewLabel_7_1_3 = new JLabel("Khách Hàng Đánh Giá :");
		lblNewLabel_7_1_3.setForeground(new Color(139, 0, 139));
		lblNewLabel_7_1_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_7_1_3.setBounds(0, 0, 312, 43);
		panel_2_3.add(lblNewLabel_7_1_3);
		
		JLabel lblNewLabel_7 = new JLabel("Thống Kê Chi Tiết :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(10, 238, 240, 26);
		panel_11.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Phân Loại :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(120, 265, 83, 13);
		panel_11.add(lblNewLabel_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thongketheo=(String) comboBox.getSelectedItem();
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Theo Tháng", "Theo Năm"}));
		comboBox.setBounds(213, 262, 262, 21);
		panel_11.add(comboBox);
		
	    panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(86, 293, 1168, 670);
		panel_11.add(panel_3);
		panel_3.setLayout(null);
		//panel thong ke theo nam
		
		JPanel thongketheonam = new JPanel();
		thongketheonam.setBackground(Color.WHITE);
		thongketheonam.setBounds(86, 293, 1168, 670);
		thongketheonam.setLayout(null);
		thongketheonam.setVisible(false);
		panel_11.add(thongketheonam);
		
		
		
		//panel thong ke theo nam
	    JLabel doanhthuthang12 = new JLabel("");
		panel_3.add(doanhthuthang12);
		
		JLabel doanhthuthang11 = new JLabel("");
		
		panel_3.add(doanhthuthang11);
		
		JLabel doanhthuthang10 = new JLabel("");
		
		panel_3.add(doanhthuthang10);
		
		JLabel doanhthuthang9 = new JLabel("");
		
		panel_3.add(doanhthuthang9);
		
		JLabel doanhthuthang8 = new JLabel("");
		
		panel_3.add(doanhthuthang8);
		
		JLabel doanhthuthang7 = new JLabel("");
		
		panel_3.add(doanhthuthang7);
		
		JLabel doanhthuthang6 = new JLabel("");
		
		panel_3.add(doanhthuthang6);
		
		JLabel doanhthuthang5 = new JLabel("");
		
		panel_3.add(doanhthuthang5);
		
		JLabel doanhthuthang4 = new JLabel("");
	
		panel_3.add(doanhthuthang4);
		
		JLabel doanhthuthang3 = new JLabel("");
	
		panel_3.add(doanhthuthang3);
		
		JLabel doanhthuthang2 = new JLabel("");
	
		panel_3.add(doanhthuthang2);
		
		JLabel doanhthuthang1 = new JLabel("");
		
		panel_3.add(doanhthuthang1);
		
		
		
		
			 Connection con = JDBCUtil.getConnection();
        Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        String sql2 = "SELECT * FROM doanhthutheothang Where taikhoanid="+TrangDangNhap.getId()+";";
        try {
			ResultSet rs1 = st.executeQuery(sql2);
			while (rs1.next()) {
			    int taikhoanid = rs1.getInt("taikhoanid");
			    String thangnam = rs1.getString("thangnam");
			    String doanhthu=rs1.getString("doanhthu");
			  doanhthu11.add(doanhthu);
			   
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	   int num12 =Integer.parseInt(doanhthu11.get(0));
	   int num11 =Integer.parseInt(doanhthu11.get(1));
	   int num10 =Integer.parseInt(doanhthu11.get(2));
	   int num9 =Integer.parseInt(doanhthu11.get(3));
	   int num8 =Integer.parseInt(doanhthu11.get(4));
	   int num7 =Integer.parseInt(doanhthu11.get(5));
	   int num6 =Integer.parseInt(doanhthu11.get(6));
	   int num5 =Integer.parseInt(doanhthu11.get(7));
	   int num4 =Integer.parseInt(doanhthu11.get(8));
	   int num3 =Integer.parseInt(doanhthu11.get(9));
	   int num2 =Integer.parseInt(doanhthu11.get(10));
	   int num1 =Integer.parseInt(doanhthu11.get(11));
	   
	   
	    
	    

		
	    double width12 = (num12 / 100000000.0) * 1100;
	    double width11 = (num11 / 100000000.0) * 1100;
	    double width10 = (num10 / 100000000.0) * 1100;
	    double width9 = (num9 / 100000000.0) * 1100;
	    double width8 = (num8 / 100000000.0) * 1100;
	    double width7 = (num7 / 100000000.0) * 1100;
	    double width6 = (num6 / 100000000.0) * 1100;
	    double width5 = (num5 / 100000000.0) * 1100;
	    double width4 = (num4 / 100000000.0) * 1100;
	    double width3 = (num3 / 100000000.0) * 1100;
	    double width2 = (num2 / 100000000.0) * 1100;
	    double width1 = (num1 / 100000000.0) * 1100;

	    doanhthuthang12.setBounds((int) width12 +10, 22, 85, 13);
	    doanhthuthang12.setText(doanhthu11.get(0)+" đ");
	    
	    doanhthuthang11.setBounds((int) width11+10, 75, 85, 13);
	    doanhthuthang11.setText(doanhthu11.get(1)+" đ");
	    
	    doanhthuthang10.setBounds((int) width10+10, 135, 85, 13);
	    doanhthuthang10.setText(doanhthu11.get(2)+" đ");
	    
	    doanhthuthang9.setBounds((int) width9+10, 193, 85, 13);
	    doanhthuthang9.setText(doanhthu11.get(3)+" đ");
	    
	    doanhthuthang8.setBounds((int) width8+10, 251, 85, 13);
	    doanhthuthang8.setText(doanhthu11.get(4)+" đ");
	    
	    doanhthuthang7.setBounds((int) width7+10, 308, 85, 13);
	    doanhthuthang7.setText(doanhthu11.get(5)+" đ");
	    
	    doanhthuthang6.setBounds((int) width6+10, 363, 85, 13);
	    doanhthuthang6.setText(doanhthu11.get(6)+" đ");
	    
	    doanhthuthang5.setBounds((int) width5+10, 414, 85, 13);
	    doanhthuthang5.setText(doanhthu11.get(7)+" đ");
	    
	    doanhthuthang4.setBounds((int) width4+10, 468, 85, 13);
	    doanhthuthang4.setText(doanhthu11.get(8)+" đ");
	    
	    doanhthuthang3.setBounds((int) width3+10, 531, 85, 13);
	    doanhthuthang3.setText(doanhthu11.get(9)+" đ");
	    
	    doanhthuthang2.setBounds((int) width2+10, 590, 85, 13);
	    doanhthuthang2.setText(doanhthu11.get(10)+" đ");
	    
	    doanhthuthang1.setBounds((int) width1+10, 638, 85, 13);
	    doanhthuthang1.setText(doanhthu11.get(11)+" đ");
	    
	    JPanel panel_4 = new JPanel();
	    panel_4.setBackground(Color.RED);
	    panel_4.setBounds(0, 10, (int) width12, 31);
	    panel_3.add(panel_4);
	    
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.ORANGE);
		panel_5.setBounds(0, 69,(int) width11  , 31);
		panel_3.add(panel_5);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(Color.GREEN);
		panel_5_1.setBounds(0, 129, (int) width10, 31);
		panel_3.add(panel_5_1);
		
		JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBackground(new Color(139, 0, 139));
		panel_5_1_1.setBounds(0, 188, (int) width9, 31);
		panel_3.add(panel_5_1_1);
		
		JPanel panel_5_1_1_1 = new JPanel();
		panel_5_1_1_1.setBackground(Color.GREEN);
		panel_5_1_1_1.setBounds(0, 243, (int) width8, 31);
		panel_3.add(panel_5_1_1_1);
		
		JPanel panel_5_1_1_2 = new JPanel();
		panel_5_1_1_2.setBackground(new Color(0, 255, 255));
		panel_5_1_1_2.setBounds(0, 299, (int) width7, 31);
		panel_3.add(panel_5_1_1_2);
		
		JPanel panel_5_1_1_3 = new JPanel();
		panel_5_1_1_3.setBackground(Color.BLACK);
		panel_5_1_1_3.setBounds(0, 356, (int) width6, 31);
		panel_3.add(panel_5_1_1_3);
		
		JPanel panel_5_1_1_4 = new JPanel();
		panel_5_1_1_4.setBackground(Color.BLUE);
		panel_5_1_1_4.setBounds(0, 407, (int) width5, 31);
		panel_3.add(panel_5_1_1_4);
		
		JPanel panel_5_1_1_5 = new JPanel();
		panel_5_1_1_5.setBackground(Color.DARK_GRAY);
		panel_5_1_1_5.setBounds(0, 460, (int) width4, 31);
		panel_3.add(panel_5_1_1_5);
		
		JPanel panel_5_1_1_6 = new JPanel();
		panel_5_1_1_6.setBackground(Color.cyan);
		panel_5_1_1_6.setBounds(0, 520, (int) width3, 31);
		panel_3.add(panel_5_1_1_6);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(Color.ORANGE);
		panel_5_2.setBounds(0, 580, (int) width2, 31);
		panel_3.add(panel_5_2);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.RED);
		panel_4_1.setBounds(0, 635, (int) width1, 31);
		panel_3.add(panel_4_1);
		
		JLabel lblNewLabel_9 = new JLabel("Tháng");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(44, 274, 34, 15);
		panel_11.add(lblNewLabel_9);
		
		JLabel lblNewLabel_6 = new JLabel("12");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(44, 314, 32, 13);
		panel_11.add(lblNewLabel_6);
		
		
		
		JLabel lblNewLabel_6_1 = new JLabel("11");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(44, 374, 32, 13);
		panel_11.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("10");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_2.setBounds(44, 433, 32, 13);
		panel_11.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("9");
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_3.setBounds(44, 489, 32, 13);
		panel_11.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("8");
		lblNewLabel_6_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_4.setBounds(44, 545, 32, 13);
		panel_11.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_6_5 = new JLabel("7");
		lblNewLabel_6_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_5.setBounds(44, 601, 32, 13);
		panel_11.add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_6_6 = new JLabel("6");
		lblNewLabel_6_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_6.setBounds(44, 654, 32, 13);
		panel_11.add(lblNewLabel_6_6);
		
		JLabel lblNewLabel_6_7 = new JLabel("5");
		lblNewLabel_6_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_7.setBounds(44, 707, 32, 13);
		panel_11.add(lblNewLabel_6_7);
		
		JLabel lblNewLabel_6_8 = new JLabel("4");
		lblNewLabel_6_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_8.setBounds(44, 760, 32, 13);
		panel_11.add(lblNewLabel_6_8);
		
		JLabel lblNewLabel_6_9 = new JLabel("3");
		lblNewLabel_6_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_9.setBounds(44, 820, 32, 13);
		panel_11.add(lblNewLabel_6_9);
	          
		JLabel lblNewLabel_6_10 = new JLabel("2");
		lblNewLabel_6_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_10.setBounds(44, 880, 32, 13);
		panel_11.add(lblNewLabel_6_10);
		
		JLabel lblNewLabel_6_11 = new JLabel("1");
		lblNewLabel_6_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_11.setBounds(44, 930, 32, 13);
		panel_11.add(lblNewLabel_6_11);
		
		JLabel lblNewLabel_9_1 = new JLabel("Doanh Thu");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9_1.setBounds(1170, 970, 66, 15);
		panel_11.add(lblNewLabel_9_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 selectedYear = (String) comboBox_1.getSelectedItem();
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2023", "2024"}));
		comboBox_1.setBounds(485, 262, 118, 21);
		panel_11.add(comboBox_1);
		
		
		JButton btnNewButton = new JButton("Xác Nhận");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (thongketheo.equals("Theo Tháng") && selectedYear.equals("2023")) {
				doanhthu11.clear();
				opendothithang();
				
				thongketheonam.setVisible(false);
				System.out.println(doanhthu11);
				}else if (thongketheo.equals("Theo Tháng") && selectedYear.equals("2024")) {
					doanhthu11.clear();
					opendothithang2024();
					
					thongketheonam.setVisible(false);
					System.out.println(doanhthu11);
					} else {
					
					panel_3.setVisible(false);
					
					opendothinam();
				}
			}

			private void opendothithang2024() {
				panel_3.setVisible(true);
				lblNewLabel_9.setText("Tháng");
				lblNewLabel_6.setText("12");
				lblNewLabel_6_1.setText("11");
				lblNewLabel_6_2.setText("10");
				lblNewLabel_6_3.setText("9");
				lblNewLabel_6_4.setText("8");
				lblNewLabel_6_5.setText("7");
				lblNewLabel_6_6.setText("6");
				lblNewLabel_6_7.setText("5");
				lblNewLabel_6_8.setText("4");
				lblNewLabel_6_9.setText("3");
				lblNewLabel_6_10.setText("2");
				lblNewLabel_6_11.setText("1");
				panel_3.removeAll();
				
				 JLabel doanhthuthang12 = new JLabel("");
					panel_3.add(doanhthuthang12);
					
					JLabel doanhthuthang11 = new JLabel("");
					
					panel_3.add(doanhthuthang11);
					
					JLabel doanhthuthang10 = new JLabel("");
					
					panel_3.add(doanhthuthang10);
					
					JLabel doanhthuthang9 = new JLabel("");
					
					panel_3.add(doanhthuthang9);
					
					JLabel doanhthuthang8 = new JLabel("");
					
					panel_3.add(doanhthuthang8);
					
					JLabel doanhthuthang7 = new JLabel("");
					
					panel_3.add(doanhthuthang7);
					
					JLabel doanhthuthang6 = new JLabel("");
					
					panel_3.add(doanhthuthang6);
					
					JLabel doanhthuthang5 = new JLabel("");
					
					panel_3.add(doanhthuthang5);
					
					JLabel doanhthuthang4 = new JLabel("");
				
					panel_3.add(doanhthuthang4);
					
					JLabel doanhthuthang3 = new JLabel("");
				
					panel_3.add(doanhthuthang3);
					
					JLabel doanhthuthang2 = new JLabel("");
				
					panel_3.add(doanhthuthang2);
					
					JLabel doanhthuthang1 = new JLabel("");
					
					panel_3.add(doanhthuthang1);
					
					
					 
					
						 Connection con1 = JDBCUtil.getConnection();
			        Statement st1 = null;
					try {
						st1 = con1.createStatement();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        
			        String sql21 = "SELECT * FROM doanhthutheothang Where taikhoanid="+TrangDangNhap.getId()+" AND thangnam LIKE '%/2024' ;";
			        try {
						ResultSet rs11 = st1.executeQuery(sql21);
						while (rs11.next()) {
						  
						    String doanhthu=rs11.getString("doanhthu");
						  doanhthu11.add(doanhthu);
						   
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				   int num12 =Integer.parseInt(doanhthu11.get(0));
				   int num11 =Integer.parseInt(doanhthu11.get(1));
				   int num10 =Integer.parseInt(doanhthu11.get(2));
				   int num9 =Integer.parseInt(doanhthu11.get(3));
				   int num8 =Integer.parseInt(doanhthu11.get(4));
				   int num7 =Integer.parseInt(doanhthu11.get(5));
				   int num6 =Integer.parseInt(doanhthu11.get(6));
				   int num5 =Integer.parseInt(doanhthu11.get(7));
				   int num4 =Integer.parseInt(doanhthu11.get(8));
				   int num3 =Integer.parseInt(doanhthu11.get(9));
				   int num2 =Integer.parseInt(doanhthu11.get(10));
				   int num1 =Integer.parseInt(doanhthu11.get(11));
				   
				   
				    
				    

					
				    double width12 = (num12 / 100000000.0) * 1100;
				    double width11 = (num11 / 100000000.0) * 1100;
				    double width10 = (num10 / 100000000.0) * 1100;
				    double width9 = (num9 / 100000000.0) * 1100;
				    double width8 = (num8 / 100000000.0) * 1100;
				    double width7 = (num7 / 100000000.0) * 1100;
				    double width6 = (num6 / 100000000.0) * 1100;
				    double width5 = (num5 / 100000000.0) * 1100;
				    double width4 = (num4 / 100000000.0) * 1100;
				    double width3 = (num3 / 100000000.0) * 1100;
				    double width2 = (num2 / 100000000.0) * 1100;
				    double width1 = (num1 / 100000000.0) * 1100;

				    doanhthuthang12.setBounds((int) width12 +10, 22, 85, 13);
				    doanhthuthang12.setText(doanhthu11.get(0)+" đ");
				    
				    doanhthuthang11.setBounds((int) width11+10, 75, 85, 13);
				    doanhthuthang11.setText(doanhthu11.get(1)+" đ");
				    
				    doanhthuthang10.setBounds((int) width10+10, 135, 85, 13);
				    doanhthuthang10.setText(doanhthu11.get(2)+" đ");
				    
				    doanhthuthang9.setBounds((int) width9+10, 193, 85, 13);
				    doanhthuthang9.setText(doanhthu11.get(3)+" đ");
				    
				    doanhthuthang8.setBounds((int) width8+10, 251, 85, 13);
				    doanhthuthang8.setText(doanhthu11.get(4)+" đ");
				    
				    doanhthuthang7.setBounds((int) width7+10, 308, 85, 13);
				    doanhthuthang7.setText(doanhthu11.get(5)+" đ");
				    
				    doanhthuthang6.setBounds((int) width6+10, 363, 85, 13);
				    doanhthuthang6.setText(doanhthu11.get(6)+" đ");
				    
				    doanhthuthang5.setBounds((int) width5+10, 414, 85, 13);
				    doanhthuthang5.setText(doanhthu11.get(7)+" đ");
				    
				    doanhthuthang4.setBounds((int) width4+10, 468, 85, 13);
				    doanhthuthang4.setText(doanhthu11.get(8)+" đ");
				    
				    doanhthuthang3.setBounds((int) width3+10, 531, 85, 13);
				    doanhthuthang3.setText(doanhthu11.get(9)+" đ");
				    
				    doanhthuthang2.setBounds((int) width2+10, 590, 85, 13);
				    doanhthuthang2.setText(doanhthu11.get(10)+" đ");
				    
				    doanhthuthang1.setBounds((int) width1+10, 638, 85, 13);
				    doanhthuthang1.setText(doanhthu11.get(11)+" đ");
				    
				    JPanel panel_4 = new JPanel();
				    panel_4.setBackground(Color.RED);
				    panel_4.setBounds(0, 10, (int) width12, 31);
				    panel_3.add(panel_4);
				    
					JPanel panel_5 = new JPanel();
					panel_5.setBackground(Color.ORANGE);
					panel_5.setBounds(0, 69,(int) width11  , 31);
					panel_3.add(panel_5);
					
					JPanel panel_5_1 = new JPanel();
					panel_5_1.setBackground(Color.GREEN);
					panel_5_1.setBounds(0, 129, (int) width10, 31);
					panel_3.add(panel_5_1);
					
					JPanel panel_5_1_1 = new JPanel();
					panel_5_1_1.setBackground(new Color(139, 0, 139));
					panel_5_1_1.setBounds(0, 188, (int) width9, 31);
					panel_3.add(panel_5_1_1);
					
					JPanel panel_5_1_1_1 = new JPanel();
					panel_5_1_1_1.setBackground(Color.GREEN);
					panel_5_1_1_1.setBounds(0, 243, (int) width8, 31);
					panel_3.add(panel_5_1_1_1);
					
					JPanel panel_5_1_1_2 = new JPanel();
					panel_5_1_1_2.setBackground(new Color(0, 255, 255));
					panel_5_1_1_2.setBounds(0, 299, (int) width7, 31);
					panel_3.add(panel_5_1_1_2);
					
					JPanel panel_5_1_1_3 = new JPanel();
					panel_5_1_1_3.setBackground(Color.BLACK);
					panel_5_1_1_3.setBounds(0, 356, (int) width6, 31);
					panel_3.add(panel_5_1_1_3);
					
					JPanel panel_5_1_1_4 = new JPanel();
					panel_5_1_1_4.setBackground(Color.BLUE);
					panel_5_1_1_4.setBounds(0, 407, (int) width5, 31);
					panel_3.add(panel_5_1_1_4);
					
					JPanel panel_5_1_1_5 = new JPanel();
					panel_5_1_1_5.setBackground(Color.DARK_GRAY);
					panel_5_1_1_5.setBounds(0, 460, (int) width4, 31);
					panel_3.add(panel_5_1_1_5);
					
					JPanel panel_5_1_1_6 = new JPanel();
					panel_5_1_1_6.setBackground(Color.cyan);
					panel_5_1_1_6.setBounds(0, 520, (int) width3, 31);
					panel_3.add(panel_5_1_1_6);
					
					JPanel panel_5_2 = new JPanel();
					panel_5_2.setBackground(Color.ORANGE);
					panel_5_2.setBounds(0, 580, (int) width2, 31);
					panel_3.add(panel_5_2);
					
					JPanel panel_4_1 = new JPanel();
					panel_4_1.setBackground(Color.RED);
					panel_4_1.setBounds(0, 635, (int) width1, 31);
					panel_3.add(panel_4_1);
					System.out.println(doanhthu11);
				
				// TODO Auto-generated method stub
				int rong = 1168;
				int dai = 670;
				System.out.println(doanhthu11);
			      
				new Thread(new Runnable() {
					public void run() {
						for (int i=0;i<rong;i++) {
							panel_3.setSize(i,dai);
							try {
								Thread.sleep(1,5);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}).start();
			
				
			}

			private void opendothinam() {
		       doanhthu11.clear();
				// TODO Auto-generated method stub
				lblNewLabel_9.setText("Năm");
				lblNewLabel_6.setText("2034");
				lblNewLabel_6_1.setText("2033");
				lblNewLabel_6_2.setText("2032");
				lblNewLabel_6_3.setText("2031");
				lblNewLabel_6_4.setText("2030");
				lblNewLabel_6_5.setText("2029");
				lblNewLabel_6_6.setText("2028");
				lblNewLabel_6_7.setText("2027");
				lblNewLabel_6_8.setText("2026");
				lblNewLabel_6_9.setText("2025");
				lblNewLabel_6_10.setText("2024");
				lblNewLabel_6_11.setText("2023");
				lblNewLabel_6.setBounds(40, 314, 32, 13);
				lblNewLabel_6_1.setBounds(40, 374, 32, 13);
				lblNewLabel_6_2.setBounds(40, 433, 32, 13);
				lblNewLabel_6_3.setBounds(40, 489, 32, 13);
				lblNewLabel_6_4.setBounds(40, 545, 32, 13);
				lblNewLabel_6_5.setBounds(40, 601, 32, 13);
				lblNewLabel_6_6.setBounds(40, 654, 32, 13);
				lblNewLabel_6_7.setBounds(40, 707, 32, 13);
				lblNewLabel_6_8.setBounds(40, 760, 32, 13);
				lblNewLabel_6_9.setBounds(40, 820, 32, 13);
				lblNewLabel_6_10.setBounds(40, 880, 32, 13);
				lblNewLabel_6_11.setBounds(40, 930, 32, 13);
				
				
				panel_3.setVisible(true);
				
				panel_3.removeAll();
				
				 JLabel doanhthuthang12 = new JLabel("");
					panel_3.add(doanhthuthang12);
					
					JLabel doanhthuthang11 = new JLabel("");
					
					panel_3.add(doanhthuthang11);
					
					JLabel doanhthuthang10 = new JLabel("");
					
					panel_3.add(doanhthuthang10);
					
					JLabel doanhthuthang9 = new JLabel("");
					
					panel_3.add(doanhthuthang9);
					
					JLabel doanhthuthang8 = new JLabel("");
					
					panel_3.add(doanhthuthang8);
					
					JLabel doanhthuthang7 = new JLabel("");
					
					panel_3.add(doanhthuthang7);
					
					JLabel doanhthuthang6 = new JLabel("");
					
					panel_3.add(doanhthuthang6);
					
					JLabel doanhthuthang5 = new JLabel("");
					
					panel_3.add(doanhthuthang5);
					
					JLabel doanhthuthang4 = new JLabel("");
				
					panel_3.add(doanhthuthang4);
					
					JLabel doanhthuthang3 = new JLabel("");
				
					panel_3.add(doanhthuthang3);
					
					JLabel doanhthuthang2 = new JLabel("");
				
					panel_3.add(doanhthuthang2);
					
					JLabel doanhthuthang1 = new JLabel("");
					
					panel_3.add(doanhthuthang1);
					
					
					 
					
						 Connection con1 = JDBCUtil.getConnection();
			        Statement st1 = null;
					try {
						st1 = con1.createStatement();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        
			        String sql21 = "SELECT * FROM doanhthutheonam Where taikhoanid="+TrangDangNhap.getId()+";";
			        try {
						ResultSet rs11 = st1.executeQuery(sql21);
						while (rs11.next()) {
						  
						    String doanhthu=rs11.getString("doanhthu");
						  doanhthu11.add(doanhthu);
						   
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				   int num12 =Integer.parseInt(doanhthu11.get(0));
				   int num11 =Integer.parseInt(doanhthu11.get(1));
				   int num10 =Integer.parseInt(doanhthu11.get(2));
				   int num9 =Integer.parseInt(doanhthu11.get(3));
				   int num8 =Integer.parseInt(doanhthu11.get(4));
				   int num7 =Integer.parseInt(doanhthu11.get(5));
				   int num6 =Integer.parseInt(doanhthu11.get(6));
				   int num5 =Integer.parseInt(doanhthu11.get(7));
				   int num4 =Integer.parseInt(doanhthu11.get(8));
				   int num3 =Integer.parseInt(doanhthu11.get(9));
				   int num2 =Integer.parseInt(doanhthu11.get(10));
				   int num1 =Integer.parseInt(doanhthu11.get(11));
				   
				   
				    
				    

					
				    double width12 = (num12 / 1000000000.0) * 1100;
				    double width11 = (num11 / 1000000000.0) * 1100;
				    double width10 = (num10 / 1000000000.0) * 1100;
				    double width9 = (num9 / 1000000000.0) * 1100;
				    double width8 = (num8 / 1000000000.0) * 1100;
				    double width7 = (num7 / 1000000000.0) * 1100;
				    double width6 = (num6 / 1000000000.0) * 1100;
				    double width5 = (num5 / 1000000000.0) * 1100;
				    double width4 = (num4 / 1000000000.0) * 1100;
				    double width3 = (num3 / 1000000000.0) * 1100;
				    double width2 = (num2 / 1000000000.0) * 1100;
				    double width1 = (num1 / 1000000000.0) * 1100;

				    doanhthuthang12.setBounds((int) width12 +10, 22, 85, 13);
				    doanhthuthang12.setText(doanhthu11.get(0)+" đ");
				    
				    doanhthuthang11.setBounds((int) width11+10, 75, 85, 13);
				    doanhthuthang11.setText(doanhthu11.get(1)+" đ");
				    
				    doanhthuthang10.setBounds((int) width10+10, 135, 85, 13);
				    doanhthuthang10.setText(doanhthu11.get(2)+" đ");
				    
				    doanhthuthang9.setBounds((int) width9+10, 193, 85, 13);
				    doanhthuthang9.setText(doanhthu11.get(3)+" đ");
				    
				    doanhthuthang8.setBounds((int) width8+10, 251, 85, 13);
				    doanhthuthang8.setText(doanhthu11.get(4)+" đ");
				    
				    doanhthuthang7.setBounds((int) width7+10, 308, 85, 13);
				    doanhthuthang7.setText(doanhthu11.get(5)+" đ");
				    
				    doanhthuthang6.setBounds((int) width6+10, 363, 85, 13);
				    doanhthuthang6.setText(doanhthu11.get(6)+" đ");
				    
				    doanhthuthang5.setBounds((int) width5+10, 414, 85, 13);
				    doanhthuthang5.setText(doanhthu11.get(7)+" đ");
				    
				    doanhthuthang4.setBounds((int) width4+10, 468, 85, 13);
				    doanhthuthang4.setText(doanhthu11.get(8)+" đ");
				    
				    doanhthuthang3.setBounds((int) width3+10, 531, 85, 13);
				    doanhthuthang3.setText(doanhthu11.get(9)+" đ");
				    
				    doanhthuthang2.setBounds((int) width2+10, 590, 85, 13);
				    doanhthuthang2.setText(doanhthu11.get(10)+" đ");
				    
				    doanhthuthang1.setBounds((int) width1+10, 638, 85, 13);
				    doanhthuthang1.setText(doanhthu11.get(11)+" đ");
				    
				    JPanel panel_4 = new JPanel();
				    panel_4.setBackground(Color.RED);
				    panel_4.setBounds(0, 10, (int) width12, 31);
				    panel_3.add(panel_4);
				    
					JPanel panel_5 = new JPanel();
					panel_5.setBackground(Color.ORANGE);
					panel_5.setBounds(0, 69,(int) width11  , 31);
					panel_3.add(panel_5);
					
					JPanel panel_5_1 = new JPanel();
					panel_5_1.setBackground(Color.GREEN);
					panel_5_1.setBounds(0, 129, (int) width10, 31);
					panel_3.add(panel_5_1);
					
					JPanel panel_5_1_1 = new JPanel();
					panel_5_1_1.setBackground(new Color(139, 0, 139));
					panel_5_1_1.setBounds(0, 188, (int) width9, 31);
					panel_3.add(panel_5_1_1);
					
					JPanel panel_5_1_1_1 = new JPanel();
					panel_5_1_1_1.setBackground(Color.GREEN);
					panel_5_1_1_1.setBounds(0, 243, (int) width8, 31);
					panel_3.add(panel_5_1_1_1);
					
					JPanel panel_5_1_1_2 = new JPanel();
					panel_5_1_1_2.setBackground(new Color(0, 255, 255));
					panel_5_1_1_2.setBounds(0, 299, (int) width7, 31);
					panel_3.add(panel_5_1_1_2);
					
					JPanel panel_5_1_1_3 = new JPanel();
					panel_5_1_1_3.setBackground(Color.BLACK);
					panel_5_1_1_3.setBounds(0, 356, (int) width6, 31);
					panel_3.add(panel_5_1_1_3);
					
					JPanel panel_5_1_1_4 = new JPanel();
					panel_5_1_1_4.setBackground(Color.BLUE);
					panel_5_1_1_4.setBounds(0, 407, (int) width5, 31);
					panel_3.add(panel_5_1_1_4);
					
					JPanel panel_5_1_1_5 = new JPanel();
					panel_5_1_1_5.setBackground(Color.DARK_GRAY);
					panel_5_1_1_5.setBounds(0, 460, (int) width4, 31);
					panel_3.add(panel_5_1_1_5);
					
					JPanel panel_5_1_1_6 = new JPanel();
					panel_5_1_1_6.setBackground(Color.cyan);
					panel_5_1_1_6.setBounds(0, 520, (int) width3, 31);
					panel_3.add(panel_5_1_1_6);
					
					JPanel panel_5_2 = new JPanel();
					panel_5_2.setBackground(Color.ORANGE);
					panel_5_2.setBounds(0, 580, (int) width2, 31);
					panel_3.add(panel_5_2);
					
					JPanel panel_4_1 = new JPanel();
					panel_4_1.setBackground(Color.RED);
					panel_4_1.setBounds(0, 635, (int) width1, 31);
					panel_3.add(panel_4_1);
					System.out.println(doanhthu11);
				
				// TODO Auto-generated method stub
				int rong = 1168;
				int dai = 670;
				System.out.println(doanhthu11);
			      
				new Thread(new Runnable() {
					public void run() {
						for (int i=0;i<rong;i++) {
							panel_3.setSize(i,dai);
							try {
								Thread.sleep(1,5);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}).start();
				
			}

			private void opendothithang() {
				
				panel_3.setVisible(true);
				lblNewLabel_9.setText("Tháng");
				lblNewLabel_6.setText("12");
				lblNewLabel_6_1.setText("11");
				lblNewLabel_6_2.setText("10");
				lblNewLabel_6_3.setText("9");
				lblNewLabel_6_4.setText("8");
				lblNewLabel_6_5.setText("7");
				lblNewLabel_6_6.setText("6");
				lblNewLabel_6_7.setText("5");
				lblNewLabel_6_8.setText("4");
				lblNewLabel_6_9.setText("3");
				lblNewLabel_6_10.setText("2");
				lblNewLabel_6_11.setText("1");
				panel_3.removeAll();
				
				 JLabel doanhthuthang12 = new JLabel("");
					panel_3.add(doanhthuthang12);
					
					JLabel doanhthuthang11 = new JLabel("");
					
					panel_3.add(doanhthuthang11);
					
					JLabel doanhthuthang10 = new JLabel("");
					
					panel_3.add(doanhthuthang10);
					
					JLabel doanhthuthang9 = new JLabel("");
					
					panel_3.add(doanhthuthang9);
					
					JLabel doanhthuthang8 = new JLabel("");
					
					panel_3.add(doanhthuthang8);
					
					JLabel doanhthuthang7 = new JLabel("");
					
					panel_3.add(doanhthuthang7);
					
					JLabel doanhthuthang6 = new JLabel("");
					
					panel_3.add(doanhthuthang6);
					
					JLabel doanhthuthang5 = new JLabel("");
					
					panel_3.add(doanhthuthang5);
					
					JLabel doanhthuthang4 = new JLabel("");
				
					panel_3.add(doanhthuthang4);
					
					JLabel doanhthuthang3 = new JLabel("");
				
					panel_3.add(doanhthuthang3);
					
					JLabel doanhthuthang2 = new JLabel("");
				
					panel_3.add(doanhthuthang2);
					
					JLabel doanhthuthang1 = new JLabel("");
					
					panel_3.add(doanhthuthang1);
					
					
					 
					
						 Connection con1 = JDBCUtil.getConnection();
			        Statement st1 = null;
					try {
						st1 = con1.createStatement();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        
			        String sql21 = "SELECT * FROM doanhthutheothang Where taikhoanid="+TrangDangNhap.getId()+" AND thangnam LIKE '%/2023' ;";
			        try {
						ResultSet rs11 = st1.executeQuery(sql21);
						while (rs11.next()) {
						  
						    String doanhthu=rs11.getString("doanhthu");
						  doanhthu11.add(doanhthu);
						   
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				   int num12 =Integer.parseInt(doanhthu11.get(0));
				   int num11 =Integer.parseInt(doanhthu11.get(1));
				   int num10 =Integer.parseInt(doanhthu11.get(2));
				   int num9 =Integer.parseInt(doanhthu11.get(3));
				   int num8 =Integer.parseInt(doanhthu11.get(4));
				   int num7 =Integer.parseInt(doanhthu11.get(5));
				   int num6 =Integer.parseInt(doanhthu11.get(6));
				   int num5 =Integer.parseInt(doanhthu11.get(7));
				   int num4 =Integer.parseInt(doanhthu11.get(8));
				   int num3 =Integer.parseInt(doanhthu11.get(9));
				   int num2 =Integer.parseInt(doanhthu11.get(10));
				   int num1 =Integer.parseInt(doanhthu11.get(11));
				   
				   
				    
				    

					
				    double width12 = (num12 / 100000000.0) * 1100;
				    double width11 = (num11 / 100000000.0) * 1100;
				    double width10 = (num10 / 100000000.0) * 1100;
				    double width9 = (num9 / 100000000.0) * 1100;
				    double width8 = (num8 / 100000000.0) * 1100;
				    double width7 = (num7 / 100000000.0) * 1100;
				    double width6 = (num6 / 100000000.0) * 1100;
				    double width5 = (num5 / 100000000.0) * 1100;
				    double width4 = (num4 / 100000000.0) * 1100;
				    double width3 = (num3 / 100000000.0) * 1100;
				    double width2 = (num2 / 100000000.0) * 1100;
				    double width1 = (num1 / 100000000.0) * 1100;

				    doanhthuthang12.setBounds((int) width12 +10, 22, 85, 13);
				    doanhthuthang12.setText(doanhthu11.get(0)+" đ");
				    
				    doanhthuthang11.setBounds((int) width11+10, 75, 85, 13);
				    doanhthuthang11.setText(doanhthu11.get(1)+" đ");
				    
				    doanhthuthang10.setBounds((int) width10+10, 135, 85, 13);
				    doanhthuthang10.setText(doanhthu11.get(2)+" đ");
				    
				    doanhthuthang9.setBounds((int) width9+10, 193, 85, 13);
				    doanhthuthang9.setText(doanhthu11.get(3)+" đ");
				    
				    doanhthuthang8.setBounds((int) width8+10, 251, 85, 13);
				    doanhthuthang8.setText(doanhthu11.get(4)+" đ");
				    
				    doanhthuthang7.setBounds((int) width7+10, 308, 85, 13);
				    doanhthuthang7.setText(doanhthu11.get(5)+" đ");
				    
				    doanhthuthang6.setBounds((int) width6+10, 363, 85, 13);
				    doanhthuthang6.setText(doanhthu11.get(6)+" đ");
				    
				    doanhthuthang5.setBounds((int) width5+10, 414, 85, 13);
				    doanhthuthang5.setText(doanhthu11.get(7)+" đ");
				    
				    doanhthuthang4.setBounds((int) width4+10, 468, 85, 13);
				    doanhthuthang4.setText(doanhthu11.get(8)+" đ");
				    
				    doanhthuthang3.setBounds((int) width3+10, 531, 85, 13);
				    doanhthuthang3.setText(doanhthu11.get(9)+" đ");
				    
				    doanhthuthang2.setBounds((int) width2+10, 590, 85, 13);
				    doanhthuthang2.setText(doanhthu11.get(10)+" đ");
				    
				    doanhthuthang1.setBounds((int) width1+10, 638, 85, 13);
				    doanhthuthang1.setText(doanhthu11.get(11)+" đ");
				    
				    JPanel panel_4 = new JPanel();
				    panel_4.setBackground(Color.RED);
				    panel_4.setBounds(0, 10, (int) width12, 31);
				    panel_3.add(panel_4);
				    
					JPanel panel_5 = new JPanel();
					panel_5.setBackground(Color.ORANGE);
					panel_5.setBounds(0, 69,(int) width11  , 31);
					panel_3.add(panel_5);
					
					JPanel panel_5_1 = new JPanel();
					panel_5_1.setBackground(Color.GREEN);
					panel_5_1.setBounds(0, 129, (int) width10, 31);
					panel_3.add(panel_5_1);
					
					JPanel panel_5_1_1 = new JPanel();
					panel_5_1_1.setBackground(new Color(139, 0, 139));
					panel_5_1_1.setBounds(0, 188, (int) width9, 31);
					panel_3.add(panel_5_1_1);
					
					JPanel panel_5_1_1_1 = new JPanel();
					panel_5_1_1_1.setBackground(Color.GREEN);
					panel_5_1_1_1.setBounds(0, 243, (int) width8, 31);
					panel_3.add(panel_5_1_1_1);
					
					JPanel panel_5_1_1_2 = new JPanel();
					panel_5_1_1_2.setBackground(new Color(0, 255, 255));
					panel_5_1_1_2.setBounds(0, 299, (int) width7, 31);
					panel_3.add(panel_5_1_1_2);
					
					JPanel panel_5_1_1_3 = new JPanel();
					panel_5_1_1_3.setBackground(Color.BLACK);
					panel_5_1_1_3.setBounds(0, 356, (int) width6, 31);
					panel_3.add(panel_5_1_1_3);
					
					JPanel panel_5_1_1_4 = new JPanel();
					panel_5_1_1_4.setBackground(Color.BLUE);
					panel_5_1_1_4.setBounds(0, 407, (int) width5, 31);
					panel_3.add(panel_5_1_1_4);
					
					JPanel panel_5_1_1_5 = new JPanel();
					panel_5_1_1_5.setBackground(Color.DARK_GRAY);
					panel_5_1_1_5.setBounds(0, 460, (int) width4, 31);
					panel_3.add(panel_5_1_1_5);
					
					JPanel panel_5_1_1_6 = new JPanel();
					panel_5_1_1_6.setBackground(Color.cyan);
					panel_5_1_1_6.setBounds(0, 520, (int) width3, 31);
					panel_3.add(panel_5_1_1_6);
					
					JPanel panel_5_2 = new JPanel();
					panel_5_2.setBackground(Color.ORANGE);
					panel_5_2.setBounds(0, 580, (int) width2, 31);
					panel_3.add(panel_5_2);
					
					JPanel panel_4_1 = new JPanel();
					panel_4_1.setBackground(Color.RED);
					panel_4_1.setBounds(0, 635, (int) width1, 31);
					panel_3.add(panel_4_1);
					System.out.println(doanhthu11);
				
				// TODO Auto-generated method stub
				int rong = 1168;
				int dai = 670;
				System.out.println(doanhthu11);
			      
				new Thread(new Runnable() {
					public void run() {
						for (int i=0;i<rong;i++) {
							panel_3.setSize(i,dai);
							try {
								Thread.sleep(1,5);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}).start();
			}
		});
		btnNewButton.setBounds(613, 264, 107, 21);
		panel_11.add(btnNewButton);
		
		
		
	
	}
}
