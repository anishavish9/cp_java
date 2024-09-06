package Queue;

public class QueueString {
	int queueLength = 3;
    String items[] = new String[queueLength];
    int front = -1;
    int back = -1;
    
    boolean isFull() {
        return back == queueLength - 1;
    }
    
    boolean isEmpty() {
        return front == -1 && back == -1;
    }

    void enQueue(String itemValue) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (front == -1 && back == -1) {
            front = back = 0;
            items[back] = itemValue;
        } else {
            back++;
            items[back] = itemValue;
        }
    }
   
    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else if (front == back) {
            front = back = -1;
        } else {
            front++;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= back; i++) {
                System.out.println(items[i]);
            }
        }
    }
    void peak() {
        if (!isEmpty()) {
            System.out.println("Front value is: " + items[front]);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public static void main(String[] args) {
        QueueString myQueue = new QueueString();
        myQueue.enQueue("apple");
        myQueue.enQueue("banana");
        myQueue.enQueue("cherry");

        myQueue.display();
        myQueue.peak();
    }


}
