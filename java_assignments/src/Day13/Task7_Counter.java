/*
 * Task 7 : Writing Thread-Safe Code
Design a thread-safe Counter class with increment and decrement methods. 
Then demonstrate its usage from multiple threads. 
 */

package Day13;

import java.util.concurrent.atomic.AtomicInteger;

class Count {
	private AtomicInteger a = new AtomicInteger(10);
	
	public void increment() {
		a.incrementAndGet();
	}
	
	public void decrement() {
		a.decrementAndGet();
	}
	
	public int getTotal() {
		return a.get();
	}
}

public class Task7_Counter {

	public static void main(String[] args) throws InterruptedException {
		Count c = new Count();
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				for(int i =1; i<=10; i++)   {
					System.out.println("Thread  "+ Thread.currentThread().getName() +" before:"+c.getTotal() );
					c.increment();
					System.out.println("Thread  "+ Thread.currentThread().getName() +" after :"+c.getTotal() );
				}
				System.out.println(
					"\nTotal increment by Thread "+Thread.currentThread().getName()+" : "+c.getTotal());
 				
			}
		};
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
//		t1.join();
		t2.start();
	}

}
