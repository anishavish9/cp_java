package graph;
public class FlyoedWarshallDemo {
	public static void main(String[] args) {
		int INF = 99999; // Use a large number to represent infinity
		// Initialize a 4x4 adjacency matrix for the graph
		int[][] a = {
				{0, 3, INF, 7},
				{8, 0, 2, INF},
				{5, INF, 0, 1},
				{2, INF, INF,0}
		};
		int n = a.length;
		//find the shortest pair path
		findShotestPair(a,n);
		//print shortest pair distance
		printShortest(a,n);	
	}
	
	private static void findShotestPair(int[][] a, int n) {
		//shortest pair will saved in the position
		//'k' for every vertices from 1 to 4
		for(int k =0; k<n; k++) {
			for(int i =0;i<n; i++) {
				for(int j =0; j<n; j++) {
					a[i][j] = Math.min(a[i][j],(a[i][k]+a[k][j]));
				}
			}
		}
	}
	
	private static void printShortest(int[][] a, int n) {
		for(int i =0;i<n; i++) {
			for(int j =0; j<n; j++) {
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
