package LongestSequence;

public class LongestIncresingSequence {

	public static void main(String[] args) {
		int arr[] = {7,7,10,9,15,10,13,16};
		int length = longestIncresingSequence(arr);
		System.out.println("Longest Incresing Sequence : " + length);
		

	}

	private static int longestIncresingSequence(int[] arr) {
		int n = arr.length;
		int list[] = new int[n];
		for(int i =0; i<n; i++) {
			list[i] = 1;
		}
		for(int i =1; i<n; i++) {
			for(int j =0; j<i; j++) {
				if(arr[i] > arr[j] && list[i] < list[j] +1) {
					list[i] = list[j] +1;
				}
			}
		}
		int m =0;
		for(int i =0; i<n; i++) {
			if(m<list[i]) {
				m=list[i];
			}
		}
		return m;
	}

}
