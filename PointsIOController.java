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
		try {
			XMLEncoder xmlEnc = new XMLEncoder(new FileOutputStream(f));
			xmlEnc.writeObject(points);
			xmlEnc.close();
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
		try {
			ArrayList<Point> results;
			XMLDecoder xmlDec = new XMLDecoder(new FileInputStream(f));
			results = (ArrayList<Point>)(xmlDec.readObject());
			return results;
		} catch (Exception ex) {
			return null;
		}
	}
	public ArrayList<Point> readFromJSON(File f) {
		return null;
	}
}
