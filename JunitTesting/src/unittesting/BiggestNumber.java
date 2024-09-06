package unittesting;

public class BiggestNumber {
	
	public static int biggestNumber(int[] arr) {
		int biggest = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(biggest < arr[i]) {
				biggest =  arr[i];
			}
		}
		return biggest;
	}

}
