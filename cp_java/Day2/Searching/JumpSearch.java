package Searching;

public class JumpSearch {
	
	public static int jumpSearch(int[] arr, int x) {
	      int n = arr.length;
	      // Finding block size 
	      int step = (int) Math.floor(Math.sqrt(n)); // 2,4,7,9 - 4 : 2   find 7
	      int prev = 0;
	      
	      // Finding the block prev to step
	      while (arr[Math.min(step, n) - 1] < x) {
	           System.out.println("jump in this block: "+prev+" to "+step);
	           prev = step;//2
	           step += (int) Math.floor(Math.sqrt(n));//4
	           if (prev >= n)
	               return -1; // not present in the array	
	      }
	      
          System.out.println("jump out and search in this block: "+prev+" to "+step);
	      // linear search
	      while (arr[prev] < x) {
	           prev++;
	           if (prev == Math.min(step, n))
	               return -1; // not present
	      }
	      if (arr[prev] == x)
	           return prev;
	 
	      return -1; // not present in the array
	  }
	 
	  public static void main(String[] args) {
	      int[] arr = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
	      int x = 55; 
 	      int index = jumpSearch(arr, x);	 
	      if (index != -1)
	           System.out.println("Element " + x + " is at index " + index);
	      else
	           System.out.println("Element " + x + " is not present in the array");
	  }

}
