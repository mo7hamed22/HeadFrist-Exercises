package ClasessTest;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;

public class MyDrawpanl extends JPanel {
	public void paintComponent(Graphics g)
	{
		g.fill3DRect(10, 10, 20, 20,true);
		g.setColor(Color.green);
		Image image = new ImageIcon(getClass().getResource("catzilla.jpg")).getImage();
		g.drawImage(image,3,4,this);
		//=========
		
//		Graphics2D g2d = (Graphics2D) g;
//		int red = (int) (Math.random() * 256);
//		int green = (int) (Math.random() * 256);
//		int blue = (int) (Math.random() * 256);
//		Color startColor = new Color(red, green, blue);
//		red = (int) (Math.random() * 256);
//		green = (int) (Math.random() * 256);
//		blue = (int) (Math.random() * 256);
//		Color endColor = new Color(red, green, blue);
//		
//		GradientPaint gradient = new GradientPaint(70,70,startColor, 150,150, endColor);
//		g2d.setPaint(gradient);
//		g2d.fillOval(70,70,100,100);
		
		//===========Animation
		g.fillOval(20,50,100,100);
		g.fillOval(25,55,100,100);
		
		
	}
	

}
