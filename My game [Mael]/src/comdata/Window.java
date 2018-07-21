package comdata;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
	  
public class Window extends Canvas{
	
	private static final long serialVersionUID = 1028793866621864106L;
	
	public Window(int width, int height, String title, Game game) throws IOException {
		JFrame frame = new JFrame(title);
		JFrame frame1 = new JFrame("ShowImage.java");
		
		Panel panel = new ShowImage(background);
		frame1.getContentPane().add(panel);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}
	
}
