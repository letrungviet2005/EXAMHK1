package Interface1;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Statement;



import java.util.Date;
import java.util.Vector;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFileChooser;
public class TrangChuTests extends JFrame {

	private JPanel contentPane;
	private GridBagConstraints gbc;
	private JPanel panel_6;
	private String selectedImagePath;
	private String GiaTriDuocChon;
	private JTextField TenBanAn10;
	private JTextField ViTri10;
	private JTextField TimKiemBan10;
	private String GiaTriDuocChon1;
	private int rowIndex;
	private TableModel model;
	private static String valuetrangthai;
	private static String valuevitri;
	private int doanhthuthang;
	private int loinhuanthang;
	public static String getValuetrangthai() {
		return valuetrangthai;
	}

	public static void setValuetrangthai(String valuetrangthai) {
		TrangChuTests.valuetrangthai = valuetrangthai;
	}

	public static String getValuevitri() {
		return valuevitri;
	}

	public static void setValuevitri(String valuevitri) {
		TrangChuTests.valuevitri = valuevitri;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChuTests frame = new TrangChuTests();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public TrangChuTests() throws SQLException {
		 ArrayList<DuLieuMenu> list1 = DuLieuMenuDao.getinstance().selecta();
		 ArrayList<String> danhmuc = new ArrayList<String>();
		 ArrayList<String> danhmuc2 = new ArrayList<String>();
		   ArrayList<Thongtin> list2 = ThongTinDao.getInstance().selectAll();
		   ArrayList<DuLieuSanPham> list3 = SanPhamDao.getInstance1().selectAll2();
		   int id =TrangDangNhap.getId();
		 for (DuLieuMenu dulieumenu : list1) {
			 danhmuc.add(dulieumenu.getTenMon());
		 }
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/th (2).jpg"));
		setBounds(150, 75, 1200, 700);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 105, 105));
		panel.setBounds(0, 0, 244, 790);
		contentPane.add(panel);
		panel.setLayout(null);
		String[] items = {"Tổng Quan", "Tài Khoản","Quản Lý Bàn","Thống Kê","Lịch Sử Bàn"};
		JList list = new JList<>(items);
		
