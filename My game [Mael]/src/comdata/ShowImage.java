package comdata;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ShowImage extends Panel {
	  private static final long serialVersionUID = 1L;

	  private BufferedImage image;

	  public ShowImage(String background) {
	    try {
	      image = ImageIO.read(new File("background.jpg"));
	    } catch (IOException ie) {
	      ie.printStackTrace();
	    }
	  }

	  public void paint(Graphics g) {
	    g.drawImage(image, 0, 0, null);
	  }
}
