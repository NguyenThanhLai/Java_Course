package lainguyen523.gmail.com;

public class Round {
	private float R;//Bán kính
	private Point O;//Tâm
	
	public Round() {
		this.setR(Math.round(Math.random()*100));
		this.setO(new Point());
	}
	
	//Tạo getters và setters cho R và O
	
	//Xét vị trí tương đối điểm với đư�?ng tròn: nếu nằm trong - trả v�? -1; nếu nằm ngoài - trả v�? 1; nếu nằm trên - trả v�? 0
	public int ViTriTuongDoiDiemVoiDuongTron(Point A) {
		
		return 0;
	}

	public float getR() {
		return R;
	}

	public void setR(float r) {
		R = r;
	}

	public Point getO() {
		return O;
	}

	public void setO(Point o) {
		O = o;
	}
}
