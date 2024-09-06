package Day9;

import java.util.Arrays;

public class NonRepeatingElement {
	 
	public static void nonRepeating(int[] arr) {
	      int xor = 0;
	      for(int n:arr) {
	          xor = xor ^ n;
	      }
	      int setBit = xor & ~(xor -1);
	      int x = 0, y= 0;
	      for(int num : arr) {
	          if((num & setBit) != 0) {
	              x = x^num;
	        	  System.out.println("elements in x : "+num);
	          }
	          else {
	              y = y^num;
	              System.out.println("elements in y : "+num);
	          }
	      }
//	      System.out.println("Non repeating elements in the array are :  "+x +"  "+y);
	    }

	    public static void main(String args[]) {

	        int []arr = {1,2,3,2,1,4};

	        System.out.println("Array is :"+ Arrays.toString(arr));

	        nonRepeating(arr);

	    }

}
