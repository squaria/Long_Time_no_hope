package comdata;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class IHMImages extends JPanel {
	
	private static final long serialVersionUID = 1L;
	Image lune, terre;

	void PanneauImages() {
		try {
			lune = ImageIO.read(new File("background.jpg"));
		}
		catch(IOException exc) {
			exc.printStackTrace();
		}
	}
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(lune, 0, 0, getWidth(), getHeight(), this);
	}
}

public class AfficheImage { 
	public static void main(String[] arg) {
		JFrame fenetre = new JFrame();
		fenetre.setContentPane(new IHMImages());
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.pack();
		fenetre.setLocation(100, 100);
		fenetre.setVisible(true);
	}
	
}