package adjava;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsImage extends Canvas {
	
	public void paint(Graphics g)
	{	
	g.drawString("Hello World", 100, 100);
	setBackground(Color.white);
	g.fillRect(130, 130, 100, 100);
	g.drawOval(150, 150, 50, 50);
	g.drawLine(150, 150, 200, 200);
	
	setForeground(Color.blue);
	g.drawArc(150, 150, 50, 50, 0, 180);
	
	}
	

	public static void main(String[] args) {
		GraphicsImage gi = new GraphicsImage();
		JFrame jf = new JFrame();
		// TODO Auto-generated method stub
		
		jf.add(gi);
		jf.setSize(400, 400);
		jf.setVisible(true);

	}

}
