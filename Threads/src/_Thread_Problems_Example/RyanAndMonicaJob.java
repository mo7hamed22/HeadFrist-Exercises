
package _Thread_Problems_Example;

 class BankAccount{
	private int balance = 100;
public int getBalance() {
return balance;
	}
public void withdraw(int amount) {
balance = balance - amount;
	}
}

public class RyanAndMonicaJob implements Runnable{
	private BankAccount account = new BankAccount();
	public static void main(String[] args) {
		RyanAndMonicaJob theJob =new RyanAndMonicaJob();
		Thread one = new Thread(theJob);
		Thread two = new Thread(theJob);
		one.setName("Ryan");
		two.setName("Monica");
		one.start();
		two.start();
		
	}
	@Override
	public void run() {
		for (int x = 0; x < 10; x++) {
			makeWithdrawal(10);
			if (account.getBalance() < 0) {
			System.out.println("Overdrawn!");
			}
		}
		
	}
	private void makeWithdrawal (int amount) {
		if (account.getBalance() >= amount) {
		System.out.println(Thread.currentThread().getName() + " is about to withdraw");
		try {
		System.out.println(Thread.currentThread().getName() + " is going to sleep");
		Thread.sleep(500);
		} catch(InterruptedException ex) {ex.printStackTrace(); }
		System.out.println(Thread.currentThread().getName() + " woke up.");
		account.withdraw(amount);
		System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		}
		else {
		System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
		}
		

}
  }//close class
	
/*
 * The example shows what can happen when two
threads (Ryan and Monica) share a single object (the bank
account).
The code has two classes, BankAccount, and
MonicaAndRyanJob. The MonicaAndRyanJob class
implements Runnable, and represents the behavior that Ryan
and Monica both have—checking the balance and making
withdrawals. But of course, each thread falls asleep in between
checking the balance and actually making the withdrawal. int balance
The MonicaAndRyanJob class has an instance variable of type
BankAccount., that represents their shared account.*/
//===============The simple Solve For this Problem id to Use ' synchronized ' Use the synchronized keyword 
//to modify a method so that only one thread at a time can access it.
/*So comment Above Method And Use This Only One Thing changed*/






///*private synchronized void  makeWithdrawal (int amount) {
//	if (account.getBalance() >= amount) {
//	System.out.println(Thread.currentThread().getName() + " is about to withdraw");
//	try {
//	System.out.println(Thread.currentThread().getName() + " is going to sleep");
//	Thread.sleep(500);
//	} catch(InterruptedException ex) {ex.printStackTrace(); }
//	System.out.println(Thread.currentThread().getName() + " woke up.");
//	account.withdraw(amount);
//	System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
//	}
//	else {
//	System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
//	}
//	
//
//}
//}//close class
//*/
