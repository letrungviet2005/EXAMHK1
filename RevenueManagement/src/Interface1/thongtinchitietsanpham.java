package Interface1;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class thongtinchitietsanpham extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
    private static  String  selectedValue;
    private static int SoLuong;
    private static  int GiaNhap;
    private static  int GiaBan;
    private static  String TenSanPham;
    
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thongtinchitietsanpham frame = new thongtinchitietsanpham();
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
	public thongtinchitietsanpham() {
		 ArrayList<DuLieuMenu> list1 = DuLieuMenuDao.getinstance().selecta();
		 ArrayList<String> danhmuc = new ArrayList<String>();
		  
		 
		 for (DuLieuMenu dulieumenu : list1) {
			 danhmuc.add(dulieumenu.getTenMon());
		 }
		 setIconImage(Toolkit.getDefaultToolkit().getImage("images/th (2).jpg"));
		setTitle("Thông Tin");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 300, 644, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 43, 630, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Hủy Bỏ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(420, 269, 85, 21);
		panel.add(btnNewButton);
		
	
		
		JLabel lblNewLabel_1 = new JLabel("Tên Sản Phẩm :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 10, 115, 19);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 39, 277, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		
		
        JComboBox comboBox = new JComboBox();
		
		comboBox.setModel(new DefaultComboBoxModel<>(new Vector<>(danhmuc)));
		comboBox.setBounds(345, 38, 231, 19);
		panel.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {
		        // Lấy dữ liệu được chọn trong JComboBox
		         selectedValue = comboBox.getSelectedItem().toString();

		       ;
		    }
		});
		JLabel lblNewLabel_1_2 = new JLabel("Giá nhập :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(10, 73, 115, 19);
		panel.add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 102, 277, 19);
		panel.add(textField_1);
		
		
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Giá bán :");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_1.setBounds(10, 131, 115, 19);
		panel.add(lblNewLabel_1_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 161, 277, 19);
		panel.add(textField_2);
	
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Số Lượng");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_1_1.setBounds(10, 190, 115, 19);
		panel.add(lblNewLabel_1_2_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 219, 277, 19);
		panel.add(textField_3);
		
	
	
		
		JLabel lblNewLabel_1_1 = new JLabel("Loại Sản Phẩm");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(345, 10, 115, 19);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("Thông Tin Chi Tiết Sản Phẩm");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 0, 376, 46);
		contentPane.add(lblNewLabel);
		
		JButton btnXcNhn = new JButton("Xác Nhận");
		btnXcNhn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection connection = JDBCUtil.getConnection();
					 SoLuong= Integer.parseInt(textField_3.getText());
				
					 GiaBan= Integer.parseInt(textField_2.getText());
					 GiaNhap= Integer.parseInt(textField_1.getText());
					 TenSanPham = textField.getText();
					if ( SoLuong!=0 && GiaBan!=0 && GiaNhap!=0 && TenSanPham!=null) {
					String sql="INSERT INTO sanpham(taikhoanid,Ten,LoaiSanPham,GiaNhap,GiaBan,SL) VALUES(?,?,?,?,?,?);";
					
					PreparedStatement statement = connection.prepareStatement(sql);
					statement.setInt(1,TrangDangNhap.getId() );
					statement.setString(2,TenSanPham );
					statement.setString(3, selectedValue  );
					statement.setInt(4,GiaNhap);
					statement.setInt(5,GiaBan);
					statement.setInt(6,SoLuong);
					statement.executeUpdate();
					dispose();
					} else { 
						JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!",
			                    "Thông báo", JOptionPane.ERROR_MESSAGE);
					}
				} catch (NumberFormatException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng số định dạng!",
		                    "Thông báo", JOptionPane.ERROR_MESSAGE);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXcNhn.setForeground(Color.WHITE);
		btnXcNhn.setBackground(new Color(30, 144, 255));
		btnXcNhn.setBounds(515, 269, 92, 21);
		panel.add(btnXcNhn);
	}
	public static  String getSelectedValue() {
		return selectedValue;
	}

	public void  setSelectedValue(String selectedValue) {
		this.selectedValue = selectedValue;
	}

	public static int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public static  int getGiaNhap() {
		return GiaNhap;
	}

	public void setGiaNhap(int giaNhap) {
		GiaNhap = giaNhap;
	}

	public static  int getGiaBan() {
		return GiaBan;
	}

	public void setGiaBan(int giaBan) {
		GiaBan = giaBan;
	}

	public static  String getTenSanPham() {
		return TenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		TenSanPham = tenSanPham;
	}
}
