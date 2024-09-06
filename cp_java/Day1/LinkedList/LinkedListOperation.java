package LinkedList;

public class LinkedListOperation {
	Node head;
	class Node {
	    int data;
	    Node next;

	    // Constructor to create a new node
	    Node(int d) {
	        data = d;
	        next = null;
	    }
	}

	// Method to insert a new node at the front of the list
	   public void insertAtBeginning(int new_data) {
	       Node new_node = new Node(new_data);
	       new_node.next = head;
	       head = new_node;
	   }




	// Method to insert a new node at the end of the list
	   public void insertAtEnd(int new_data) {
	       Node new_node = new Node(new_data);
	       if (head == null) {
	           head = new_node;
	       }
	       else {
	    	   Node last = head;
		       while (last.next != null) {
		           last = last.next;
		       }
		       last.next = new_node;
	       }
	   }




	// Method to insert a new node at a specific position
	   public void insertAtPosition(int new_data, int position) {
	       Node new_node = new Node(new_data);
	       if (head == null) {
	           System.out.println("Position out of bounds");
	          
	       }
	       else if (position == 0) {
	           insertAtBeginning(new_data);
	           return;
	       }
	       Node current = head;
	       for (int i = 0; current != null && i < position - 1; i++) {
	           current = current.next;
	       }
	       
	       new_node.next = current.next;
	       current.next = new_node;
	   }


	// Method to delete a node by key
	   public void deleteNode(int key) {
		   Node temp = head, prev = null;
		   if (head == null) {
	           System.out.println("Key not found");
	           return;
		   }
	       if (temp != null && temp.data == key) {
	           head = temp.next;
	           return;
	       }
	       while (temp != null && temp.data != key) {
	           prev = temp;
	           temp = temp.next;
	       }
	       
	       prev.next = temp.next;
	   }


	// Method to update a node's data by key
	   public void updateNode(int old_data, int new_data) {
	       Node current = head;
	       while (current != null && current.data != old_data) {
	           current = current.next;
	       }
	       if (current != null) {
	           current.data = new_data;
	       } else {
	           System.out.println("Node not found");
	       }
	   }


	// Method to display the linked list
	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }



	// Main method to run the program
	   public static void main(String[] args) {
		   LinkedListOperation list = new LinkedListOperation();

	       // Insert nodes
	       list.insertAtBeginning(1);
	       list.insertAtEnd(2);
	       list.insertAtEnd(4);
	       System.out.println("insert----------------");
	       list.insertAtPosition(3, 2); // Insert 3 at position 1
	       list.display(); // Display: 1 -> 3 -> 2 -> null

	       // Update node
	       list.updateNode(3, 5);
	       list.display(); // Display: 1 -> 5 -> 2 -> null

	       // Delete node
	       list.deleteNode(1);
	       list.display(); // Display: 5 -> 2 -> null
	   }

}
