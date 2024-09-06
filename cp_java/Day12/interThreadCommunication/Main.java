package interThreadCommunication;

class Share
{
    private int item;
    private boolean isAvailable = false;
    
    public synchronized void add(int item) {
        while(isAvailable) {
            try {
            	System.out.println("inside add()----->");
                wait();
            } catch (Exception e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("outside add() and notify to consume first----->");
        this.item = item;
        isAvailable = true;
        notify();
    }
    
    public synchronized int retrive() {
      while(!isAvailable) {
          try {
        	  System.out.println("inside retrive()----->");
              wait();
          }
          catch(Exception e) {
              System.out.println("Interrupted");
          }
      }
      System.out.println("outside retrive() and notify to produse first----->");
      isAvailable = false;
      notify();
      return item;
    }


}

class Producer extends Thread {
    private Share share;

    public Producer(Share share) {
        this.share = share;
    }

    public void run() {
    	System.out.println("inside producer run()----->");
        for (int i = 0; i <= 6; i++) {
            share.add(i);
            System.out.println("Produced " + i);
        }
    }
}

class Consumer extends Thread {
    private Share share;

    public Consumer(Share share) {
        this.share = share;
    }

    public void run() {
    	System.out.println("inside consumer run()----->");
        for (int i = 0; i <= 6; i++) {
            System.out.println("Consumed " + share.retrive());
        }
    }


}

public class Main
{
    public static void main(String args[])
    {
       Share share = new Share();
       Producer producer = new Producer(share);
       Consumer consumer = new Consumer(share);
       producer.start();
       consumer.start();
    }
}
