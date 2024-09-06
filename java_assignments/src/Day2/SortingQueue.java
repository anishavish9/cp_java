/*
 * 2. Queue Sorting with Limited Space
You have a queue of integers that you need to sort. 
You can only use additional space equivalent to one stack. 
Describe the steps you would take to sort the elements in the queue.
 */

package Day2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SortingQueue {
	 public static void main(String[] args) {
	        Queue<Integer> queue = new LinkedList<>();
	        queue.add(4);
	        queue.add(2);
	        queue.add(3);
	        queue.add(1);
	        queue.add(5);

	        System.out.println("Original queue: " + queue);
	        sortQueue(queue);
	        System.out.println("Sorted queue: " + queue);
	    }

	    public static void sortQueue(Queue<Integer> queue) {
	        Stack<Integer> stack = new Stack<>();

	        while (!queue.isEmpty()) {
	            int current = queue.poll();

	            //sorted order into queue only
	            while (!stack.isEmpty() && stack.peek() < current) {
	                queue.offer(stack.pop());
	            }
	            stack.push(current);
	        }
	        while (!stack.isEmpty()) {
	            queue.offer(stack.pop());
	        }
	    }

}
