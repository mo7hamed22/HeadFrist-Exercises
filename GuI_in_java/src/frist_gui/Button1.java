package frist_gui;

//Border_Layout {
	import javax.swing.*;
	import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	//BorderLayout is in
	//java.awt package
	public class Button1 implements ActionListener{
		JTextArea text;

	public static void main (String[] args) {
	Button1 gui = new Button1();
	gui.go();
	}
	
	public void go() {
/*BorderLayout cares
 * about five regions:
 * 	east, west, north,
 * 	south, and center*/
//	JFrame frame = new JFrame();
//	JButton button = new JButton(" click me mohamed lsaKJSKLAJ ");
//	
//	Font bigFont = new Font("serif", Font.BOLD, 28/*Font Size*/);//this will give taller if it in south or north
//	frame.getContentPane().add(BorderLayout.NORTH, button);
//	button.setFont(bigFont);
//	frame.setSize(200,200);
//	frame.setVisible(true);
		/*FlowLayout cares
		 * about the flow of the components: 
		 * left to right, top to bottom, in
		 * the order they were added.
		 * */
//		JFrame frame = new JFrame();
//		//Make the panel gray so we
//		JPanel panel = new JPanel();
//		//where it is on the frame.
//		panel.setBackground(Color.darkGray);
//		frame.getContentPane().add(BorderLayout.EAST, panel);
//		JButton button = new JButton("shock me ");
//		JButton buttonTwo = new JButton("bliss");
//		panel.add(button);
//		panel.add(buttonTwo);
//		frame.getContentPane().add(BorderLayout.EAST, panel);
//		frame.setSize(200,200);
//		frame.setVisible(true);
		/*Unlike FlowLayout, BoxLayout can force a
			*‘new line’ to make the components wrap to
			*the next line, even if there’s room for them
			*to fit horizontally.
		  */
		
//		JFrame frame = new JFrame();
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.darkGray);
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		JButton button = new JButton("shock me ");
//		JButton buttonTwo = new JButton("bliss");
//		panel.add(button);
//		panel.add(buttonTwo);
//		frame.getContentPane().add(BorderLayout.EAST, panel);
//		frame.setSize(200,200);
//		frame.setVisible(true);
		
		//====================Make Text Area
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Just Click It");
		button.addActionListener(this);
		text = new JTextArea(10,20);
		text.setLineWrap(true);
		JScrollPane scroller = new JScrollPane(text);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		
		frame.setSize(350,300);
		frame.setVisible(true);
	}
		

		@Override
		public void actionPerformed(ActionEvent e) {
			text.append(" button clicked \n ");

		}
		
		
		
}
	
