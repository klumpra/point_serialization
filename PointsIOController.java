import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class PointsIOController {
	public boolean saveToBinary(ArrayList<Point> points, File f) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(f));
			oos.writeObject(points);
			oos.close();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public boolean saveToXML(ArrayList<Point> points, File f) {
		return true;
	}
	public boolean saveToJSON(ArrayList<Point> points, File f) {
		return true;
	}
	public ArrayList<Point> readFromBinary(File f) {
		try {
			ArrayList<Point> results = new ArrayList<Point>();
			ObjectInputStream ois = new ObjectInputStream( 
					new FileInputStream(f));
			results = (ArrayList<Point>)(ois.readObject());
			return results;
		} catch (Exception ex) {
			return null;
		}
	}
	public ArrayList<Point> readFromXML(File f) {
		return null;
	}
	public ArrayList<Point> readFromJSON(File f) {
		return null;
	}
}
