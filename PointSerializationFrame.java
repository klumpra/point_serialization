import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PointSerializationFrame extends JFrame {
	private ArrayList<Point> points;
	private JFileChooser jfc;
	public void configureUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,300,100);
		JMenuBar mbar = new JMenuBar();
		JMenu mnuFile = new JMenu("File");
		jfc = new JFileChooser();
		JMenuItem miOpen = new JMenuItem("Open");
		JMenuItem miSave = new JMenuItem("Save");
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
		configureUI();
	}
}
