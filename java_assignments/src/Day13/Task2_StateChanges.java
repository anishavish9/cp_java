/*
 * Task 2: States and Transitions
Create a Java class that simulates a thread going through different lifecycle states: 
NEW, RUNNABLE, WAITING, TIMED_WAITING, BLOCKED, and TERMINATED. 
Use methods like sleep(), wait(), notify(), and join() to demonstrate these states..
 */

package Day13;

public class Task2_StateChanges implements Runnable {
	 public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(Thread.currentThread().getName() + "-------" + i + " ");
	            if(i%2 ==0) {
	            	
	            }
	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                System.out.println("Thread Interrupted");
	            }
	        }
	    }

	    public static void main(String[] args) throws InterruptedException {
	    	Task2_StateChanges t1 = new Task2_StateChanges();
	        Thread thread1 = new Thread(t1, "Thread 1");
	        Task2_StateChanges t2 = new Task2_StateChanges();
	        Thread thread2 = new Thread(t2, "Thread 2");
	        System.out.println("thread 1 priority : "+thread1.getPriority());
	        System.out.println("thread 1 priority : "+thread1.getStackTrace()+""+thread1.getState());
	        System.out.println("thread 2 priority : "+thread2.getPriority());
	        thread1.start();
	        System.out.println("thread 1 : "+thread1.getName()+" "+thread1.isAlive());
	        thread1.join();//let the current thread to complete first
	        System.out.println("thread 1 : "+thread1.getName()+" "+thread1.isAlive());
	        thread2.start();
	        System.out.println("thread 2 : "+thread2.getName()+" "+thread2.isAlive());
	        
	    }

}


