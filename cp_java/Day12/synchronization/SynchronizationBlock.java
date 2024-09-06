package synchronization;

public class SynchronizationBlock {
	public void createTable(int n) {
		System.out.println(Thread.currentThread().getName()); // This part is not synchronized.
		synchronized (this) { //  This part is synchronized.
			for (int i = 1; i <= 5; i++) {
				System.out.println(n + " * " + i + " = " + n * i);
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("Thread Interrupted");
				}
			}
		}

	}

	public static void main(String [] args)
	{
		SynchronizationBlock t = new SynchronizationBlock();
		Thread_1 t1 = new Thread_1(t);
		t1.start();
		Thread_2 t2 = new Thread_2(t);
		t2.start();
	}

}
class Thread_1 extends Thread
{
	SynchronizationBlock obj;
	public Thread_1(SynchronizationBlock o)
	{
		this.obj = o;
	}
	public void run()
	{
		obj.createTable(10);
	}
}
class Thread_2 extends Thread
{
	SynchronizationBlock obj;
	public Thread_2(SynchronizationBlock o)
	{
		this.obj = o;
	}
	public void run()
	{
		obj.createTable(20);
	}
}



