package Searching;

public class LinearSearch {

	private static String searching(int[] arr, int data) {
		for(int i = 0; i < arr.length; i++) {
			if(data == arr[i]) {
				return "Found at index : "+i;
			}
		}
		return "Not found";
		
	}
	
	public static void main(String[] args) {
		int[] arr = {12, 34, 4, 6, 22, 5, 10};
		try {
			String s = searching(arr, 22);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
