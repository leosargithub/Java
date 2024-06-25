package adjava;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class DisplayImage extends Canvas {
	public void paint(Graphics g) {
		
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("Pictures/java.png");
		g.drawImage(i,120,100,this);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayImage img = new DisplayImage();
		
		JFrame jf = new JFrame();
		jf.add(img);
		jf.setSize(400, 400);
		jf.setVisible(true);

	}

}
