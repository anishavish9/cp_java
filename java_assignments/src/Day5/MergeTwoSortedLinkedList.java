/*
 * Merging two sorted linked list
You are provided with heads of two sorted linked lists. 
The lists are sorted in ascending order. 
Create a merged linked lists using any extra spaces(i.e, do not create any new node)
 */

package Day5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLinkedList {
	
	public static void main(String[] args) {
		List<Integer> list1 = List.of(23, 25, 30, 38, 40, 70);
		List<Integer> list2 = List.of(20, 45, 55, 60, 80);
		LinkedList<Integer> linkedlist1 = new LinkedList<Integer>();
		LinkedList<Integer> linkedlist2 = new LinkedList<Integer>();
		linkedlist1.addAll(list1);
		linkedlist2.addAll(list2);
		LinkedList<Integer> mergedList = mergeTwoSortedLinkedList(linkedlist1, linkedlist2);
		System.out.println(mergedList);



	}

	private static LinkedList<Integer> mergeTwoSortedLinkedList(
			LinkedList<Integer> linkedlist1,
			LinkedList<Integer> linkedlist2
	) {
		LinkedList<Integer> tempLinkedList = new LinkedList<Integer>();
		int[] temp = new int[linkedlist1.size()+linkedlist2.size()];
		int i = 0;
		for(int e : linkedlist1) {
			temp[i] = e;
			i++;
		}
		for(int e : linkedlist2) {
			temp[i]=e;
			i++;
		}
		Arrays.sort(temp);
		for(int e : temp) {
			tempLinkedList.add(e);
		}
	
		return tempLinkedList;
	}

}
