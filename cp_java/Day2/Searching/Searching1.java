package Searching;

import java.util.Arrays;

public class Searching1 {
	
	private static String searching(int[] arr, int data) {
		int first = 0, last = arr.length-1, mid;
		while(first <= last) {
			mid= (last-first)/2;
			if(data == arr[mid]) {
				return "Found at index : "+mid;
			}
			else if(data > arr[mid]) {
				first = mid+1;
			}
			else {
				last = mid-1;
			}
		}
		return "Not found";
		
	}
	
	public static void main(String[] args) {
		int[] arr = {12, 34, 4, 6, 22, 5, 10};
		Arrays.sort(arr);
		try {
			String s = searching(arr, 5);
			System.out.println(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