			list.setForeground(Color.WHITE);
			list.setBackground(new Color(105, 105, 105));
			list.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		
			list.setBounds(43, 73, 187, 174);
			panel.add(list);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(25, 25, 112));
		panel_1.setBounds(0, 0, 244, 64);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Revenue Management");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
		lblNewLabel.setBounds(0, 10, 239, 55);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setIcon(new ImageIcon("images/anhdaidien.png"));
		lblNewLabel_1.setBounds(10, 108, 35, 29);
		panel.add(lblNewLabel_1);
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(0, 206, 209));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setIcon(new ImageIcon("images/menupic (1).png"));
		lblNewLabel_2.setBounds(9, 72, 35, 35);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
	
		lblNewLabel_2_1.setIcon(new ImageIcon("images/quanlybanmoi.png"));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(11, 140, 171, 30);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("images/thongkeee.png"));
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(11, 173, 31, 30);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_11 = new JLabel("");
		lblNewLabel_2_1_11.setIcon(new ImageIcon("images/lichsu (1).png"));
		lblNewLabel_2_1_11.setForeground(Color.WHITE);
		lblNewLabel_2_1_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_11.setBounds(11, 207, 31, 30);
		panel.add(lblNewLabel_2_1_11);
		
		
		JLabel lblNewLabel_3 = new JLabel("Phiên Bản 1.0");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(0, 750, 179, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Developed by Le Trung Viet");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(0, 765, 179, 20);
		panel.add(lblNewLabel_3_1);
		
	    CardLayout cardlayout = new CardLayout();
		
		JPanel panelcard = new JPanel();
		panelcard.setBounds(248, 59, 1285, 730);
		panelcard.setLayout(cardlayout);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(0 ,0 , 1285, 730);
		panel_8.setLayout(new BorderLayout());
		panel_8.setPreferredSize(new Dimension(1285,900));
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(0, 0, 1285, 730);
		panel_9.setBackground(Color.WHITE);

		panel_9.setLayout(null);
		String tentaikhoan = ThongTinDao.getTenTaiKhoanbyID(list2, id);
		JButton btnNewButton9 = new JButton("Chọn ảnh");
		btnNewButton9.setBackground(new Color(30, 144, 255));
		btnNewButton9.setForeground(Color.WHITE);
		btnNewButton9.setBounds(10, 285, 90, 21);
		panel_9.add(btnNewButton9);
		
		JButton btnNewButton_29_19 = new JButton("Đăng Xuất");
		btnNewButton_29_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        

		           int option = JOptionPane.showOptionDialog(
	                        null,
	                        "Bạn muốn đăng xuất?",
	                        "Xác nhận đăng xuất",
	                        JOptionPane.YES_NO_OPTION,
	                        JOptionPane.QUESTION_MESSAGE,
	                        null,
	                        new Object[]{"Có", "Không"},
	                        "Có"
	                );

	                if (option == JOptionPane.YES_OPTION) {
	                    dispose();
	                    TrangDangNhap.main(null);
	                    JOptionPane.showMessageDialog(
	                            null,
	                            "Bạn đã đăng xuất thành công!"
	                    );
	                    // Thêm mã xử lý đăng xuất ở đây

	                } else if (option == JOptionPane.NO_OPTION) {
	                    JOptionPane.showMessageDialog(
	                            null,
	                            "Bạn đã hủy đăng xuất!"
	                    );
	                    // Thêm mã xử lý khi hủy đăng xuất ở đây
	                }

		   
		    }
			}
		);
		btnNewButton_29_19.setForeground(Color.WHITE);
		btnNewButton_29_19.setBackground(new Color(30, 144, 255));
		btnNewButton_29_19.setBounds(1100, 690, 170, 21);
		panel_9.add(btnNewButton_29_19);
	
		
		JLabel lblNewLabel_49 = new JLabel();
		lblNewLabel_49.setBounds(10, 95, 185, 180);
	
		lblNewLabel_49.setIcon(new ImageIcon(TrangDangNhap.getDuLieuAnh()));
		panel_9.add(lblNewLabel_49);
		
		
		btnNewButton9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        JFileChooser fileChooser = new JFileChooser();
		        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		        FileNameExtensionFilter filter = new FileNameExtensionFilter("Các tệp ảnh", "jpg", "jpeg", "png", "gif");
		        fileChooser.setFileFilter(filter);

		        int result = fileChooser.showOpenDialog(contentPane);
		        if (result == JFileChooser.APPROVE_OPTION) {
		            File selectedFile = fileChooser.getSelectedFile();
		            selectedImagePath = selectedFile.getAbsolutePath();
		            // Bạn có thể thực hiện các thao tác khác với đường dẫn ảnh đã chọn
		            lblNewLabel_49.setIcon(new ImageIcon(selectedImagePath));
		            
		        	Connection connection = JDBCUtil.getConnection();
        			try {
						
						
						
						String sql1= "UPDATE taikhoan "
								+ "SET DuLieuAnh = (?)"
								+ " WHERE ID = "+id+";";
						PreparedStatement statement = connection.prepareStatement(sql1);
						statement.setString(1,selectedImagePath  );
						statement.executeUpdate();
					
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		            
		        }
		    }
		});
		
		
		JLabel lblNewLabel_59 = new JLabel("Thông Tin Tài Khoản\r\n");
		lblNewLabel_59.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_59.setBounds(10, 10, 227, 31);
		panel_9.add(lblNewLabel_59);
		
		JLabel lblNewLabel_69 = new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_69.setForeground(new Color(30, 144, 255));
		lblNewLabel_69.setBounds(10, 66, 1280, 13);
		panel_9.add(lblNewLabel_69);
		
		JLabel lblNewLabel_79 = new JLabel("Tên Tài Khoản         :\r\n");
		lblNewLabel_79.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_79.setBounds(274, 106, 141, 17);
		panel_9.add(lblNewLabel_79);
		
		JLabel lblNewLabel_7_19 = new JLabel("Mật Khẩu                :\r\n\r\n");
		lblNewLabel_7_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7_19.setBounds(274, 139, 146, 17);
		panel_9.add(lblNewLabel_7_19);
		
		JLabel lblNewLabel_7_1_19 = new JLabel("Ngày Tạo Tài Khoản :\r\n");
		lblNewLabel_7_1_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7_1_19.setBounds(274, 172, 139, 23);
		panel_9.add(lblNewLabel_7_1_19);
		
		JLabel lblNewLabel_7_1_1_19 = new JLabel("Tên chủ Tài Khoản   :\r\n");
		lblNewLabel_7_1_1_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7_1_1_19.setBounds(274, 205, 139, 23);
		panel_9.add(lblNewLabel_7_1_1_19);
		
		JTextField textField9 = new JTextField(tentaikhoan);
		textField9.setBounds(418, 107, 357, 19);
		panel_9.add(textField9);
		textField9.setColumns(10);
		textField9.setEditable(false);
		JTextField textField_19 = new JTextField("**************");
		textField_19.setColumns(10);
		textField_19.setBounds(418, 140, 357, 19);
		panel_9.add(textField_19);
		textField_19.setEditable(false);
		
		JTextField textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(418, 176, 357, 19);
		panel_9.add(textField_29);
		textField_29.setEditable(false);
		
		JTextField textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(418, 209, 357, 19);
		panel_9.add(textField_39);
		textField_39.setEditable(false);
		
		
		JButton btnNewButton_19 = new JButton("Xóa ảnh");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_49.setIcon(new ImageIcon("images/th (1).jpg"));
			}
		});
		btnNewButton_19.setBackground(new Color(30, 144, 255));
		btnNewButton_19.setForeground(Color.WHITE);
		btnNewButton_19.setBounds(105, 285, 90, 21);
		panel_9.add(btnNewButton_19);
		
		JLabel lblNewLabel_7_1_1_1_19 = new JLabel("Ngày sinh               :\r\n");
		lblNewLabel_7_1_1_1_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7_1_1_1_19.setBounds(276, 238, 144, 17);
		panel_9.add(lblNewLabel_7_1_1_1_19);
		
		JTextField textField_49 = new JTextField();
		textField_49.setBounds(418, 238, 357, 19);
		panel_9.add(textField_49);
		textField_49.setColumns(10);
		textField_49.setEditable(false);
		
		JButton btnNewButton_29 = new JButton("Chỉnh Sửa Tài Khoản");
		btnNewButton_29.setBackground(new Color(30, 144, 255));
		btnNewButton_29.setForeground(new Color(255, 255, 255));
		btnNewButton_29.setBounds(900, 690, 170, 21);
		panel_9.add(btnNewButton_29);
		
		JLabel lblNewLabel_7_1_1_1_1_19 = new JLabel("Email                      :");
		lblNewLabel_7_1_1_1_1_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7_1_1_1_1_19.setBounds(274, 265, 144, 17);
		panel_9.add(lblNewLabel_7_1_1_1_1_19);
		
		JLabel lblNewLabel_7_1_1_1_1_29 = new JLabel("Số điện thoại           :\r\n");
		lblNewLabel_7_1_1_1_1_29.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7_1_1_1_1_29.setBounds(276, 292, 155, 17);
		panel_9.add(lblNewLabel_7_1_1_1_1_29);
		
		JTextField textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(418, 265, 357, 19);
		panel_9.add(textField_59);
		textField_59.setEditable(false);
		
		JTextField textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(418, 293, 357, 19);
		panel_9.add(textField_69);
		textField_69.setEditable(false);
		
		JLabel lblNewLabel_89 = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_89.setForeground(new Color(30, 144, 255));
		lblNewLabel_89.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_89.setBounds(256, 650, 522, 11);
		panel_9.add(lblNewLabel_89);
		
		JLabel lblNewLabel_699 = new JLabel("Trang Chủ > Danh Mục Tổng Quan");
		lblNewLabel_699.setBounds(1065, 25, 200, 13);
		panel_8.add(lblNewLabel_699);
		
		JLabel lblNewLabel_616 = new JLabel("Trang Chủ > Danh Mục Tài Khoản");
		lblNewLabel_616.setBounds(1065, 25, 195, 13);
		panel_9.add(lblNewLabel_616);
		
		JButton btnNewButton_2_19 = new JButton("Đồng Ý");
		btnNewButton_2_19.setForeground(Color.WHITE);
		btnNewButton_2_19.setBackground(new Color(30, 144, 255));
		btnNewButton_2_19.setBounds(900, 690, 170, 21);
		btnNewButton_2_19.setVisible(false);
		
		panel_9.add(btnNewButton_2_19);
		
		JLabel lblNewLabel_99 = new JLabel("Đang Trong Chế Độ Chỉnh Sửa Tài Khoản");
		lblNewLabel_99.setForeground(new Color(255, 0, 0));
		lblNewLabel_99.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_99.setBounds(448, 81, 237, 16);
		panel_9.add(lblNewLabel_99);
		lblNewLabel_99 .setVisible(false);
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				textField_39.setEditable(true);
				textField_49.setEditable(true);
				textField_59.setEditable(true);
				textField_69.setEditable(true);
				btnNewButton_29.setVisible(false);
				btnNewButton_2_19.setVisible(true);
				lblNewLabel_99 .setVisible(true);
				
				
			}
		});
		btnNewButton_2_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField9.setEditable(false);
			
				textField_29.setEditable(false);
				textField_39.setEditable(false);
				textField_49.setEditable(false);
				textField_59.setEditable(false);
				textField_69.setEditable(false);
				btnNewButton_29.setVisible(true);
				btnNewButton_2_19.setVisible(false);
				lblNewLabel_99 .setVisible(false);
			}
		});
		
		
		//Vi tri can xu ly
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 0, 938, 604);
		panel_10.setLayout(null);
		
		
		
		JLabel lblNewLabel_5910 = new JLabel("Danh Sách Mục Bàn\r\n");
		lblNewLabel_5910.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_5910.setBounds(10, 10, 227, 31);
		panel_10.add(lblNewLabel_5910);
		
		JLabel lblNewLabel_6910 = new JLabel("---------------------------------------------------------------------------");
		lblNewLabel_6910.setForeground(new Color(30, 144, 255));
		lblNewLabel_6910.setBounds(10, 66, 332, 13);
		panel_10.add(lblNewLabel_6910);
		
		JLabel lblNewLabel_69_110 = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_69_110.setForeground(new Color(30, 144, 255));
		lblNewLabel_69_110.setBounds(336, 66, 950, 13);
		panel_10.add(lblNewLabel_69_110);
		
		JLabel lblNewLabel_410 = new JLabel("Thêm bàn ăn mới");
		lblNewLabel_410.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_410.setBounds(10, 82, 112, 17);
		panel_10.add(lblNewLabel_410);
		
		JLabel lblNewLabel_4_110 = new JLabel("Danh sách bàn");
		lblNewLabel_4_110.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_110.setBounds(350, 82, 94, 17);
		panel_10.add(lblNewLabel_4_110);
		
		JPanel panel_210 = new JPanel();
		panel_210.setBackground(Color.WHITE);
		panel_210.setBounds(10, 124, 269, 222);
		panel_10.add(panel_210);
		panel_210.setLayout(null);
		
		JLabel lblNewLabel_510 = new JLabel("Tên bàn ăn :");
		lblNewLabel_510.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_510.setBounds(12, 10, 82, 17);
		panel_210.add(lblNewLabel_510);
		
		TenBanAn10 = new JTextField();
		TenBanAn10.setBounds(10, 52, 240, 25);
		panel_210.add(TenBanAn10);
		TenBanAn10.setColumns(10);
		
		JLabel lblNewLabel_5_110 = new JLabel("Vị trí :");
		lblNewLabel_5_110.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5_110.setBounds(12, 97, 39, 17);
		panel_210.add(lblNewLabel_5_110);
		
		ViTri10 = new JTextField();
		ViTri10.setColumns(10);
		ViTri10.setBounds(10, 139, 240, 25);
		panel_210.add(ViTri10);
		
		JScrollPane scrollPane10 = new JScrollPane();
		scrollPane10.setBounds(323, 167, 900, 500);
		panel_10.add(scrollPane10);
		JTable table10 = new JTable();
        table10.setModel(new DefaultTableModel(
			    new Object[][]{},
			    new String[]{ "Tên Bàn","Vị Trí","Trạng Thái"}
			));

			scrollPane10.setViewportView(table10);
			DefaultTableModel tableModel10 = (DefaultTableModel) table10.getModel();
			
			 ArrayList<ThongTinBan> listthongtinban = ThongTinBanDao.getinstanceBan().selectALLBan();
			  
			   
			   for (ThongTinBan thongtinban : listthongtinban) {
				    tableModel10.addRow(new Object[]{ thongtinban.getTenBan(), thongtinban.getViTri(), thongtinban.getTrangThai()});
				    
				}
			   DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
		            @Override
		            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

		                // Lấy giá trị của ô trong cột "Trạng Thái"
		                String trangThai = (String) table.getValueAt(row, 2);

		                // Thiết lập màu chữ của ô dựa trên giá trị của trạng thái
		                if (trangThai.equals("Dang Su Dung")) {
		                    component.setForeground(Color.GREEN);
		                } else if (trangThai.equals("Con Trong")) {
		                    component.setForeground(Color.RED);
		                }

		                return component;
		            }
		        };

		        // Áp dụng đối tượng TableCellRenderer vào cột "Trạng Thái"
		        table10.getColumnModel().getColumn(2).setCellRenderer(renderer);
			   table10.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
				    @Override
				    
				    public void valueChanged(ListSelectionEvent event) {
				        // Kiểm tra xem sự kiện có phải là sự kiện kết thúc chọn không
				        if (!event.getValueIsAdjusting()) {
				            // Kiểm tra xem có hàng nào được chọn không
				            if (table10.getSelectedRow() != -1) {
				                // Lấy chỉ mục hàng đầu tiên được chọn
				                 rowIndex = table10.getSelectedRow();

				                // Lấy mô hình dữ liệu của JTable
				                 model = table10.getModel();

				                // Lấy dữ liệu từ các ô trong hàng đó
				          
				                  
				            }
				        }
				    }
				});
		JComboBox comboBox10 = new JComboBox();
		comboBox10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GiaTriDuocChon1 = comboBox10.getSelectedItem().toString();
				
			}
		});
		comboBox10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox10.setModel(new DefaultComboBoxModel(new String[] {"Tất Cả Các Bàn", "Đang Sử Dụng", "Còn Trống"}));
		comboBox10.setBounds(320, 113, 430, 21);
		panel_10.add(comboBox10);
		
		
		JButton ChinhSua10 = new JButton("Chỉnh Sửa & Oder");
		ChinhSua10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object valueTrangThai = model.getValueAt(rowIndex, 0);
				Object valueVitri = model.getValueAt(rowIndex, 1);
				valuetrangthai=valueTrangThai.toString();
				valuevitri=valueVitri.toString();
				ChinhSuaThongTinBan.main(null);
			}
		});
		ChinhSua10.setBackground(new Color(30, 144, 255));
		ChinhSua10.setForeground(Color.WHITE);
		ChinhSua10.setBounds(323,680, 145, 21);
		panel_10.add(ChinhSua10);
		
		JLabel lblNewLabel_610 = new JLabel("Trang Chủ > Danh Mục Bàn");
		lblNewLabel_610.setBounds(1100, 25, 163, 13);
		panel_10.add(lblNewLabel_610);
		
		TimKiemBan10 = new JTextField();
		TimKiemBan10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		TimKiemBan10.setBounds(750, 115, 348, 19);
		panel_10.add(TimKiemBan10);
		TimKiemBan10.setColumns(10);
		
		JLabel lblNewLabel_810 = new JLabel("! Vui lòng chọn bàn cần chỉnh sửa");
		lblNewLabel_810.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_810.setBounds(323, 700, 240, 17);
		panel_10.add(lblNewLabel_810);
		
	
		JButton ThemBanMoi = new JButton("+Thêm Bàn");
		ThemBanMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!TenBanAn10.getText().isEmpty() && !ViTri10.getText().isEmpty()) {
				  Connection con1 = JDBCUtil.getConnection();
		            Statement st = null;
					try {
						st = con1.createStatement();
						String sql3 = "INSERT INTO quanlyban VALUES (" + TrangDangNhap.getId() + ",'" + TenBanAn10.getText() + "','Con Trong','" + ViTri10.getText() + "');";
						 st.executeUpdate(sql3); 
						 JOptionPane.showMessageDialog(null, "Tao Ban Thanh Cong!",
	                             "Thông báo", JOptionPane.INFORMATION_MESSAGE);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					 JOptionPane.showMessageDialog(null, "Vui Long Nhap Day Du Ten Ban Va Vi Tri!",
                             "Thông báo", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		ThemBanMoi.setBackground(new Color(30, 144, 255));
		ThemBanMoi.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ThemBanMoi.setForeground(Color.WHITE);
		ThemBanMoi.setBounds(10, 359, 112, 21);
		panel_10.add(ThemBanMoi);
		
		JButton LamMoi10 = new JButton("Làm Mới");
		LamMoi10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 tableModel10.setRowCount(0); 
				 Connection con10 = JDBCUtil.getConnection();
		            Statement st10 = null;
		            try {
						st10 = con10.createStatement();
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		            String sql10 = "SELECT * FROM quanlyban Where taikhoanid="+TrangDangNhap.getId()+";";
		            try {
						ResultSet rs10 = st10.executeQuery(sql10);
						while (rs10.next()) {
						    int taikhoanid = rs10.getInt("taikhoanid");
						    String TenBan = rs10.getString("TenBan");
						    String TrangThai = rs10.getString("TrangThai");
						    String ViTri = rs10.getString("ViTri");
						   
						    tableModel10.addRow(new Object[]{TenBan,ViTri,TrangThai});
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		LamMoi10.setForeground(Color.WHITE);
		LamMoi10.setBackground(new Color(30, 144, 255));
		LamMoi10.setBounds(323, 136, 94, 21);
		panel_10.add(LamMoi10);
		
		JButton TimKiem10 = new JButton("Tìm Kiếm");
		TimKiem10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 tableModel10.setRowCount(0); 
				 if (GiaTriDuocChon1.equals("Đang Sử Dụng")==true) {
					 Connection con10 = JDBCUtil.getConnection();
			            Statement st10 = null;
			            try {
							st10 = con10.createStatement();
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			            String sql10 = "SELECT * FROM quanlyban Where taikhoanid="+TrangDangNhap.getId()+" AND TrangThai ='Dang Su Dung';";
			            try {
							ResultSet rs10 = st10.executeQuery(sql10);
							while (rs10.next()) {
							    int taikhoanid = rs10.getInt("taikhoanid");
							    String TenBan = rs10.getString("TenBan");
							    String TrangThai = rs10.getString("TrangThai");
							    String ViTri = rs10.getString("ViTri");
							   
							    tableModel10.addRow(new Object[]{TenBan,ViTri,TrangThai});
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				 } else if (GiaTriDuocChon1.equals("Còn Trống")==true) {
					 Connection con10 = JDBCUtil.getConnection();
			            Statement st10 = null;
			            try {
							st10 = con10.createStatement();
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			            String sql10 = "SELECT * FROM quanlyban Where taikhoanid="+TrangDangNhap.getId()+" AND TrangThai ='Con Trong';";
			            try {
							ResultSet rs10 = st10.executeQuery(sql10);
							while (rs10.next()) {
							    int taikhoanid = rs10.getInt("taikhoanid");
							    String TenBan = rs10.getString("TenBan");
							    String TrangThai = rs10.getString("TrangThai");
							    String ViTri = rs10.getString("ViTri");
							   
							    tableModel10.addRow(new Object[]{TenBan,ViTri,TrangThai});
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				 } else {
					 tableModel10.setRowCount(0); 
					 Connection con10 = JDBCUtil.getConnection();
			            Statement st10 = null;
			            try {
							st10 = con10.createStatement();
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			            String sql10 = "SELECT * FROM quanlyban Where taikhoanid="+TrangDangNhap.getId()+";";
			            try {
							ResultSet rs10 = st10.executeQuery(sql10);
							while (rs10.next()) {
							    int taikhoanid = rs10.getInt("taikhoanid");
							    String TenBan = rs10.getString("TenBan");
							    String TrangThai = rs10.getString("TrangThai");
							    String ViTri = rs10.getString("ViTri");
							   
							    tableModel10.addRow(new Object[]{TenBan,ViTri,TrangThai});
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				 }
			}
		});
		TimKiem10.setForeground(Color.WHITE);
		TimKiem10.setBackground(new Color(30, 144, 255));
		TimKiem10.setBounds(1100, 114, 90, 21);
		panel_10.add(TimKiem10);
        
		
		JPanel panel_11 = new panel_11();
	
		//ViTri Panel 111
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setPreferredSize(new Dimension(1265,900));
		panel_2.setLayout(null);
		
		JPanel panel_121 = new panel_12();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(panel_2);
		scrollPane.setBounds(0, 0,938, 604);
		panel_8.add(scrollPane, BorderLayout.CENTER);
        panelcard.add(panel_8,"panel1");
        panelcard.add(panel_9,"panel2");
        panelcard.add(panel_10,"panel3");
        panelcard.add(panel_11,"panel4");
        panelcard.add(panel_121,"panel5");
        contentPane.add(panelcard);
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    JList<String> source = (JList<String>) event.getSource();
                    int selectedIndex = source.getSelectedIndex();

                    // Hiển thị panel tương ứng với mục được chọn
                    cardlayout.show(panelcard, "panel" + (selectedIndex + 1));
                }
            }
        });
        
        
		JLabel lblNewLabel_41111 = new JLabel("Danh Sách Mục Sản Phẩm");
		lblNewLabel_41111.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_41111.setBounds(10, 0, 497, 70);
		panel_2.add(lblNewLabel_41111);
		
		JLabel lblNewLabel_5 = new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_5.setForeground(new Color(0, 0, 255));
		lblNewLabel_5.setBounds(20, 65, 1270, 13);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Thông Tin Danh Mục Sản Phẩm");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(20, 87, 265, 22);
		panel_2.add(lblNewLabel_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 128, 128));
		panel_3.setBounds(10, 134, 281, 70);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 128, 0));
		panel_7.setBounds(0, 0, 73, 70);
		panel_3.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("images/th (10) (1).jpg"));
		lblNewLabel_9.setBounds(0, 0, 73, 70);
		panel_7.add(lblNewLabel_9);
		
		JLabel lblNewLabel_12 = new JLabel("------------------------------------------------\r\n");
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setBounds(83, 32, 198, 13);
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Tổng Doanh Thu Tháng Này \r\n");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_13.setBounds(81, 0, 190, 30);
		panel_3.add(lblNewLabel_13);
	
		   Connection con5 = JDBCUtil.getConnection();
           Statement st5 = null;
			try {
				st5 = con5.createStatement();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

           String sql25 = "SELECT * FROM doanhthutheothang Where taikhoanid="+TrangDangNhap.getId()+" AND thangnam='"+getCurrentMonth()+"/2024';";
           try {
				ResultSet rs15 = st5.executeQuery(sql25);
				while (rs15.next()) {
				    
				    String doanhthu = rs15.getString("doanhthu");
				    String loinhuan = rs15.getString("loinhuan");
				    int num =Integer.parseInt(doanhthu);
				    int num1 =Integer.parseInt(loinhuan);
				   doanhthuthang=num;
				   loinhuanthang = num1;
				  
				
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	
		JLabel TongDoanhThuTheoNgay = new JLabel(":"+doanhthuthang+" VND");
		TongDoanhThuTheoNgay.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TongDoanhThuTheoNgay.setForeground(Color.WHITE);
		TongDoanhThuTheoNgay.setBounds(165, 40, 107, 30);
		panel_3.add(TongDoanhThuTheoNgay);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(47, 79, 79));
		panel_4.setBounds(330, 134, 281, 70);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_7_2 = new JPanel();
		panel_7_2.setBackground(new Color(0, 100, 0));
		panel_7_2.setBounds(0, 0, 73, 70);
		panel_4.add(panel_7_2);
		panel_7_2.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("images/th (11) (1).png"));
		lblNewLabel_10.setBounds(0, 0, 73, 70);
		panel_7_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_12_1 = new JLabel("------------------------------------------------\r\n");
		lblNewLabel_12_1.setForeground(Color.WHITE);
		lblNewLabel_12_1.setBounds(83, 30, 198, 13);
		panel_4.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("Tổng Lợi Nhuận Tháng Này \r\n");
		lblNewLabel_13_1.setForeground(Color.WHITE);
		lblNewLabel_13_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_13_1.setBounds(81, 0, 190, 30);
		panel_4.add(lblNewLabel_13_1);
		
		
		JLabel TongLoiNhuanTheoNgay = new JLabel(":"+loinhuanthang+" VND");
		TongLoiNhuanTheoNgay.setForeground(Color.WHITE);
		TongLoiNhuanTheoNgay.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TongLoiNhuanTheoNgay.setBounds(165, 40, 107, 30);
		panel_4.add(TongLoiNhuanTheoNgay);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.blue);
		panel_5.setBounds(652, 134, 274, 70);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(new Color(46, 139, 87));
		panel_7_1.setBounds(0, 0, 73, 70);
		panel_5.add(panel_7_1);
		panel_7_1.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("images/th (9) (1).png"));
		lblNewLabel_11.setBounds(0, 0, 73, 70);
		panel_7_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12_2 = new JLabel("------------------------------------------------\r\n");
		lblNewLabel_12_2.setForeground(Color.WHITE);
		lblNewLabel_12_2.setBounds(83, 30, 198, 13);
		panel_5.add(lblNewLabel_12_2);
		
		JLabel lblNewLabel_13_2 = new JLabel("Tổng Đơn Hàng Bán Hôm nay\r\n");
		lblNewLabel_13_2.setForeground(Color.WHITE);
		lblNewLabel_13_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_13_2.setBounds(83, 0, 190, 30);
		panel_5.add(lblNewLabel_13_2);
		
		JPanel panel_52 = new JPanel();
		panel_52.setBackground(new Color(220, 20, 60));
		panel_52.setBounds(968, 134, 274, 70);
		panel_2.add(panel_52);
		panel_52.setLayout(null);
		
		JPanel panel_7_12 = new JPanel();
		panel_7_12.setBackground(new Color(46, 139, 87));
		panel_7_12.setBounds(0, 0, 73, 70);
		panel_52.add(panel_7_12);
		panel_7_12.setLayout(null);
		
		JLabel lblNewLabel_112 = new JLabel("");
		lblNewLabel_112.setIcon(new ImageIcon("images/san-pham.png"));
		lblNewLabel_112.setBounds(0, 0, 73, 70);
		panel_7_12.add(lblNewLabel_112);
		
		JLabel lblNewLabel_12_22 = new JLabel("------------------------------------------------\r\n");
		lblNewLabel_12_22.setForeground(Color.WHITE);
		lblNewLabel_12_22.setBounds(83, 30, 198, 13);
		panel_52.add(lblNewLabel_12_22);
		
		JLabel lblNewLabel_13_22 = new JLabel("Sản Phẩm Sắp Hết Hàng\r\n");
		lblNewLabel_13_22.setForeground(Color.WHITE);
		lblNewLabel_13_22.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_13_22.setBounds(83, 0, 190, 30);
		panel_52.add(lblNewLabel_13_22);
		
		int tonkho = ThongTinDao.getDonTonKhobyid(list2, id);
		String strNumber2 = String.valueOf(tonkho);
		JLabel TongDonHangTonKho = new JLabel(":"+strNumber2+"  Đơn");
		TongDonHangTonKho.setForeground(Color.WHITE);
		TongDonHangTonKho.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TongDonHangTonKho.setBounds(183, 40, 90, 30);
		panel_5.add(TongDonHangTonKho);
		// san pham het hang
		ArrayList<Integer> sldonhang = new ArrayList<Integer>();
		   Connection con = JDBCUtil.getConnection();
           Statement st = null;
			try {
				st = con.createStatement();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

           String sql2 = "SELECT *  FROM sanpham Where taikhoanid="+TrangDangNhap.getId()+" AND SL < 20 ;";
           try {
				ResultSet rs1 = st.executeQuery(sql2);
				while (rs1.next()) {
				    int taikhoanid = rs1.getInt("taikhoanid");
				    String Ten = rs1.getString("Ten");
				    String LoaiSanPham = rs1.getString("LoaiSanPham");
				    int GiaNhap=rs1.getInt("GiaNhap");
				    int GiaBan=rs1.getInt("GiaBan");
				    int SL=rs1.getInt("SL");
				    sldonhang.add(SL);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		
		JLabel sanphamhethang = new JLabel(":"+sldonhang.size()+"  Đơn");
		sanphamhethang.setForeground(Color.WHITE);
		sanphamhethang.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sanphamhethang.setBounds(183, 40, 90, 30);
		panel_52.add(sanphamhethang);
		
		
		Label label = new Label("----------------------------------------------------------------------------");
		label.setForeground(new Color(0, 0, 255));
		label.setBounds(10, 218, 324, 13);
		panel_2.add(label);
		
		Label label_1 = new Label("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label_1.setForeground(new Color(0, 0, 255));
		label_1.setBounds(389, 218, 800, 13);
		panel_2.add(label_1);
		
		JLabel lblNewLabel_7 = new JLabel("Danh Mục Thực Phẩm");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setBounds(10, 237, 148, 30);
		panel_2.add(lblNewLabel_7);
		
		JButton ThemMoiDanhMucThucPham = new JButton("+Thêm Mới");
		
	
		ThemMoiDanhMucThucPham.setForeground(new Color(255, 255, 255));
		ThemMoiDanhMucThucPham.setBackground(new Color(30, 144, 255));
		ThemMoiDanhMucThucPham.setBounds(10, 274, 99, 21);
		panel_2.add(ThemMoiDanhMucThucPham);
		
		JLabel lblNewLabel_8 = new JLabel("Chi Tiết");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(385, 241, 87, 22);
		panel_2.add(lblNewLabel_8);
		JComboBox comboBox = new JComboBox();
		
		comboBox.setModel(new DefaultComboBoxModel<>(new Vector<>(danhmuc)));
		comboBox.setBounds(385, 273, 320, 22);
		panel_2.add(comboBox);
		
		
		
		JLabel timkiem = new JLabel("");
		timkiem.setIcon(new ImageIcon("images/TimKiem.png"));
		timkiem.setBounds(1060, 270, 36, 27);
		panel_2.add(timkiem);
		
		JTextField textField = new JTextField();
		
		textField.setBounds(710, 274, 350, 22);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(385, 330, 800, 426);
		panel_2.add(scrollPane1);
		
		  JTable table = new JTable();
		  table.setEnabled(false);
	        table.setModel(new DefaultTableModel(
				    new Object[][]{},
				    new String[]{ "Tên","Loại sản phẩm","Giá nhập","Giá Bán","Số lượng"}
				));

				scrollPane1.setViewportView(table);
				DefaultTableCellRenderer renderer1 = new QuantityCellRenderer();
				table.getColumnModel().getColumn(4).setCellRenderer(renderer1);
				
				DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
			
				 ArrayList<DuLieuSanPham> list4 = SanPhamDao.getInstance1().selectAll2();
				  
				   
				   for (DuLieuSanPham sanpham : list4) {
					    tableModel.addRow(new Object[]{ sanpham.getTen(), sanpham.getLoaiSanPham(), sanpham.getGiaNhap(), sanpham.getGiaBan(), sanpham.getSL()});
					    
					}
		
		JButton btnNewButton_1 = new JButton("+Thêm Mới");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thongtinchitietsanpham.main(null);
				 
				 
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1.setBounds(970, 237, 99, 21);
		panel_2.add(btnNewButton_1);
		final int[] rowCount = { 8 };
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(39, 330, 246, 300);
		 panel_6 = new JPanel();
		scrollPane2.setViewportView(panel_6);

		GridBagLayout gbl_panel_6 = new GridBagLayout();
		panel_6.setLayout(gbl_panel_6);

		
		// Tạo và thêm các JPanel vào panel_6
	

		
		
		
		JLabel time = new JLabel("");
		time.setFont(new Font("Tahoma", Font.PLAIN, 12));
		time.setForeground(Color.WHITE);
		time.setBounds(1400, 0, 141, 31);
		contentPane.add(time);

		Timer timer = new Timer(1000, new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        Date date = new Date();
		        SimpleDateFormat dateFormat = new SimpleDateFormat("  yyyy-MM-dd   HH:mm:ss");
		        String formattedTime = dateFormat.format(date);
		        time.setText(formattedTime);
		     
		    }
		});
		timer.start();
		 int i = list1.size();
		 for (DuLieuMenu dulieumenu : list1) {
			 danhmuc.add(dulieumenu.getTenMon());
		     JPanel childPanel = new JPanel(new GridBagLayout()); // Tạo JPanel con với GridBagLayout
		     childPanel.setBackground(Color.GRAY);
		     
		     // Tạo các thành phần
		     JLabel label3 = new JLabel(dulieumenu.getTenMon());
		     JLabel label1 = new JLabel("Chỉnh Sửa");
		     JLabel label2 = new JLabel("Xóa");
		     label1.setForeground(new Color(255, 255, 255));
		     label2.setForeground(new Color(255, 255, 255));
		     label3.setForeground(new Color(255, 255, 255));
		     
		     // Thiết lập vị trí và kích thước của các thành phần
		     GridBagConstraints gbc = new GridBagConstraints();
		     
		     gbc.gridx = 0; // Cột 0, chứa label3
		     gbc.gridy = 0; // Dòng 0
		     gbc.weightx = 1.0; // 100% chiều ngang
		     gbc.fill = GridBagConstraints.HORIZONTAL;
		     childPanel.add(label3, gbc);
		     
		     gbc.gridx = 1; // Cột 1, chứa label1
		     gbc.gridy = 0;
		     gbc.weightx = 0.0; // Kích thước không co dãn
		     gbc.fill = GridBagConstraints.NONE;
		     gbc.anchor = GridBagConstraints.LINE_END; // Canh phải
		     gbc.insets = new Insets(0, 10, 0, 10); // Khoảng cách
		     childPanel.add(label1, gbc);
		     
		     gbc.gridx = 2; // Cột 2, chứa label2
		     gbc.gridy = 0;
		     gbc.weightx = 0.0; // Kích thước không co dãn
		     gbc.fill = GridBagConstraints.NONE;
		     gbc.anchor = GridBagConstraints.LINE_END; // Canh phải
		     gbc.insets = new Insets(0, 0, 0, 10); // Khoảng cách
		     childPanel.add(label2, gbc);
		     
		     gbc.gridx = 1; // Cột 1
		     gbc.gridy = i;
		     gbc.gridwidth = 2; // Độ rộng 2 cột
		     gbc.fill = GridBagConstraints.HORIZONTAL;
		     gbc.weightx = 1.0; // Lấp đầy không gian chiều ngang
		     gbc.ipady = 10; // Mở rộng chiều cao một chút xíu
		     gbc.insets = new Insets(5, 5, 2, 2); // Khoảng cách giữa các ô
		     panel_6.add(childPanel, gbc); // Thêm JPanel con vào panel_6 với các ràng buộc
		     i++;
		 }
	
		panel_2.add(scrollPane2);
		
		JButton btnNewButton = new JButton("Làm Mới");
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  updatepanel();
				  DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
				  tableModel.setRowCount(0);
				  tableModel.fireTableDataChanged();

				   Connection con = JDBCUtil.getConnection();
		            Statement st = null;
					try {
						st = con.createStatement();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

		            String sql2 = "SELECT * FROM sanpham Where taikhoanid="+TrangDangNhap.getId()+";";
		            try {
						ResultSet rs1 = st.executeQuery(sql2);
						while (rs1.next()) {
						    int taikhoanid = rs1.getInt("taikhoanid");
						    String Ten = rs1.getString("Ten");
						    String LoaiSanPham = rs1.getString("LoaiSanPham");
						    int GiaNhap=rs1.getInt("GiaNhap");
						    int GiaBan=rs1.getInt("GiaBan");
						    int SL=rs1.getInt("SL");
						    tableModel.addRow(new Object[]{Ten,LoaiSanPham,GiaNhap,GiaBan,SL});
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				  
			}
		});
		btnNewButton.setBounds(119, 274, 85, 21);
		panel_2.add(btnNewButton);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(30, 144, 255));
		panel_12.setBounds(1060, 274, 31, 21);
		panel_2.add(panel_12);
		
		JButton btnNewButton_1_1 = new JButton("+ Hủy Bộ Lọc");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  tableModel.setRowCount(0);
				  tableModel.fireTableDataChanged();

				   Connection con = JDBCUtil.getConnection();
		            Statement st = null;
					try {
						st = con.createStatement();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

		            String sql2 = "SELECT * FROM sanpham Where taikhoanid="+TrangDangNhap.getId()+";";
		            try {
						ResultSet rs1 = st.executeQuery(sql2);
						while (rs1.next()) {
						    int taikhoanid = rs1.getInt("taikhoanid");
						    String Ten = rs1.getString("Ten");
						    String LoaiSanPham = rs1.getString("LoaiSanPham");
						    int GiaNhap=rs1.getInt("GiaNhap");
						    int GiaBan=rs1.getInt("GiaBan");
						    int SL=rs1.getInt("SL");
						    tableModel.addRow(new Object[]{Ten,LoaiSanPham,GiaNhap,GiaBan,SL});
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
			});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1_1.setBounds(970, 299, 111, 21);
		panel_2.add(btnNewButton_1_1);
		
		JLabel ThongBao = new JLabel("");
		ThongBao.setIcon(new ImageIcon("C:\\Users\\anhtu\\Downloads\\th (15) (1).png"));
		ThongBao.setBounds(1350, 0, 40, 31);
		contentPane.add(ThongBao);
		
		
		ThemMoiDanhMucThucPham.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    thongtindulieumathang.main(null);
		    
		
		    }
		});
		comboBox.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {
		        // Lấy dữ liệu được chọn trong JComboBox
		         GiaTriDuocChon = comboBox.getSelectedItem().toString();

		       ;
		    }
		});
		timkiem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tableModel.setRowCount(0);
				  tableModel.fireTableDataChanged();
				if(textField.getText().isEmpty()) {
				
				Connection c = JDBCUtil.getConnection();
				try {
					String sql1 = "SELECT * FROM sanpham Where taikhoanid="+TrangDangNhap.getId()+" AND LoaiSanPham = '"+GiaTriDuocChon+"';";
					Statement st1 = c.createStatement();
					ResultSet rs1 = st1.executeQuery(sql1);
					while (rs1.next()) {
					    int taikhoanid = rs1.getInt("taikhoanid");
					    String Ten = rs1.getString("Ten");
					    String LoaiSanPham = rs1.getString("LoaiSanPham");
					    int GiaNhap=rs1.getInt("GiaNhap");
					    int GiaBan=rs1.getInt("GiaBan");
					    int SL=rs1.getInt("SL");
					  
						  
					    tableModel.addRow(new Object[]{Ten,LoaiSanPham,GiaNhap,GiaBan,SL});
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}    
				} else {
					
						
						Connection c = JDBCUtil.getConnection();
						try {
							String sql1 = "SELECT * FROM sanpham Where taikhoanid="+TrangDangNhap.getId()+" AND LoaiSanPham = '"+GiaTriDuocChon+"'AND Ten ='"+textField.getText()+"';";
							Statement st1 = c.createStatement();
							ResultSet rs1 = st1.executeQuery(sql1);
							while (rs1.next()) {
							    int taikhoanid = rs1.getInt("taikhoanid");
							    String Ten = rs1.getString("Ten");
							    String LoaiSanPham = rs1.getString("LoaiSanPham");
							    int GiaNhap=rs1.getInt("GiaNhap");
							    int GiaBan=rs1.getInt("GiaBan");
							    int SL=rs1.getInt("SL");
							  
								  
							    tableModel.addRow(new Object[]{Ten,LoaiSanPham,GiaNhap,GiaBan,SL});
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}  
			
				}
			}
		});
		
	}
	private String tendanhmuc() {
		thongtindulieumathang n = new thongtindulieumathang();
		return n.getTenMatHang();
	}
	
	private  void updatepanel() {
	    panel_6.removeAll(); // Xóa các panel cũ trước khi thêm mới

	    ArrayList<DuLieuMenu> list1 = DuLieuMenuDao.getinstance().selecta();
	    int i = list1.size();
	    for (DuLieuMenu dulieumenu : list1) {
	        JPanel childPanel = new JPanel(new GridBagLayout()); // Tạo JPanel con với GridBagLayout
	        childPanel.setBackground(Color.GRAY);

	        // Tạo các thành phần
	        JLabel label3 = new JLabel(dulieumenu.getTenMon());
	        JLabel label1 = new JLabel("Chỉnh Sửa");
	        JLabel label2 = new JLabel("Xóa");
	        label1.setForeground(new Color(255, 255, 255));
	        label2.setForeground(new Color(255, 255, 255));
	        label3.setForeground(new Color(255, 255, 255));

	        // Thiết lập vị trí và kích thước của các thành phần
	        GridBagConstraints gbc = new GridBagConstraints();

	        gbc.gridx = 0; // Cột 0, chứa label3
	        gbc.gridy = 0; // Dòng 0
	        gbc.weightx = 1.0; // 100% chiều ngang
	        gbc.fill = GridBagConstraints.HORIZONTAL;
	        childPanel.add(label3, gbc);

	        gbc.gridx = 1; // Cột 1, chứa label1
	        gbc.gridy = 0;
	        gbc.weightx = 0.0; // Kích thước không co dãn
	        gbc.fill = GridBagConstraints.NONE;
	        gbc.anchor = GridBagConstraints.LINE_END; // Canh phải
	        gbc.insets = new Insets(0, 10, 0, 10); // Khoảng cách
	        childPanel.add(label1, gbc);

	        gbc.gridx = 2; // Cột 2, chứa label2
	        gbc.gridy = 0;
	        gbc.weightx = 0.0; // Kích thước không co dãn
	        gbc.fill = GridBagConstraints.NONE;
	        gbc.anchor = GridBagConstraints.LINE_END; // Canh phải
	        gbc.insets = new Insets(0, 0, 0, 10); // Khoảng cách
	        childPanel.add(label2, gbc);

	        gbc.gridx = 1; // Cột 1
	        gbc.gridy = i;
	        gbc.gridwidth = 2; // Độ rộng 2 cột
	        gbc.fill = GridBagConstraints.HORIZONTAL;
	        gbc.weightx = 1.0; // Lấp đầy không gian chiều ngang
	        gbc.ipady = 10; // Mở rộng chiều cao một chút xíu
	        gbc.insets = new Insets(5, 5, 2, 2); // Khoảng cách giữa các ô
	        panel_6.add(childPanel, gbc); // Thêm JPanel con vào panel_6 với các ràng buộc
	        i++;
	    }
	}
	public static String getCurrentMonth() {
	    Calendar calendar = Calendar.getInstance();
	    int month = calendar.get(Calendar.MONTH) + 1;
	    DecimalFormat decimalFormat = new DecimalFormat("00"); // Định dạng thành số có 2 chữ số, nếu nhỏ hơn 10 sẽ có số 0 đằng trước
	    return decimalFormat.format(month);
	}
}
