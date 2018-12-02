import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.beans.XMLEncoder;
import java.beans.XMLDecoder;

@SuppressWarnings("unchecked")
public class PointsIOController {
	public boolean saveToBinary(ArrayList<Point> points, File f) {
		try {
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public boolean saveToXML(ArrayList<Point> points, File f) {
		try {
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public boolean saveToJSON(ArrayList<Point> points, File f) {
		return true;
	}
	public ArrayList<Point> readFromBinary(File f) {
		try {
			return null;
		} catch (Exception ex) {
			return null;
		}
	}
	public ArrayList<Point> readFromXML(File f) {
		try {
			return null;
		} catch (Exception ex) {
			return null;
		}
	}
	public ArrayList<Point> readFromJSON(File f) {
		return null;
	}
}
