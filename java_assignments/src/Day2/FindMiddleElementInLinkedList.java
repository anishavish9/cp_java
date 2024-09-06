/*
 * 1.Linked List Middle Element Search 
You are given a singly linked list. 
Write a function to find the middle element without 
	using any extra space and only one traversal through the linked list.
 */

package Day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindMiddleElementInLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		list.add(23);
		list.add(6);
		list.add(4);
		list.add(8);
		list.add(13);
		list.add(10);
		System.out.println("list --" + list);
		System.out.println("Middle element : " +findMiddleElement(list));
		
	}

	private static int findMiddleElement(LinkedList<Integer> list) {
		List<Integer> newList = new ArrayList<Integer>();
		Iterator<Integer> itr = list.iterator();
	
		while(itr.hasNext()) {
			newList.add(itr.next());
		}
		int size = newList.size();
		return newList.get((size-1)/2);
	}

}
