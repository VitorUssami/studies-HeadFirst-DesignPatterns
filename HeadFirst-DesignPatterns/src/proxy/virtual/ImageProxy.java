package proxy.virtual;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {
	
	private URL imageURL;
	private ImageIcon imageIcon;
	private boolean retrieving;
	
	public ImageProxy(URL imageURL){
		this.imageURL = imageURL;
	}
	
	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		if(imageIcon != null){
			imageIcon.paintIcon(c, g, x, y);
		}else{
			g.drawString("Loading CD cover, please wait ..", 50 , 120);
			if(!retrieving){
				retrieving = true;
				// recupera a imagem local, mas poderia ser de algum servidor
				new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							Thread.sleep(1000);
							imageIcon = new ImageIcon(imageURL,"CD Cover");
							c.repaint();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}).start();
			}
		}
	}

	@Override
	public int getIconWidth() {
		if(imageIcon != null){
			return imageIcon.getIconWidth();
		}else{
			return 300;
		}
	}

	@Override
	public int getIconHeight() {
		if(imageIcon != null){
			return imageIcon.getIconHeight();
		}else{
			return 300;
		}
	}
}
