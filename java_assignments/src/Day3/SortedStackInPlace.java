/*
 * 1. Stack Sorting In-Place
You must write a function to sort a stack such that the smallest items are on the top. 
You can use an additional temporary stack, but you may not copy the elements into 
	any other data structure such as an array. 
The stack supports the following operations: push, pop, peek, and isEmpty.

 */
package Day3;

import java.util.Stack;

public class SortedStackInPlace {
	 //sorting 
    static void sortingStack(Stack<Integer> stack) {
    	Stack<Integer> newStack = new Stack<Integer>();
    	while(!stack.isEmpty()) {
    		int element = stack.pop();
    		while(!newStack.isEmpty() && newStack.peek() < element) {
				stack.push(newStack.pop());
    		}
    		newStack.push(element);
    	}
    	while(!newStack.isEmpty()) {
    		stack.push(newStack.pop());
    	}
    	 	
    }
    
    public static void main(String args[])
    {
    	Stack<Integer> stack = new Stack<Integer>();
        stack.push(51);
        stack.push(25);
        stack.push(86);
        stack.push(34);
        stack.push(5);
        System.out.println("Stack before sort :" + stack);
        sortingStack(stack);
        System.out.println("Stack after sort :" + stack);

    }

}
