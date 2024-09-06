/*
 * Circular queue binary search : 
Consider a circular queue (implemented using a fixed-size array) 
where the elements are sorted but have been rotated at an unknown index. 
Describe an approach to perform a binary search for a given element within this 
circular queue.
 */

package Day5;

public class SearchInCircularQueue {

	 // Modified binary search function
    public static int searchInCircularQueue(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Left part is sorted or right
            if (arr[low] <= arr[mid]) { 
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } 
                else {
                    low = mid + 1;
                }
            } 
            else { 
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                } 
                else {
                    high = mid - 1;
                }
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
    	//arr = 12, 34, 44, 60, 70, 75, 84 
        int[] arr = {70, 75, 84, 12, 34, 44, 60};//after rotated from index 4
        int target = 44;
        int result = searchInCircularQueue(arr, target);
        System.out.println("Index of target " + target + " is " + result);
    }

}
