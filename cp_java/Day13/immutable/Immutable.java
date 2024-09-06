package immutable;

public class Immutable {
	
	private final int x;
	
	public Immutable(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public static void main(String[] args) throws InterruptedException {
		Immutable obj = new Immutable(100);
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(""+Thread.currentThread().getName()+ "final value : " + obj.getX());
				
			}
		};
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		System.out.println(t1.isAlive() + " " + t2.isAlive());
		t1.join();
		t2.start();
		System.out.println(t1.isAlive() + " " + t2.isAlive());
	}

}
