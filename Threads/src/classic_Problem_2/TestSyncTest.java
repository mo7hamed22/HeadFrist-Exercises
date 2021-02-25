package classic_Problem_2;

public class TestSyncTest {
	public static void main (String[] args) {
	TestSync job = new TestSync();
	Thread a = new Thread(job);
	Thread b = new Thread(job);
	a.start();
	b.start();
	}
}
class TestSync implements Runnable {
		private int balance;
		public void run() {
		for(int i = 0; i < 50; i++) {
		increment();
		System.out.println("balance is " + balance);
		}
		}
		public void increment() {
		int i = balance;
		balance = i + 1;
		}
}
/*
 * We lost the last updates
that Thread A made!
Thread B had previously
done a ‘read’ of the value
of balance, and when B
woke up, it just kept going
as if it never missed a beat.*/
//==================================================To Solve It While Also Used Synchronized 
/*
 * Once a thread enters
the method, we have
to make sure that all
the steps in the method
complete (as one
atomic process) before
any other thread can
enter the method.*/
//======SO Only Make The Method Synchronized comment Above One

  /*public synchronized void increment() {
int i = balance;
balance = i + 1;
}
  }*/






