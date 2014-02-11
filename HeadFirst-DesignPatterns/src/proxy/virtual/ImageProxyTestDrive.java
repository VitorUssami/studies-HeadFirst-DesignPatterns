package proxy.virtual;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class ImageProxyTestDrive {

	private JLabel lbl;
	private JFrame frame;

	public static void main(String[] args) {
		new ImageProxyTestDrive();
	}

	public ImageProxyTestDrive() {
		try {
			init();
		} catch (Exception e) {
			error(e.getMessage());
			// e.printStackTrace();
		}
	}

	private void init() throws Exception {

		frame = new JFrame("Virtual Proxy");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setResizable(false);

		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("CD Covers");

		
		JMenuItem linkinpark = new JMenuItem("Linkin Park");
		linkinpark.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setCover("prxoy/virtual/covers/linkinpark.jpg");
			}
		});
		JMenuItem pinkfloyd = new JMenuItem("Pink Floyd");
		pinkfloyd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setCover("prxoy/virtual/covers/pinkfloyd.jpg");
			}
		});
		JMenuItem radiohead = new JMenuItem("Radiohead");
		radiohead.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setCover("prxoy/virtual/covers/radiohead.jpg");
			}
		});

		menu.add(linkinpark);
		menu.add(pinkfloyd);
		menu.add(radiohead);

		bar.add(menu);

		frame.setJMenuBar(bar);
		frame.setVisible(true);

		lbl = new JLabel();

		setCover("prxoy/virtual/covers/blank.jpg");
	}

	private void setCover(String path) {
		Icon icon = new ImageProxy(ImageProxyTestDrive.class.getClassLoader()
				.getResource(path));
		lbl.setIcon(icon);
		frame.add(lbl, (Object) BorderLayout.CENTER);
	}

	private void error(String error) {
		JOptionPane.showMessageDialog(frame, error, "Error",
				JOptionPane.ERROR_MESSAGE);
	}
}
