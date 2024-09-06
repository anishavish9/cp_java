/*
 *Searching for sequence in stack
	Given a stack and a small array representing a sequence, 
	write a function that determines if the sequence is present in the stack.
	Consider the sequence present if, upon popping the elements,
	all elements of array appear consecutively in the stack. 
 */

package Day4;

import java.util.Arrays;
import java.util.Stack;

public class FindSequenceInStack {

	public static void main(String[] args) {
		int[] array = {3,4,5};
		System.out.println("Array sequence : "+Arrays.toString(array));
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(3);
		stack.push(10);
		stack.push(8);
		stack.push(1);
		System.out.println("Stack is : "+stack);
		isSequenceInStack(array, stack);
		System.out.println(stack);
	}

	private static void isSequenceInStack(int[] array, Stack<Integer> stack) {
		Object[] stackToArray = stack.toArray();
		int[] restore = new int[stackToArray.length];
		int i =0,j=0;//startIndex=-1 ,endIndex=-1;
		
		while(i<array.length && j<stackToArray.length) {
			if(stackToArray[j].equals(array[i])) {
				restore[i] = (int)stackToArray[j];
//				if(i==0) {
//					startIndex = j;
//				}
				i++;
			}
			else {
				i=0;
				//startIndex=-1;
			}
			j++;
			
		}
		//endIndex = j--;
		for(int e : restore) {
			if(e!=0) {
				stack.push(e);
			}
			
		}
		if(i==array.length) {
			System.out.println("Found the array in stack ");//from index :"+startIndex+" to "+endIndex);
			
		}
		
		
	}

}
