package ClasessTest;
//import java.util.*;
import javax.swing.*;
//import java.io.* ;
import java.awt.*;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui {
	//Coordinates for the Circle 
	int x =70 ,y =70 ;
	
	
	//JButton labelButton,ColorBtn;
	JFrame frame ;
	JLabel label;
	public static void main(String[] args) {
		SimpleGui gui =new SimpleGui();
	     gui.go();

	}
public void go() {
	 frame =new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
//	label = new JLabel("I’m a label");
	//This for Buttons
	//MyDrawpanl dr=new MyDrawpanl();
	
//	 JButton label	Button = new JButton("Change Label");
//		labelButton.addActionListener(new LabelListener());
//		
//		JButton	ColorBtn = new JButton("Change Color");
//		ColorBtn.addActionListener(new ColorlListener());
//	frame.getContentPane().add(BorderLayout.SOUTH, ColorBtn);
//	frame.getContentPane().add(BorderLayout.CENTER, dr);
//	frame.getContentPane().add(BorderLayout.EAST, labelButton);
//	frame.getContentPane().add(BorderLayout.WEST, label);
	MyDrawPanel drawPanel=new MyDrawPanel();
	frame.getContentPane().add(drawPanel);
	frame.setSize(400,400);
	frame.setVisible(true);
	//this For Animation
	for (int i =0 ;i <130; i++)
	{
		x++;
		y++ ;
		drawPanel.repaint();
		try {
			Thread.sleep(50);
			} catch(Exception ex) { }
	}
	
	
	
}	
		
	

   class LabelListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 label.setText("Ouch ! ! !");;
	}
   }
	class ColorlListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			 frame.repaint();
		}
	}
	class MyDrawPanel extends JPanel {
		
		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0,0,this.getWidth(), this.getHeight());
			g.setColor(Color.green);
			g.fillOval(x,y,40,40);
//		g.setColor(Color.orange);
//		g.fillOval(x,y,100,100);
		}
		}
}


