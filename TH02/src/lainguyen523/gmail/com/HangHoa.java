package lainguyen523.gmail.com;

public class HangHoa {
	private String tenHang;
	private String ngaysanxuat;
	private float DonGia;
	private int SoLuong;

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public String getNgaySanXuat() {
		return ngaysanxuat;
	}

	public void setngaysanxuat(String ngaysanxuat) {
		this.ngaysanxuat = ngaysanxuat;
	}

	public float getDonGia() {
		return DonGia;
	}

	public void setDonGia(float DonGia) {
		this.DonGia = DonGia;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int SoLuong) {
		this.SoLuong = SoLuong;
	}

	public String inThongTin() {
		return "Ten Hang : " + tenHang + "Ngay san xuat" + ngaysanxuat + "Don gia " + DonGia +
				"So luong " + SoLuong;
	}

	// Tiếp tục cho các phương thức còn lại
}