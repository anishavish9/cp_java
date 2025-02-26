package Sorting;

public class MergeSort {

	   void merge(int arr[], int left, int mid, int right)
	   {
	       // Find sizes of two subarrays to be merged
	       int n1 = mid - left + 1;
	       int n2 = right - mid;
	
	       int L[] = new int[n1];
	       int R[] = new int[n2];
	 
	       // Copy data to temp arrays
	       for (int i = 0; i < n1; ++i)
	           L[i] = arr[left + i];
	       for (int j = 0; j < n2; ++j)
	           R[j] = arr[mid + 1 + j];
	 
	       // Merge the temp arrays
	       int i = 0, j = 0, k = left;
	       while (i < n1 && j < n2) {
	           if (L[i] <= R[j]) {
	               arr[k] = L[i];
	               i++;
	           } else {
	               arr[k] = R[j];
	               j++;
	           }
	           k++;
	       }
	 
	       // Copy remaining elements of L[] if any
	       while (i < n1) {
	           arr[k] = L[i];
	           i++;
	           k++;
	       }
	 
	       // Copy remaining elements of R[] if any
	       while (j < n2) {
	           arr[k] = R[j];
	           j++;
	           k++;
	       }
	   }
	 
	   // Main function that sorts arr[l..r] using merge()
	   void sort(int arr[], int left, int right) {
	       if (left < right) {
	           // Find the middlefte point
	           int mid = (left + right) / 2;
	           									//{ 12, 11, 13, 5, 6, 7 }
	           // Sort left and second 
	           sort(arr, left, mid);
	           sort(arr, mid+1, right);
	 
	           // Merge the sorted halves
	           merge(arr, left, mid, right);
	       }
	   }
	 
	   // print method
	   static void printArray(int arr[]) {
	       int n = arr.length;
	       for (int i = 0; i < n; ++i)
	           System.out.print(arr[i] + " ");
	       System.out.println();
	   }
	 
	   // Main method
	   public static void main(String args[]) {
	       int arr[] = { 12, 11, 13, 5, 6, 7 };
	       System.out.println("Given Array");
	       printArray(arr);
	 
	       MergeSort ob = new MergeSort();
	       ob.sort(arr, 0, arr.length - 1);
	 
	       System.out.println("\nSorted array");
	       printArray(arr);
	   }

}
