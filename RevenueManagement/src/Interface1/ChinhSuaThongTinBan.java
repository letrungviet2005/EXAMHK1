package Interface1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChinhSuaThongTinBan extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldgiamgia;
	private String TrangThaiBan;
	private JPanel panel_3;
	private JTextField textField15;
	private int valuespiner;
	private String GiaTriDuocChon;
	private String dulieuban;
	private int rowIndex;
	private TableModel model;
	private int totalbill;
	private String ThoiGian;
	private int loinhuanbill;
    private static int DoanhThu;
    private static int LoiNhuan;
    private static int doanhThu;
    private static int loiNhuan;
    private static int doanhThu1;
    private static int loiNhuan1;
    private static int donhangbanduochomnay;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChinhSuaThongTinBan frame = new ChinhSuaThongTinBan();
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
	public ChinhSuaThongTinBan() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/th (2).jpg"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 150, 709, 438);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		CardLayout card1 = new CardLayout();
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 114, 675, 277);
		panel.add(panel_3);
		panel_3.setLayout(card1);
	
		JPanel paneloder = new JPanel();
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 675, 277);
		panel_3.add(panel_2, "panel2");
		panel_3.add(paneloder,"paneloder");
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(0, 0, 685, 33);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông Tin Chi Tiết Bàn");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(0, 0, 419, 33);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Trạng Thái :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(134, 43, 78, 20);
		panel.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Đã Có Khách");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(230, 42, 123, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnBnTrng = new JRadioButton("Bàn Trống");
		rdbtnBnTrng.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnBnTrng.setBounds(351, 42, 123, 21);
		panel.add(rdbtnBnTrng);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bảng Tùy Chọn :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(110, 81, 102, 20);
		panel.add(lblNewLabel_1_1);
		
		JButton ThongTin = new JButton("Thông Tin");
		ThongTin.setBackground(Color.ORANGE);
		ThongTin.setForeground(Color.WHITE);
		ThongTin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ThongTin.setBounds(222, 82, 102, 21);
		panel.add(ThongTin);
		
		JButton OderMon = new JButton("Oder Món");
		OderMon.setForeground(Color.WHITE);
		OderMon.setFont(new Font("Tahoma", Font.PLAIN, 12));
		OderMon.setBackground(new Color(30, 144, 255));
		OderMon.setBounds(334, 82, 102, 21);
		panel.add(OderMon);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 10, 594, 137);
		panel_2.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		Font font = new Font("Courier New", Font.PLAIN, 12); // Thay đổi kích cỡ font chữ nếu cần
		textArea.setFont(font);
		JButton btnChuynBn = new JButton("Chuyển Bàn");
		btnChuynBn.setForeground(Color.WHITE);
		btnChuynBn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnChuynBn.setBackground(new Color(50, 205, 50));
		btnChuynBn.setBounds(446, 82, 102, 21);
		panel.add(btnChuynBn);
		//paneloder here
		 ArrayList<DuLieuMenu> list1 = DuLieuMenuDao.getinstance().selecta();
		 ArrayList<String> danhmuc = new ArrayList<String>();
		 for (DuLieuMenu dulieumenu : list1) {
			 danhmuc.add(dulieumenu.getTenMon());
		 }
		
		paneloder.setBackground(Color.LIGHT_GRAY);
		paneloder.setBounds(0, 0, 675, 277);
		panel_3.add(paneloder,"paneloder");
		paneloder.setLayout(null);
		
		JScrollPane scrollPane215 = new JScrollPane();
		scrollPane215.setBounds(10, 45, 655, 121);
		paneloder.add(scrollPane215);
		JTable table = new JTable();
        table.setModel(new DefaultTableModel(
			    new Object[][]{},
			    new String[]{ "Tên","Loại sản phẩm","Giá nhập","Giá Bán","Số lượng tồn hàng"}
			));

			scrollPane215.setViewportView(table);
			DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
			
			 ArrayList<DuLieuSanPham> list4 = SanPhamDao.getInstance1().selectAll2();
			  
			   
			   for (DuLieuSanPham sanpham : list4) {
				    tableModel.addRow(new Object[]{ sanpham.getTen(), sanpham.getLoaiSanPham(), sanpham.getGiaNhap(), sanpham.getGiaBan(), sanpham.getSL()});
				    
				}
		
	
		
		JButton XacNhan15 = new JButton("Xác Nhận");
	
		XacNhan15.setBackground(new Color(30, 144, 255));
		XacNhan15.setForeground(Color.WHITE);
		XacNhan15.setBounds(569, 246, 96, 21);
		paneloder.add(XacNhan15);
		
		JLabel lblNewLabel15 = new JLabel("Số Lượng :");
		lblNewLabel15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel15.setBounds(10, 200, 58, 32);
		paneloder.add(lblNewLabel15);
		
		SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 0, Integer.MAX_VALUE, 1);
		JSpinner spinner15 = new JSpinner(spinnerModel);
		spinner15.setForeground(Color.WHITE);
		spinner15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinner15.setBackground(new Color(30, 144, 255));
		spinner15.setBounds(68, 200, 44, 35);
		paneloder.add(spinner15);
		
		JLabel lblNewLabel_115 = new JLabel("! Lưu ý : Vui lòng chọn dòng sản phẩm phẩm cần oder và thay đổi số lượng");
		lblNewLabel_115.setBounds(20, 177, 422, 13);
		paneloder.add(lblNewLabel_115);
		
		JButton XacNhanSL15 = new JButton("Xác Nhận SL");
	
		XacNhanSL15.setBackground(new Color(30, 144, 255));
		XacNhanSL15.setForeground(Color.WHITE);
		XacNhanSL15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		XacNhanSL15.setBounds(10, 242, 133, 21);
		paneloder.add(XacNhanSL15);
		
		JComboBox comboBox15 = new JComboBox();
		comboBox15.setBounds(10, 21, 310, 21);
		paneloder.add(comboBox15);
		comboBox15.setModel(new DefaultComboBoxModel<>(new Vector<>(danhmuc)));
		comboBox15.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent event) {
		        // Lấy dữ liệu được chọn trong JComboBox
		         GiaTriDuocChon = comboBox15.getSelectedItem().toString();

		       ;
		    }
		});
		textField15 = new JTextField();
		textField15.setBounds(327, 22, 232, 19);
		paneloder.add(textField15);
		textField15.setColumns(10);
		
		JButton TimKiem15 = new JButton("Tìm Kiếm");

		TimKiem15.setForeground(Color.WHITE);
		TimKiem15.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TimKiem15.setBackground(new Color(30, 144, 255));
		TimKiem15.setBounds(563, 21, 102, 21);
		paneloder.add(TimKiem15);
		
		JButton HuyBoLoc15 = new JButton("Hủy Bộ Lọc");
		HuyBoLoc15.addActionListener(new ActionListener() {
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
		HuyBoLoc15.setForeground(Color.WHITE);
		HuyBoLoc15.setFont(new Font("Tahoma", Font.PLAIN, 13));
		HuyBoLoc15.setBackground(new Color(30, 144, 255));
		HuyBoLoc15.setBounds(518, 173, 147, 21);
		paneloder.add(HuyBoLoc15);
		dulieuban ="Ten Mon\t\t\t\tGia Tien\tSL\tThanh Tien\n";
		TimKiem15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableModel.setRowCount(0);
				  tableModel.fireTableDataChanged();
				if(textField15.getText().isEmpty()) {
				
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
							String sql1 = "SELECT * FROM sanpham Where taikhoanid="+TrangDangNhap.getId()+" AND LoaiSanPham = '"+GiaTriDuocChon+"'AND Ten ='"+textField15.getText()+"';";
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
			} }
		}); table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent event) {
		        // Kiểm tra xem sự kiện có phải là sự kiện kết thúc chọn không
		        if (!event.getValueIsAdjusting()) {
		            // Kiểm tra xem có hàng nào được chọn không
		            if (table.getSelectedRow() != -1) {
		                // Lấy chỉ mục hàng đầu tiên được chọn
		                 rowIndex = table.getSelectedRow();

		                // Lấy mô hình dữ liệu của JTable
		                 model = table.getModel();

		                // Lấy dữ liệu từ các ô trong hàng đó
		          
		                  
		            }
		        }
		    }
		});

		XacNhanSL15.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        valuespiner = (int) spinner15.getValue();
		       
		        Object value = model.getValueAt(rowIndex, 0);
                // Sử dụng giá trị lấy được từ JTable ở đây
                System.out.println(value);
                int value2 = (int) model.getValueAt(rowIndex, 2);
                int value3 = (int) model.getValueAt(rowIndex, 3);
                
                // Sử dụng giá trị lấy được từ JTable ở đây
           
               
                Object value4 = model.getValueAt(rowIndex, 4);
                int intValue = ((Integer) value4).intValue();
                // Sử dụng giá trị lấy được từ JTable ở đây
                int tonkho =intValue -valuespiner;
               
                double thanhTien = valuespiner * value3;
                
                String formattedData = String.format("%-25s%-15s%-5d%.2f\n", value, value3, valuespiner, thanhTien);
                dulieuban += formattedData;
                totalbill+=valuespiner*value3;
                loinhuanbill+=valuespiner*(value3-value2);
                donhangbanduochomnay+= valuespiner;
          	  Connection con = JDBCUtil.getConnection();
	            Statement st = null;
				try {
					st = con.createStatement();
					String sql2 = "UPDATE sanpham SET SL=" + tonkho + " WHERE taikhoanid =" + TrangDangNhap.getId() + " AND Ten ='" + value + "';";
					 st.executeUpdate(sql2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

		        // Hủy chọn các hàng trong JTable
		        table.getSelectionModel().clearSelection();
		    }
		});
	
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Chi Tiết Thanh Toán :");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(43, 157, 131, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tổng :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(45, 169, 48, 19);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Giảm Giá(%) :");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3_1.setBounds(1, 197, 87, 13);
		panel_2.add(lblNewLabel_3_1);
		
		textFieldgiamgia = new JTextField();
		textFieldgiamgia.setBounds(94, 194, 42, 19);
		panel_2.add(textFieldgiamgia);
		textFieldgiamgia.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("(Nhập % giảm nếu có)");
		lblNewLabel_4.setBounds(144, 197, 123, 13);
		panel_2.add(lblNewLabel_4);
		
		JLabel TongTien = new JLabel("0 đ");
		TongTien.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TongTien.setBounds(100, 173, 123, 13);
		panel_2.add(TongTien);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Thành Tiền :");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3_1_1.setBounds(8, 217, 77, 13);
		panel_2.add(lblNewLabel_3_1_1);
		
		JLabel ThanhTien = new JLabel("0 đ");
		ThanhTien.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ThanhTien.setBounds(100, 217, 123, 13);
		panel_2.add(ThanhTien);
		
		JButton ThanhToanInHoaDon = new JButton("Thanh Toán & In Hóa Đơn");
		ThanhToanInHoaDon.setBackground(new Color(30, 144, 255));
		ThanhToanInHoaDon.setForeground(Color.WHITE);
		ThanhToanInHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ThanhToanInHoaDon.setBounds(474, 246, 191, 21);
		panel_2.add(ThanhToanInHoaDon);
		
		XacNhan15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 card1.show(panel_3, "panel2"); // Hiển thị panel2
				 textArea.setText(dulieuban);
				 String tongtien =String.valueOf(totalbill);
				 TongTien.setText(tongtien+" đ");
				 int num;
				try {
					
					if (textFieldgiamgia.getText().isEmpty()) {
						int thanhtien1 =totalbill;
						 String thanhtien=String.valueOf(thanhtien1);
						 System.out.println(thanhtien);
						 System.out.println(thanhtien1);
						 ThanhTien.setText(thanhtien);
						
					} else {
						num = Integer.parseInt(textFieldgiamgia.getText());
					int thanhtien1 =totalbill-(totalbill*num/100);
					 String thanhtien=String.valueOf(thanhtien1);
					 System.out.println(thanhtien);
					 System.out.println(thanhtien1);
					 ThanhTien.setText(thanhtien);
				
					}
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
		JButton HuyBo = new JButton("Hủy Bỏ");
		HuyBo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		HuyBo.setForeground(Color.WHITE);
		HuyBo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		HuyBo.setBackground(new Color(30, 144, 255));
		HuyBo.setBounds(366, 246, 102, 21);
		panel_2.add(HuyBo);
		
		JLabel lblNewLabel_5 = new JLabel("Ghi chú :");
		lblNewLabel_5.setBounds(290, 158, 66, 19);
		panel_2.add(lblNewLabel_5);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(366, 168, 281, 62);
		panel_2.add(scrollPane_1);
		
		JTextArea GhiChu = new JTextArea();
		scrollPane_1.setViewportView(GhiChu);
		
	
		// Tạo đối tượng ButtonGroup để nhóm các JRadioButton lại với nhau
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnBnTrng);
		
		

		// Lắng nghe sự kiện khi một JRadioButton được chọn
		ItemListener itemListener = new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		        if (rdbtnNewRadioButton.isSelected()) {
		           TrangThaiBan="Dang Su Dung";
		        } else if (rdbtnBnTrng.isSelected()) {
		            // Xử lý khi JRadioButton Option 2 được chọn
		            // ...
		        	TrangThaiBan="Con Trong";
		        }
		    }
		};

		rdbtnNewRadioButton.addItemListener(itemListener);
		rdbtnBnTrng.addItemListener(itemListener);
		OderMon.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        card1.show(panel_3, "paneloder"); // Hiển thị paneloder
		    }
		});
		JButton XacNhanTrangThaiBan = new JButton("Xác nhận trạng thái");
		XacNhanTrangThaiBan.setBackground(new Color(30, 144, 255));
		XacNhanTrangThaiBan.setForeground(Color.WHITE);
		XacNhanTrangThaiBan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		XacNhanTrangThaiBan.setBounds(490, 42, 152, 21);
		panel.add(XacNhanTrangThaiBan);
		XacNhanTrangThaiBan.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if (TrangThaiBan!=null) {
		    	  Connection con = JDBCUtil.getConnection();
		            Statement st = null;
					try {
						st = con.createStatement();
						 String sql2 = "UPDATE quanlyban SET TrangThai='"+TrangThaiBan+"'WHERE taikhoanid ="+TrangDangNhap.getId()+" AND TenBan ='"+TrangChuTests.getValuetrangthai()+"';";
						 st.executeUpdate(sql2);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		    	} else {
		    		 JOptionPane.showMessageDialog(null, "Vui Lòng Chọn Trạng Thái Bàn Trước Khi Xác Nhận!",
                             "Thông báo", JOptionPane.ERROR_MESSAGE);
		    	}
		           
		        
		       
		    }
		});
		UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 12));
		UIManager.put("OptionPane.messageFontSize", 12);
		ThanhToanInHoaDon.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	 Connection con = JDBCUtil.getConnection();
		    	 int id =TrangDangNhap.getId();
		    	 Statement st3 = null;
		         Statement st4 = null;
		         Statement st6 = null;
		         try {
					 st3 = con.createStatement();
					 st4 = con.createStatement();
					 st6 = con.createStatement();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}   String sql5 = "SELECT * FROM doanhthutheonam WHERE taikhoanid="+TrangDangNhap.getId()+" AND nam='2024';";
		        try {
					ResultSet rs3 = st3.executeQuery(sql5);
					while (rs3.next()) {
					   
					    int doanhthu=rs3.getInt("doanhthu");
					    int loinhuan=rs3.getInt("loinhuan");
					     doanhThu = doanhthu;
					     loiNhuan=loinhuan;
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
		    	
		            Statement st = null;
		            Statement st1 = null;
		            Statement st2 = null;
					try {
						
						        Date date = new Date();
						        SimpleDateFormat dateFormat = new SimpleDateFormat("  yyyy-MM-dd   HH:mm:ss");
						        String formattedTime = dateFormat.format(date);
						         ThoiGian=formattedTime;
						        
						 
					
                         doanhThu+=totalbill;
                         DoanhThu=doanhThu;
                         loiNhuan+=loinhuanbill;
                         LoiNhuan=loiNhuan;
						st = con.createStatement();
						st1 = con.createStatement();
						st2 = con.createStatement();
						String htmlData = "<html><pre>" + dulieuban + "</pre></html>";
						 String sql2 = "INSERT INTO lichsuban VALUE("+TrangDangNhap.getId()+",'"+TrangChuTests.getValuetrangthai()+"','"+TrangChuTests.getValuevitri()+"','"+htmlData+"',"+totalbill+",'"+ThoiGian+"');";
						 String sql3 =" UPDATE doanhthutheonam SET DoanhThu="+doanhThu+",LoiNhuan="+loiNhuan+" WHERE taikhoanid="+TrangDangNhap.getId()+" AND nam='2024' ;";
						 String sql4 =" UPDATE taikhoan SET DonTonKho="+donhangbanduochomnay+ " WHERE ID="+TrangDangNhap.getId()+" ;";
						 st.executeUpdate(sql2);
						 st1.executeUpdate(sql3);
						 st2.executeUpdate(sql4);
						 
						 JOptionPane.showMessageDialog(null,htmlData+"\n"+"  Tong :"+totalbill+ " đ"+"\n"+ThoiGian+"\n"+  "  Thanh Toan Thanh Cong!",
	                             "Thông báo", JOptionPane.INFORMATION_MESSAGE);
						 
					     dulieuban = "Ten Mon\t\t\t\tGia Tien\tSL\tThanh Tien\n";
					     String time = TrangChuTests.getCurrentMonth();
					     String sql6 =  "SELECT * FROM doanhthutheothang WHERE taikhoanid="+TrangDangNhap.getId()+" AND thangnam='"+time+"/2024';";
				    	 
				    	  try {
								ResultSet rs4 = st4.executeQuery(sql6);
								while (rs4.next()) {
								   
								    String doanhthu1=rs4.getString("doanhthu");
								    String loinhuan1=rs4.getString("loinhuan");
								    int num1 = Integer.parseInt(doanhthu1);
								    int num2 = Integer.parseInt(loinhuan1);
								    
								     doanhThu1 = num1;
								     loiNhuan1=num2;
								     doanhThu1+=totalbill;
								     loiNhuan1+=loinhuanbill;
								     String sql66 =" UPDATE doanhthutheothang SET DoanhThu="+doanhThu1+",LoiNhuan="+loiNhuan1+" WHERE taikhoanid="+TrangDangNhap.getId()+" AND  thangnam='"+time+"/2024';";
								     st6.executeUpdate(sql66);
								}
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
				    	  totalbill=0;
						  loinhuanbill=0;
					     dispose();
					    
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		    	
		    }
		    });
		// Trình lắng nghe sự kiện cho nút "Thông Tin"
		ThongTin.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        card1.show(panel_3, "panel2"); // Hiển thị panel2
		       
		    }
		});
	}

	public static int getDoanhThu() {
		return DoanhThu;
	}

	public static void setDoanhThu(int doanhThu) {
		DoanhThu = doanhThu;
	}

	public static int getLoiNhuan() {
		return LoiNhuan;
	}

	public static void setLoiNhuan(int loiNhuan) {
		LoiNhuan = loiNhuan;
	}
}
