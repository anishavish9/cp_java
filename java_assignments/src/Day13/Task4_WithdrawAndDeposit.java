/*
 *Task 4: Synchronized Blocks and Methods
Write a program that simulates a bank account being accessed by multiple threads 
to perform deposits and withdrawals using synchronized methods to prevent race conditions.
 */

package Day13;

class Bank {
	private double balance;
	
	synchronized void deposit(double amount) {
		try {
			balance += amount;
			System.out.println(Thread.currentThread().getName()+" Amount deposited : "+amount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized void withdraw(double amount) {
		try {
			if(amount <= balance) {
				balance -= amount;
				System.out.println(Thread.currentThread().getName()+" Withdraw amount : "+amount);
			}
			else {
				System.out.println(Thread.currentThread().getName()+" Fail to withdraw");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	double getBalance() {
		return balance;
	}
}


class Account implements Runnable{
	Bank account;
	public Account(Bank account) {
		this.account = account;
	}
	
	@Override
	public void run() {
        for (double i = 100; i <= 1000; i+=200) {
        	account.deposit(i);
            account.withdraw(i-50);
            System.out.println("balance in account : " + account.getBalance() +"\n");
        }
		
	}
	
}


public class Task4_WithdrawAndDeposit {

	public static void main(String[] args) throws InterruptedException {
		Bank b = new Bank();
		Account account1 = new Account(b);
		Thread t1 = new Thread(account1, "Thread 1");
		
		Account account2 = new Account(b);
		Thread t2 = new Thread(account2, "Thread 2");
		
		t1.start();
		t1.join();
		t2.start();
	
	}

}
