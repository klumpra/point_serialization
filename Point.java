import java.io.Serializable;

public class Point implements Serializable {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point() {
		x = 0;
		y = 0;
	}
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	public String toString() {
		return String.format("%d %d",x,y);
	}
}
