package bitWiseManipulation;

import java.util.Scanner;

public class CountSetBit {

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

	public static int brian(int n) {
		int r =0;
		while (n > 0) {
			n = n & (n-1);
			r++;
		}
		return r;
	}
	
	public static int countSetBitRightShift(int n) {
		int r =0;
		while (n > 0) {
			if ((n & 1)== 1) {
				r++;
			}
			n>>=1;
		}
		return r;

	}
	public static int countSetBitLeftShift(int n) {
		int r =0;
		while (n > 0) {
			if ((n & 1)== 1) {
				r++;
			}
			n<<=1;
		}
		return r;

	}

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Integer ");
		n = scan.nextInt();
		int r = countSetBit(n);
		System.out.println("n is " + n +" bit wise " + r);

		System.out.println("Binary representation of n is : "+ Integer.toBinaryString(n));
		System.out.println(
				"Count Set Bit with simple bit manipulation  (right shift) is : "
						+ countSetBitRightShift(n));
		System.out.println(
				"Count Set Bit with simple bit manipulation  (Left shift) is : "
						+ countSetBitLeftShift(n));

		System.out.println("Count Set Bit with Briain bit manipulation is : "+ brian(n));


	}



}
