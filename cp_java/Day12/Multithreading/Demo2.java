package Multithreading;

public class Demo2 implements Runnable{
	 public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(Thread.currentThread().getName() + "-------" + i + " ");
	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                System.out.println("Thread Interrupted");
	            }
	        }
	    }

	    public static void main(String[] args) throws InterruptedException {
	        Demo2 t1 = new Demo2();
	        Thread thread1 = new Thread(t1, "Thread 1");
	        Demo2 t2 = new Demo2();
	        Thread thread2 = new Thread(t2, "Thread 2");
//	        System.out.println("thread 1 priority : "+thread1.getPriority());
//	        System.out.println("thread 1 priority : "+thread1.getStackTrace()+""+thread1.getState());
//	        System.out.println("thread 2 priority : "+thread2.getPriority());
	        thread1.start();
	        //thread1.join();
	        System.out.println("hii");
//	        System.out.println("thread 1 : "+thread1.getName()+" "+thread1.isAlive());
//	        thread1.join();//let the current thread to complete first
//	        System.out.println("thread 1 : "+thread1.getName()+" "+thread1.isAlive());
	        thread2.start();
	       // System.out.println("thread 2 : "+thread2.getName()+" "+thread2.isAlive());
	    }

}
