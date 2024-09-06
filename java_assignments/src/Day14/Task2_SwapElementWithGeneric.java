/*
 *  Task 2: Generic Classes and Methods
	Implement a generic method that swaps the positions of two elements in an array, 
	regardless of their type, and demonstrate its usage with different object types.
 */

package Day14;

public class Task2_SwapElementWithGeneric {
	private static <T> void swap(T[] t, int p1, int p2) {
		T temp = t[p1-1];
		t[p1-1] =t[p2-1];
		t[p2-1] = temp;
	}
	
	private static <T> void show(T[] x) {
		for(T t : x) {
			System.out.println(t);
		}
	}
	
	public static void main(String[] args) {
		String arr[] = {"c++", "java", "python"};
		Integer n[] = {8,2,3,5,9};
		
		show(arr);
		swap(arr, 1, 3);
		System.out.println("After swapping " );
		show(arr);
		
		show(n);
		swap(n, 2, 4);
		System.out.println("After swapping ");
		show(n);

	}

}
