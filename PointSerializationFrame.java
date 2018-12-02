import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PointSerializationFrame extends JFrame {
	private ArrayList<Point> points;
	private JFileChooser jfc;
	private PointsIOController pic;
	public void configureUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,300,100);
		JMenuBar mbar = new JMenuBar();
		JMenu mnuFile = new JMenu("File");
		jfc = new JFileChooser();
		FileFilter filter = new FileNameExtensionFilter("binary","bin");
		jfc.addChoosableFileFilter(filter);
		jfc.setFileFilter(filter);
		JMenuItem miOpen = new JMenuItem("Open");
		JMenuItem miSave = new JMenuItem("Save");
		miSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File f;
				String ext;
				if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					f = jfc.getSelectedFile();
					System.out.println(f.getName());
					if (f.getName().endsWith("bin")) {
						pic.saveToBinary(points,f);
					} else if (f.getName().endsWith("xml")) {
						pic.saveToXML(points,f);
					} else if (f.getName().endsWith("jsn")) {
						pic.saveToJSON(points,f);
					}
				}
			}
		});
		JMenuItem miExit = new JMenuItem("Exit");
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnuFile.add(miOpen);
		mnuFile.add(miSave);
		mnuFile.add(miExit);
		mbar.add(mnuFile);
		setJMenuBar(mbar);
	}
	public PointSerializationFrame(ArrayList<Point> points) {
		this.points = points;
		pic = new PointsIOController();
		configureUI();
	}
}
