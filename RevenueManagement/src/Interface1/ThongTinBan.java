package Interface1;

public class ThongTinBan {

	private int taikhoanid;
	private String TenBan;
	private String ViTri;
	private String TrangThai;
	public ThongTinBan(int taikhoanid, String tenBan, String viTri, String trangThai) {
		super();
		this.taikhoanid = taikhoanid;
		TenBan = tenBan;
		ViTri = viTri;
		TrangThai = trangThai;
	}
	public int getTaikhoanid() {
		return taikhoanid;
	}
	public void setTaikhoanid(int taikhoanid) {
		this.taikhoanid = taikhoanid;
	}
	public String getTenBan() {
		return TenBan;
	}
	public void setTenBan(String tenBan) {
		TenBan = tenBan;
	}
	public String getViTri() {
		return ViTri;
	}
	public void setViTri(String viTri) {
		ViTri = viTri;
	}
	public String getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}
}
