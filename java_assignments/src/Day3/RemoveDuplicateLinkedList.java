/*
 * 2. Removing Duplicates from a Sorted Linked List
A sorted linked list has been constructed with repeated elements. 
Describe an algorithm to remove all duplicates from the linked list efficiently.
 */

package Day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RemoveDuplicateLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(8);
		list.add(22);
		list.add(22);
		list.add(45);
		System.out.println("List : " +list);
		removeDuplicates(list);
		System.out.println("List without duplicated values : "+list);
	}

	private static void removeDuplicates(List<Integer> list) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			int e = iterator.next();
			if(map.containsKey(e)) {
				iterator.remove();
			}
			else {
				map.put(e, 1);
			}
		}
		
	}
}

/*Algorithm --------------------------------------
 * 1.Initialize:
	Create an empty HashMap map.
	Get an iterator for the linked list iterator.
2.Iterate through the list:
	While iterator has more elements:
	Get the next element e from the iterator.
	If e is in map:
		Remove e from the linked list.
	Else:
		Add e to map.
3. End of loop:
	The linked list now contains only unique elements.

*/
