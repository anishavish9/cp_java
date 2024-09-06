package LinkedList;

public class LinkedList {
    Node head; 
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // insert
    public static LinkedList insert(LinkedList list, int data) {
        Node newnode = new Node(data); 
        newnode.next = null;
        if (list.head == null) {
            list.head = newnode;
        } 
        else {
            Node nextnode = list.head;
            while (nextnode.next != null) {
            	nextnode = nextnode.next;
            }
            nextnode.next = newnode;
            newnode.next = null;
        }
        return list;
    }

    // print
    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        printList(list);
    }
}

