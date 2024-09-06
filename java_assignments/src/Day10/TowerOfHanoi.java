package Day10;

public class TowerOfHanoi {
	
	public static void hanoi(int n, char rodFrom, char rodMiddle, char rodTo) {
		if(n==1) {
			System.out.println("Disc 1 moved from "+rodFrom+" To "+rodTo);
			return;
		}
		//A to B
		hanoi(n-1,rodFrom,rodTo,rodMiddle);
		
		//A to C
		System.out.println("Disc "+n+" moved from "+rodFrom+" To "+rodTo);
		
		//B to C
		hanoi(n-1,rodMiddle,rodFrom,rodTo);
	}
	
	public static void main(String[] args) {
		System.out.println("1 ring only ");
		hanoi(1, 'A', 'B', 'C');
		System.out.println("\n3 rings ");
		hanoi(3, 'A', 'B', 'C');

	}

}
