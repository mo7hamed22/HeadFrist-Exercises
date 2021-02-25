package version_One_send_only;

import java.io.*;
import javax.swing.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;


public class SimpleChatClientA {
	JTextField outgoing;
	PrintWriter writer;
	Socket sock;
	// make gui and register a listener with the send button
	// call the setUpNetworking() method
	public void go()
	{
		JFrame frame = new JFrame("Ludicrously Simple Chat Client");
		JPanel mainPanel = new JPanel();
		outgoing =new JTextField(20);
		JButton sendButton =new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		setUpNetworking();
		frame.setSize(400,500);
		frame.setVisible(true);
		
	}//close 
	private void setUpNetworking() {
		try {
			sock =new Socket("127.0.0.1",4242);
			writer=new PrintWriter(sock.getOutputStream());
			System.out.println("networking established");
			sock.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	class SendButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			writer.println(outgoing.getText());
			writer.flush();//whenever we print it goes to the server
			outgoing.setText("");
			outgoing.requestFocus();
		}
		
	}// close SendButtonListener inner class
	public static void main(String[] args) {
		new SimpleChatClientA().go();
	}
}
