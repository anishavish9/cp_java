package Sorting;

import java.util.Arrays;

public class QuickSort {

	static int partition(int array[], int low, int high) {
  	   int pivot = array[high];
	   // pointer for greater element
	   int i = (low - 1);
	   // traverse through all elements
	   // compare each element with pivot   { 8, 7, 2, 1, 0, 9, 6 }
	   for (int j = low; j < high; j++) { //1. j=0 to 6(7-1)
	     if (array[j] <= pivot) {	 
	       //swapping greater to smaller
	       i++;
	       int temp = array[i];
	       array[i] = array[j];
	       array[j] = temp;
	       
	     }
	   }	 
	   //put pivot on ith(middle) index
	   int temp = array[i + 1];
	   array[i + 1] = array[high];
	   array[high] = temp;
	   // return the position from where partition is done
	   return (i + 1);
	 }
	 
	 static void quickSort(int array[], int low, int high) {
		 if (low < high) {
		     int p = partition(array, low, high);
		     quickSort(array, low, p - 1);
		     quickSort(array, p + 1, high);
		 }
	 }
	 
	 public static void main(String args[]) {
		  int[] arr = { 8, 7, 2, 1, 0, 9, 6 };
		  System.out.println("Unsorted Array");
		  System.out.println(Arrays.toString(arr));
		  int size = arr.length;
		  quickSort(arr, 0, size - 1);
		  System.out.println("Sorted Array in Ascending Order ");
		  System.out.println(Arrays.toString(arr));
	 }

}
