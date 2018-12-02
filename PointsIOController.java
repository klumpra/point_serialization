import java.io.File;
import java.util.ArrayList;

public class PointsIOController {
	public boolean saveToBinary(ArrayList<Point> points, File f) {
		return true;
	}
	public boolean saveToXML(ArrayList<Point> points, File f) {
		return true;
	}
	public boolean saveToJSON(ArrayList<Point> points, File f) {
		return true;
	}
	public ArrayList<Point> readFromBinary(File f) {
		return null;
	}
	public ArrayList<Point> readFromXML(File f) {
		return null;
	}
	public ArrayList<Point> readFromJSON(File f) {
		return null;
	}
}
