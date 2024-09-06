package bitWiseManipulation;

import java.util.Scanner;

public class TotalSetBit {
	
	private static int countSetBit(int n) {
		int r =0;
		while(n>0) {
			if(n % 2 != 0) {
				r++;
			}
			n = n/2;
		}
		return r;

	}
	
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Integer ");
		n = scan.nextInt();
//		int r = countSetBit(n);
//		System.out.println("n is " + n +" bit wise " + r);
		System.out.println("Total set bit wise :" + counts(n));
	}

	private static int counts(int n) {
		int bitcounts =0;
		for(int i =1; i<=n; i++) {
			bitcounts = bitcounts + countSetBit(i);
		}
		return bitcounts;
	}

}
