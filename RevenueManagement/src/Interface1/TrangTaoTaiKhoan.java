package Interface1;
import java.awt.Color;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Interface1.JDBCUtil;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class TrangTaoTaiKhoan {

	public static void main(String[] args) {
		JFrame frame = new JFrame("TAO TAI KHOAN");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/th (2).jpg"));
		frame.setLocationRelativeTo(null);
	    frame.setLayout(null); // Disable layout manager
	    frame.getContentPane().setBackground(new Color(255, 255, 240));
	        
	        JLabel lblNewLabel = new JLabel("TẠO TÀI KHOẢN");
			lblNewLabel.setForeground(new Color(75, 0, 130));
			lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 33));
			lblNewLabel.setBounds(98, 10, 314, 61);
			frame.add(lblNewLabel);
			
			JTextField email = new JTextField();
			email.setBounds(160, 104, 275, 24);
			frame.add(email);
			email.setColumns(10);
			
			JTextField pass = new JTextField();
			pass.setBounds(160, 140, 275, 24);
			frame.add(pass);
			pass.setColumns(10);
			
			JTextField pass1 = new JTextField();
			pass1.setBounds(160, 170, 275, 24);
			pass1.setColumns(10);
			frame.add(pass1);
			
			JLabel lblNewLabel_1 = new JLabel("Tên tài khoản:");
			lblNewLabel_1.setForeground(new Color(72, 61, 139));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(27, 104, 123, 24);
			frame.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("    Mật Khẩu:");
			lblNewLabel_2.setForeground(new Color(72, 61, 139));
			lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			lblNewLabel_2.setBounds(49, 140, 101, 24);
			frame.add(lblNewLabel_2);
			
			
			
			JLabel lblNewLabel_8 = new JLabel("Xác Nhận Mật Khẩu:");
			lblNewLabel_8.setForeground(new Color(72, 61, 139));
			lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNewLabel_8.setBounds(10, 170, 140, 24);
			frame.add(lblNewLabel_8);
			
			JButton taotaikhoan = new JButton("Tạo Tài Khoản");
			taotaikhoan.setBackground(new Color(0, 0, 255));
			taotaikhoan.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			taotaikhoan.setForeground(new Color(255, 255, 255));
			taotaikhoan.setBounds(98, 249, 297, 46);
			frame.add(taotaikhoan);
			   taotaikhoan.addActionListener(new ActionListener() {

		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	String check=pass1.getText();
		            
		        		try {
		        			Connection connection = JDBCUtil.getConnection();
		        			Statement st = connection.createStatement();
		        			String email1=email.getText();
		        			String pass1=pass.getText();
		        		    boolean found = false;
		        		    ArrayList<Thongtin> list = ThongTinDao.getInstance().selectAll();
					          
					          
					           for (Thongtin thongtin : list) {
					            if (thongtin.getTrung().equals(email.getText())==true || check.equals(pass.getText())==false ) {
		        		                      found = true;
		        		    
		        		    
					            }}
					           
		        			 if (email1.length()>0 && pass1.length()>0)   {
		        				 if (found) {
		        					 JOptionPane.showMessageDialog(null, "tao tai khoan that bai, xac nhan mat khau sai!",
		         	                        "Thong bao", JOptionPane.ERROR_MESSAGE);
		        				 } else {
		        				 
						   		  String sql= "INSERT INTO taikhoan(email,password) VALUES(\""+email.getText()+"\","+"\""+ pass.getText()+"\")";
						   				        		
						   			    st.executeUpdate(sql);
						   		     JOptionPane.showMessageDialog(null, "Tao tai khoan thanh cong, vui long dang nhap lai", "Thong bao",
						   		     JOptionPane.INFORMATION_MESSAGE);
						   		     frame.dispose();
		        				 }
						   		      
						   		        			}
		        			
		        			
		        			
				        			
			        				
		        			
		        			
		        		else if(email1.length()==0 && pass1.length()>0) {
		        			
	        				JOptionPane.showMessageDialog(null, "tao tai khoan that bai, vui long nhap them email hoac so dien thoai!",
        	                        "Thong bao", JOptionPane.ERROR_MESSAGE);
	        		
		        			
		        			
		        		}else if(email1.length()==0 && pass1.length()==0) {
		        			
	        				JOptionPane.showMessageDialog(null, "tao tai khoan that bai, vui long nhap thong tin va mat khau cua ban!",
        	                        "Thong bao", JOptionPane.ERROR_MESSAGE);
	        		
		        		
		        		
		        		}
		        		
		        		 
	else if(email1.length()>0 && pass1.length()==0) {
			        			
		        				JOptionPane.showMessageDialog(null, "tao tai khoan that bai, vui long tao them mat khau!",
	        	                        "Thong bao", JOptionPane.ERROR_MESSAGE);
		        				
		        		}
		        			JDBCUtil.colseConnection(connection);
		        			
		        		} catch (SQLException e1) {
		        			
		        			e1.printStackTrace();
		        			JOptionPane.showMessageDialog(null, "loi ket noi co so du lieu!",
        	                        "Thong bao", JOptionPane.ERROR_MESSAGE);
		        		}
		               
		            }
		        });
			
			JLabel lblNewLabel_3 = new JLabel("Developed by Le Trung Viet");
			lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			lblNewLabel_3.setBounds(0, 440, 225, 23);
			frame.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("------------------------------------------------------------------------------------------");
			lblNewLabel_4.setForeground(new Color(128, 128, 128));
			lblNewLabel_4.setBounds(74, 209, 361, 13);
			frame.add(lblNewLabel_4);

			
			
			frame.setVisible(true);
			frame.setResizable(false);
	}

}
