package Interface1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class ThongTinNguoiDung extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private String formattedTime;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTinNguoiDung frame = new ThongTinNguoiDung();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ThongTinNguoiDung() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/th (2).jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 536, 585);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 51, 522, 493);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Thông tin người dùng");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(145, 42, 239, 41);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tên Chủ Tài Khoản :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 93, 209, 22);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ngày Sinh :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 154, 209, 22);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Email :");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(10, 213, 209, 22);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Số Điện Thoại :");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(10, 274, 209, 22);
		panel.add(lblNewLabel_2_3);
		
		textField = new JTextField();
		textField.setBounds(10, 125, 316, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 184, 316, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 245, 316, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 306, 316, 19);
		panel.add(textField_3);
		
		JLabel lblNewLabel_3 = new JLabel("Chào Mừng Bạn Đến Với Revenue Management");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(61, 10, 406, 32);
		panel.add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Bằng cách nhấn vào đây, tôi đã đồng ý với các điều khoản trên");
		chckbxNewCheckBox.setBounds(10, 435, 467, 21);
		panel.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Điều Khoản");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 408, 153, 21);
		panel.add(btnNewButton);
		
		JButton btnXcNhn = new JButton("Xác Nhận");
		btnXcNhn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Vui Lòng Nhập Đầy Đủ Thông Tin!", "Thông báo", JOptionPane.ERROR_MESSAGE);
		        } else {
		        
		            Connection con = JDBCUtil.getConnection();
		            Statement st = null;
		            Statement statement = null;
		            Statement statement1 = null;
		            Statement statement2 = null;
		            Statement statement3 = null;
		            try {
		                st = con.createStatement();
		            } catch (SQLException e1) {
		                e1.printStackTrace();
		            }

		            String sql = "INSERT INTO thongtin VALUES(" + TrangDangNhap.getId() + ",'" + getCurrentTime1() + "','" + textField.getText() + "','" + textField_1.getText() + "','" + textField_2.getText() + "','" + textField_3.getText() + "');";

		            try {
		                st.executeUpdate(sql);
		            } catch (SQLException e1) {
		                e1.printStackTrace();
		            }
		            int taikhoanid = TrangDangNhap.getId();
		            int year = 2023;
		            int year2 = 2024;
		            int month = 12;
		            int doanhthu = 0;
		            int loinhuan=0;
		            String sql12 = "INSERT INTO doanhthutheonam (taikhoanid, nam, doanhthu) VALUES (" + taikhoanid + ",'2024', " + doanhthu + ")";
		            String sql123 = "INSERT INTO doanhthutheonam (taikhoanid, nam, doanhthu) VALUES (" + taikhoanid + ",'2023', " + doanhthu + ")";
		            try {
		                statement1 = con.createStatement();
		                statement2 = con.createStatement();
		                statement1.executeUpdate(sql12);
		                statement2.executeUpdate(sql123);
		            } catch (SQLException e1) {
		                e1.printStackTrace();
		            }
		            for (int i = 12; i >0; i--) {
		                String thangnam = String.format("%02d/%04d", i, year);
		                String sql1 = "INSERT INTO doanhthutheothang (taikhoanid, thangnam, doanhthu) VALUES (" + taikhoanid + ", '" + thangnam + "', " + doanhthu + ")";
		                try {
		                	 statement = con.createStatement();
		                    statement.executeUpdate(sql1);
		                } catch (SQLException e1) {
		                    e1.printStackTrace();
		                }
		                
		            }
		            for (int i = 12; i >0; i--) {
		                String thangnam = String.format("%02d/%04d", i, year2);
		                String sql1 = "INSERT INTO doanhthutheothang (taikhoanid, thangnam, doanhthu) VALUES (" + taikhoanid + ", '" + thangnam + "', " + doanhthu +","+loinhuan+ ")";
		                try {
		                	 statement = con.createStatement();
		                    statement.executeUpdate(sql1);
		                } catch (SQLException e1) {
		                    e1.printStackTrace();
		                }
		                
		                for (int i1 = 2034; i1 >2022; i1--) {
			                
			                String sql3 = "INSERT INTO doanhthutheonam (taikhoanid, nam, doanhthu, loinhuan) VALUES (" + taikhoanid + ", '" + i1 + "', " + doanhthu +","+loinhuan+ ")";
			                try {
			                	 statement3 = con.createStatement();
			                    statement3.executeUpdate(sql3);
			                } catch (SQLException e1) {
			                    e1.printStackTrace();
			                }}
		                
		            }
		        }  TrangChuTests.main(null);
		        dispose();
		    }
		});
		btnXcNhn.setForeground(Color.WHITE);
		btnXcNhn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnXcNhn.setBackground(new Color(30, 144, 255));
		btnXcNhn.setBounds(389, 462, 123, 21);
		panel.add(btnXcNhn);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Số Vốn Bạn Đang Có :");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_3_1.setBounds(10, 339, 209, 22);
		panel.add(lblNewLabel_2_3_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 379, 316, 19);
		panel.add(textField_4);
		
		JLabel lblNewLabel = new JLabel("Revenue Management");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(0, 0, 341, 48);
		contentPane.add(lblNewLabel);
	}
	public static String getCurrentTime1() {
	    long currentTimeMillis = System.currentTimeMillis();
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date currentTime = new Date(currentTimeMillis);
	    return dateFormat.format(currentTime);
	}
}
