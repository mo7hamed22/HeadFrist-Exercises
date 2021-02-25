package dailyAdviceServer_code;
import java.io.*;
import java.net.*;


public class DailyAdviceServer {
	String[] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOTmake you look fat.",
			"One word: inappropriate", "Just for today, be honest. Tell yourboss what you *really* think",
			"You might want to rethink that haircut."};
	
	public void go() {
		
		try {
			ServerSocket serverSocket =new ServerSocket(4242);
			while (true) {
				Socket socket =serverSocket.accept();
				PrintWriter printWriter =new PrintWriter(socket.getOutputStream());
				String Advice = getAdvice();
				printWriter.print(Advice);
				printWriter.close();
				System.out.println(Advice);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	private	String getAdvice()
	{
		int random =(int)(Math.random() * adviceList.length);
		return adviceList[random];
	}
	public static void main(String[] args) {
		DailyAdviceServer server =new DailyAdviceServer();
		server.go();
	}

}
