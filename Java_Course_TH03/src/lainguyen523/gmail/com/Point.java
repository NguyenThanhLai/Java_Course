package lainguyen523.gmail.com;

public class Point {
	private float x;//T�?a độ x
	private float y;//T�?a độ y
	
	public Point() {
		this.setX(Math.round(Math.random()*50));
		this.setY(Math.round(Math.random()*50));
	}
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	
	
	//Tạo getters và setters cho x và y
}
