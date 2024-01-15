package Interface1;

public class Thongtin {
        private int ID;
        private String email;
        private String pass;
        private int DoanhThu;
        private int LoiNhuan;
        private int DonTonKho;
        private String DuLieuAnh;

		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public int getDoanhThu() {
			return DoanhThu;
		}
		public void setDoanhThu(int doanhThu) {
			DoanhThu = doanhThu;
		}
		public int getLoiNhuan() {
			return LoiNhuan;
		}
		public void setLoiNhuan(int loiNhuan) {
			LoiNhuan = loiNhuan;
		}
		public int getDonTonKho() {
			return DonTonKho;
		}
		public void setDonTonKho(int donTonKho) {
			DonTonKho = donTonKho;
		}
		public String getDuLieuAnh() {
			return DuLieuAnh;
		}
		public void setDuLieuAnh(String duLieuAnh) {
			DuLieuAnh = duLieuAnh;
		}
		public Thongtin(int iD, String email, String pass, int doanhThu, int loiNhuan, int donTonKho,
				String duLieuAnh) {
			super();
			ID = iD;
			this.email = email;
			this.pass = pass;
			DoanhThu = doanhThu;
			LoiNhuan = loiNhuan;
			DonTonKho = donTonKho;
			DuLieuAnh = duLieuAnh;
		}
		public Object getTK() {
			// TODO Auto-generated method stub
			return email+" "+pass;
		} public Object getTrung() {
			return email;
		} 
}
