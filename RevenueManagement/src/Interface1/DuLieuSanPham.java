package Interface1;

public class DuLieuSanPham {

	private int taikhoanid;
	private String Ten;
	private String LoaiSanPham;
	private int GiaNhap;
	private int GiaBan;
	private int SL;
	public DuLieuSanPham(int taikhoanid, String ten, String loaiSanPham, int giaNhap, int giaBan, int sL) {
		super();
		this.taikhoanid = taikhoanid;
		Ten = ten;
		LoaiSanPham = loaiSanPham;
		GiaNhap = giaNhap;
		GiaBan = giaBan;
		SL = sL;
	}
	public int getTaikhoanid() {
		return taikhoanid;
	}
	public void setTaikhoanid(int taikhoanid) {
		this.taikhoanid = taikhoanid;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getLoaiSanPham() {
		return LoaiSanPham;
	}
	public void setLoaiSanPham(String loaiSanPham) {
		LoaiSanPham = loaiSanPham;
	}
	public int getGiaNhap() {
		return GiaNhap;
	}
	public void setGiaNhap(int giaNhap) {
		GiaNhap = giaNhap;
	}
	public int getGiaBan() {
		return GiaBan;
	}
	public void setGiaBan(int giaBan) {
		GiaBan = giaBan;
	}
	public int getSL() {
		return SL;
	}
	public void setSL(int sL) {
		SL = sL;
	}
	public String getDuLieuSanPham() {
		  return getTen() + getLoaiSanPham()+getGiaNhap()+getGiaBan()+getSL();
	}
}
