package Interface1;
import java.awt.Color;


import javax.swing.KeyStroke;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 */
public class TrangDangNhap {

	private static String all1; // Make all1 variable static
	private static String email2;
	private static String pass2;
    private static int id;

    private static String DuLieuAnh;
    public static String getDuLieuAnh() {
        return DuLieuAnh;
    }

    public static void setDuLieuAnh(String duLieuAnh) {
        DuLieuAnh = duLieuAnh;
    }
	public static void main(String[] args) {

        JFrame frame = new JFrame("Revenue Management");
        frame.setSize(800, 500);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/th (2).jpg"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null); // Disable layout manager
        frame.getContentPane().setBackground(new Color(255, 255, 240));
        
        JLabel lblNewLabel = new JLabel("Revenue Management");
        lblNewLabel.setForeground(new Color(148, 0, 211));
        lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 35));
        lblNewLabel.setBounds(50, 102, 371, 87);
        frame.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Revenue Management giúp bạn quản lý doanh thu");
        lblNewLabel_1.setForeground(new Color(0, 0, 128));
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
        lblNewLabel_1.setBounds(50, 200, 390, 25);
        frame.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("dễ dàng hơn.");
        lblNewLabel_2.setForeground(new Color(0, 0, 128));
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 19));
        lblNewLabel_2.setBounds(50, 225, 245, 39);
        frame.add(lblNewLabel_2);

        JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(475, 102, 274, 262);
	    frame.add(panel);
		panel.setLayout(null);
		
		JTextField email = new JTextField();
		email.setToolTipText("email hoặc số điện thoại");
		email.setBounds(10, 21, 254, 25);
		panel.add(email);
		email.setColumns(10);
		
		JTextField passworld = new JTextField();
		passworld.setToolTipText("mật khẩu");
		passworld.setBounds(10, 56, 254, 25);
		panel.add(passworld);
		passworld.setColumns(10);
		
		JButton DangNhap = new JButton("Đăng nhập");
		DangNhap.setForeground(new Color(255, 255, 255));
		DangNhap.setFont(new Font("Verdana", Font.PLAIN, 19));
		DangNhap.setBackground(new Color(0, 0, 255));
		DangNhap.setBounds(10, 102, 254, 35);
		panel.add(DangNhap);
		
		JButton TroGiup = new JButton("Trợ Giúp?");
		TroGiup.setForeground(Color.WHITE);
		TroGiup.setBackground(Color.BLUE);
		TroGiup.setBounds(81, 147, 117, 21);
		panel.add(TroGiup);
		
		JLabel lblNewLabel_3 = new JLabel("---------------------------------------------------------------");
		lblNewLabel_3.setForeground(new Color(128, 128, 128));
		lblNewLabel_3.setBounds(10, 180, 254, 13);
		panel.add(lblNewLabel_3);
		
		JButton TaoTaiKhoanMoi = new JButton("Tạo tài khoản mới");
		TaoTaiKhoanMoi.setForeground(new Color(255, 255, 255));
		TaoTaiKhoanMoi.setBackground(new Color(50, 205, 50));
		TaoTaiKhoanMoi.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		TaoTaiKhoanMoi.setBounds(55, 203, 173, 35);
		panel.add(TaoTaiKhoanMoi);
		
		JLabel lblNewLabel_4 = new JLabel("Revenue Management quản lý như một chuyên gia .");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(475, 374, 301, 19);
		frame.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Developed by Le Trung Viet");
		lblNewLabel_5.setForeground(new Color(0, 0, 128));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 444, 157, 19);
		frame.add(lblNewLabel_5);
		 all1= email.getText() +" "+ passworld.getText();
		 email2=email.getText();
		 pass2= passworld.getText();
		   DangNhap.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String email1 = email.getText();
	                String pass1 = passworld.getText();
	                 String all = email1 + " "+ pass1;
	                boolean found = false;

	                try {
	                    ArrayList<Thongtin> list = ThongTinDao.getInstance().selectAll();
	                    int i = 1;
	                    if (email1.length() > 0 && pass1.length() > 0) {
	                        for (Thongtin thongtin : list) {
	                            if (thongtin.getTK().equals(all)) {
	                            	id = i;
	                            	DuLieuAnh = ThongTinDao.getDuLieuAnhbyID(list, i);
	                                found = true;
	                                break;
	                            } i++;
	                        }
	                        if (found) {
	                        	  Connection con = JDBCUtil.getConnection();
	              	            Statement st = null;
	              				try {
	              					st = con.createStatement();
	              					String sql2 = "SELECT * FROM thongtin WHERE taikhoanid="+id+";";
	              					 ResultSet rs = st.executeQuery(sql2);
	              					if (rs.next()) {
	              					    TrangChuTests.main(args);
	              					 
	              					    frame.dispose();
	              					} else {
	              					    ThongTinNguoiDung.main(args);
	              					   
	              					    frame.dispose();
	              					}
	              				} catch (SQLException e1) {
	              					// TODO Auto-generated catch block
	              					e1.printStackTrace();
	              				} 
	              				
	                        } else {
	                            
	                            JOptionPane.showMessageDialog(null, "Đăng nhập thất bại. Vui lòng kiểm tra lại email và mật khẩu!",
	                                    "Thông báo", JOptionPane.ERROR_MESSAGE);
	                        }
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Đăng nhập thất bại. Vui lòng nhập đầy đủ email và mật khẩu!",
	                                "Thông báo", JOptionPane.ERROR_MESSAGE);
	                    }
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                    
	                    JOptionPane.showMessageDialog(null, "Lỗi kết nối cơ sở dữ liệu!",
	                            "Thông báo", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });
		   TroGiup.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	
	            	  JOptionPane.showMessageDialog(null, "Vui lòng liên hệ qua gmail vitprofb@gmail.con để nhận được hỗ trợ sớm nhất!",
	                            "Thông báo", JOptionPane.INFORMATION_MESSAGE);
	               
	            }
	        });
		   TaoTaiKhoanMoi.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   
				   TrangTaoTaiKhoan.main(args);
			   }
		   });
	      
        
        frame.setVisible(true);
        frame.setResizable(false);
       
        
    }
    public static String getAll1() {
        return all1;
    }
    public static int getId() {
		return id;
	}
	
	public static void setId(int id) {
		TrangDangNhap.id = id;
	}

    public static void setAll1(String value) {
        all1 = value;
    }
   
    public static String getemail() {
        return email2;
    }

    public static void setemail(String value) {
        email2 = value;
    }
    public static String getpass2() {
        return pass2;
    }

    public static void setpass2(String value) {
        pass2 = value;
    }
    	
    }

