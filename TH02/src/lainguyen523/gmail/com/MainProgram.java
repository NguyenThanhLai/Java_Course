package lainguyen523.gmail.com;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		HangHoa hh = new HangHoa();
		KhachHang kh = new KhachHang("abc","123");
		String a, b;
		hh.setTenHang("Bánh");
		hh.setngaysanxuat("1/1/2018");
		hh.setSoLuong(4);
		hh.setDonGia(50000);
		System.out.println(hh.inThongTin());
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		b = sc.nextLine();
		if ((a.equals(kh.getUsername())) && (b.equals(kh.getPassword())))
			System.out.println("Số tiền bạn phải thanh toán là " + (hh.getSoLuong() * hh.getDonGia()));
		else
			System.out.println("Xin lỗi tài khoản của quý khách không tồn tại trong hệ thống");
	}

}