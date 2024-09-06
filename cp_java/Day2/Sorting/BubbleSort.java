package Sorting;

public class BubbleSort {
	
    static void bubbleSort(int[] arr) {
        int n = arr.length, temp = 0;
        for(int i = 0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("\nFirst interation complete---- for i : "+i);
            display(arr);
        }

    }
    
    static void display(int[] arr) {
    	for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};
        System.out.println("Array Before Bubble Sort");
        display(arr);
        //sorting
        bubbleSort(arr);
        System.out.println("\nArray After Bubble Sort");
        display(arr);
    }

}
