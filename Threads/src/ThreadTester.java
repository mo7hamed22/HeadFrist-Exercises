import java.*;
import java.io.IOException;
import java.nio.CharBuffer;


public class ThreadTester {
	public static void main(String[] args) {
		MyRunnable myRunnable =new MyRunnable();
		Thread thread =new Thread(myRunnable);
		thread.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello From Main !!!!! Thread");
	}

}
class MyRunnable implements Runnable{

	@Override
	public void run() {
             go();		
	}
		public void go() {
			System.out.println("Hello From New Thread ");
			
		}

	
	
} 
