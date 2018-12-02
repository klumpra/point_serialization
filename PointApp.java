import java.util.ArrayList;
import java.util.Random;
public class PointApp {
	public static ArrayList<Point> fillPoints(int count) {
		ArrayList<Point> result = new ArrayList<Point>();
		Random rnd = new Random();
		for (int i = 0; i < count; i++) {
			result.add(new Point(rnd.nextInt(400),rnd.nextInt(400)));
		}
		return result;
	}
	public static void main(String[] args) {
		ArrayList<Point> points = fillPoints(10);
		PointSerializationFrame psf = new PointSerializationFrame(points);
		psf.setVisible(true);
	}
}
