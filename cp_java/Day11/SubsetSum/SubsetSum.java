package SubsetSum;

public class SubsetSum {

	public static void main(String[] args) {
		int set[] = {5,10,12,13,15,18};
		int sum = 30;
		int n  = set.length;
		if(isSubset(set,n,sum)) {
			System.out.println("Subset present");
		}
		else {
			System.out.println("Not present");
		}

	}

	private static boolean isSubset(int[] set, int n, int sum) {
		
		if(sum == 0) {
			return true;
		}
		if(n==0 && sum!=0) {
			return false;
		}
		if(set[n-1] > sum) {
			return isSubset(set, n-1, sum);
		}
		//				including elements             excluding elements
		return (isSubset(set, n-1, sum-set[n-1]) || isSubset(set, n-1, sum));
	}

}
