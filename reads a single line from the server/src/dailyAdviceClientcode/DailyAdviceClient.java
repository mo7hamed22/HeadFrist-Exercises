package dailyAdviceClientcode;

import java.io.*;
import java.net.*;//The Class Socket Here
public class DailyAdviceClient {
	void go()
	{
		try {
			//Make A socket running in port 4242 in the same local host 
			Socket socket =new Socket("127.0.0.1",4242);
			//Bridge Between Socket (Low_level) _Buffer(High) 
			InputStreamReader reader=new InputStreamReader(socket.getInputStream());
			//Chain The Buffer to Stream to get input from Socket
			BufferedReader bufferedReader =new BufferedReader(reader);
			String advice =bufferedReader.readLine();
			System.out.println("Today you should: " + advice);
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		DailyAdviceClient client =new DailyAdviceClient();
		client.go();
	}

}
