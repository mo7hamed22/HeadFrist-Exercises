package ex_unpredictable_thescheduler_can_be;

public class ThreadTestDrive {
public static void main(String[] args) {
	MyRunnable myRunnable =new MyRunnable();
	Thread  thread =new Thread(myRunnable);
	thread.start();
	System.out.println("Main Thread");

	
}
}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		go();
		// TODO Auto-generated method stub
		
	}
	public void go() {
		doMore();
	}
	public void doMore() {
		System.out.println("top o’ the stack");
		}
	

}
