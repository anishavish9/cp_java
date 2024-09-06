package Searching;

public class BinarySearch {

	private static String searching(int[] arr, int data) {
		int first = 0, last = arr.length-1, mid;
		while(first <= last) {
			mid= (first+last)/2;
			if(data == arr[mid]) {
				return "low: "+ first + " : "+ last + " and found at index : "+ mid ;
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
		int[] arr = {12, 34, 44, 60, 70, 75, 84};
		try {
			String search = searching(arr, 44);
			System.out.println(search);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
