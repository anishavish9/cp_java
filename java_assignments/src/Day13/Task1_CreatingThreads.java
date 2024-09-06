/*
 * 1.Task 1: Creating and Managing Threads
Write a program that starts two threads, where each thread prints numbers from 1 to 10 
with a 1-second delay between each number
 */

package Day13;

public class Task1_CreatingThreads extends Thread{
	public void run() {
        for(int i=1; i<=10; i++) {
            System.out.println(currentThread().getName() + "-------" + i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }

	public static void main(String[] args) {
		Task1_CreatingThreads t1 = new Task1_CreatingThreads();
		Task1_CreatingThreads t2 = new Task1_CreatingThreads();
		t1.start();
		t2.start();
	}
}
