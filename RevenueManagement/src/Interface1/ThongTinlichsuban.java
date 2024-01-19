package Interface1;

import java.awt.EventQueue;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThongTinlichsuban extends JFrame {

	private JPanel contentPane;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField tenban;
	private JTextField vitri;
	private JTextField tongtien;
	private JTextField thoigian;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTinlichsuban frame = new ThongTinlichsuban();
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
	public ThongTinlichsuban() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/th (2).jpg"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 100, 560, 658);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 40, 546, 584);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tên Bàn :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 10, 124, 31);
		panel.add(lblNewLabel_1);
		
		tenban = new JTextField();
		tenban.setBounds(10, 51, 399, 19);
		panel.add(tenban);
		tenban.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Vị Trí :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 102, 92, 13);
		panel.add(lblNewLabel_2);
		
		vitri = new JTextField();
		vitri.setBounds(10, 143, 399, 19);
		panel.add(vitri);
		vitri.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Hóa Đơn :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 200, 154, 13);
		panel.add(lblNewLabel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 241, 526, 165);
		panel.add(scrollPane);
		
		JLabel lblNewLabel_4 = new JLabel("Tổng Tiền :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 431, 124, 13);
		panel.add(lblNewLabel_4);
		
		tongtien = new JTextField();
		tongtien.setBounds(10, 454, 399, 19);
		panel.add(tongtien);
		tongtien.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Thời Gian :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 491, 100, 13);
		panel.add(lblNewLabel_5);
		
		thoigian = new JTextField();
		thoigian.setBounds(6, 514, 399, 19);
		panel.add(thoigian);
		thoigian.setColumns(10);
		
		JButton btnNewButton = new JButton("Xác Nhận");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(411, 553, 108, 21);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Thông Tin Lịch Sử Bàn :");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(0, 10, 305, 20);
		contentPane.add(lblNewLabel);
		
		
		

		JEditorPane editorPane = new JEditorPane();
		editorPane.setContentType("text/html"); // Đặt kiểu nội dung là HTML
		editorPane.setEditable(false); // Tắt khả năng chỉnh sửa
		scrollPane.setViewportView(editorPane);
		
		tenban.setText(panel_12.getTenBan());
		vitri.setText(panel_12.getViTri());
		editorPane.setText(panel_12.getHoaDon());
		tongtien.setText(panel_12.getTongTien()+" VND");
		thoigian.setText(panel_12.getThoiGian());

	}
}
