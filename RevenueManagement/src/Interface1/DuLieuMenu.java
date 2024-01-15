package Interface1;

public class DuLieuMenu {
	  private String TenMon ;
      private int GiaThanh;
      private int LoiNhuan;
	public DuLieuMenu(String tenMon, int giaThanh, int loiNhuan) {
		super();
		TenMon = tenMon;
		GiaThanh = giaThanh;
		LoiNhuan = loiNhuan;
	}
	public String getTenMon() {
		return TenMon;
	}
	public void setTenMon(String tenMon) {
		TenMon = tenMon;
	}
	public int getGiaThanh() {
		return GiaThanh;
	}
	public void setGiaThanh(int giaThanh) {
		GiaThanh = giaThanh;
	}
	public int getLoiNhuan() {
		return LoiNhuan;
	}
	public void setLoiNhuan(int loiNhuan) {
		LoiNhuan = loiNhuan;
	}
	public String toString() {
		return  TenMon+" "+GiaThanh+" "+LoiNhuan;
	}
 public Object getTemMon1() {
	return TenMon;
} public Object getGiaThanh1() {
	return GiaThanh;
} 
}
