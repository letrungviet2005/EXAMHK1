package Interface1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class thongtindulieumathang extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
    private String TenMatHang;
	

	public void setTenMatHang(String tenMatHang) {
		TenMatHang = tenMatHang;
	}
	public String getTenMatHang() {
		return TenMatHang;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thongtindulieumathang frame = new thongtindulieumathang();
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
	public thongtindulieumathang() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/th (2).jpg"));
		setTitle("Thông Tin");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 300, 644, 327);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 43, 630, 263);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tên Danh Mục :\r\n\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 10, 143, 24);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 44, 406, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ngày Cấp :\r\n");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 73, 143, 24);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 107, 406, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("Số Lượng Đơn Hàng Danh Mục Có Thể Chứa:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(10, 137, 290, 17);
		panel.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 171, 406, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton HuyBo = new JButton("Hủy Bỏ\r\n");
		HuyBo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		HuyBo.setBackground(new Color(30, 144, 255));
		HuyBo.setForeground(new Color(255, 255, 255));
		HuyBo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		HuyBo.setBounds(432, 201, 85, 21);
		panel.add(HuyBo);
		
		JButton XacNhan = new JButton("Xác Nhận");
		XacNhan.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	try {
					TrangChuTests n = new TrangChuTests();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        setTenMatHang(textField.getText());
		       

		        Connection con = JDBCUtil.getConnection();
		        Statement st1 = null; // Khởi tạo biến st1 với giá trị null
		        try {
		            st1 = con.createStatement();
		            String sql1 = "INSERT INTO thucdon(taikhoanid, DanhMucThucPham, NgayThang, SoLuongDonHang) VALUES (\"" + TrangDangNhap.getId() + "\", \"" + textField.getText() + "\", " + textField_1.getText() + ", " + textField_2.getText() + ")";
		            st1.execute(sql1);
		        } catch (SQLException e1) {
		            e1.printStackTrace();
		        } dispose();
		        
		    }
		});
		XacNhan.setBackground(new Color(30, 144, 255));
		XacNhan.setForeground(new Color(255, 255, 255));
		XacNhan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		XacNhan.setBounds(527, 201, 85, 21);
		panel.add(XacNhan);
		
		JLabel lblNewLabel = new JLabel("Thông Tin Chi Tiết Danh Muc Thực Phẩm\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 10, 422, 23);
		contentPane.add(lblNewLabel);
		
	}
	private void closeframe() {
		
	}
}
