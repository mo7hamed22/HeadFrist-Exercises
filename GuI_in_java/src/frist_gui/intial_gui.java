package frist_gui;
import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.*;
public class intial_gui {
	public static void main(String[] args) {
		intial_gui gui= new intial_gui() ;
		gui.go();
	}

	void go () {
//			JFrame frame =new JFrame();
//		JButton btn =new JButton("  Ok  ");
//		frame.getContentPane().add(BorderLayout.SOUTH,btn);
//		frame.setSize(200, 300);
//		frame.setVisible(true);
		
		//==============Example of Nested Layout
		JFrame frame =new JFrame();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		panelB.add(new JButton("button 1"));
		panelB.add(new JButton("button 2"));
		panelB.add(new JButton("button 3"));
		panelA.add(panelB);
		frame.getContentPane().add(panelA);
		frame.setSize(200, 300);
		frame.setVisible(true);
		

}
}
