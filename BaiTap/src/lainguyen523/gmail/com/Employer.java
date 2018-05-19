package lainguyen523.gmail.com;

import java.util.Date;;

public class Employer {
	private String ma;
	private String hoten;
	private int namsinh;
	private boolean gioitinh;
	private float hsl;

	public float tinhLuong() {
		return 3500000 * hsl;
	}

	@SuppressWarnings("deprecation")
	public int getAge() {
		return (new Date()).getYear() - namsinh;
	}

	@Override
	public String toString() {
		return "ma: " + ma + ", hoten: " + hoten + ", Age: " + getAge() + ", gioitinh: "
				+ ((gioitinh) ? "Man" : "Woman") + ", Salary: " + tinhLuong();
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public boolean isGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public float getHsl() {
		return hsl;
	}

	public void setHsl(float hsl) {
		this.hsl = hsl;
	}

}