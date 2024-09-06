package synchronization;

public class SynchronizationMethods {
	synchronized public void createTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n+ " * "+ i+ " = "+ n*i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println("Thread Interrupted");
			}
		}
	}

	public static void main(String args[])
	{
		SynchronizationMethods  object = new SynchronizationMethods();
		Thread1 t1 = new Thread1(object);
		Thread2 t2 = new Thread2(object);
		t1.start();
		t2.start();
	}

}
class Thread1 extends Thread
{
	SynchronizationMethods  obj;
	public Thread1(SynchronizationMethods  o)
	{
		this.obj = o;
	}
	public void run()
	{
		obj.createTable(10);
	}
}
class Thread2 extends Thread
{
	SynchronizationMethods  obj;
	public Thread2(SynchronizationMethods  o)
	{
		this.obj = o;
	}
	public void run()
	{
		obj.createTable(20);
	}
}

