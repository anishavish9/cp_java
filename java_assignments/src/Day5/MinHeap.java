/*
 * 3. Implementing Heap Operations
 	Code a min-heap with methods for insertion, deletion, and fetching the 
 	minimum element. Ensure that the heap property is maintained after each operation."
 */

package Day5;

public class MinHeap {
	private int[] Heap;
	private int size;
	private int maxSize;
	private static final int FRONT=1;

	public MinHeap(int maxsize) {
		this.maxSize = maxsize;
		this.size = 0;
		Heap = new int[this.maxSize + 1];
		Heap[0] = Integer.MIN_VALUE;
	}

	// Function to return the position of the parent for the node currently at pos
	private int parent(int pos) {
		return pos / 2;
	}

	// Function to return the position of the left child for the node currently at pos
	private int leftChild(int pos) {
		return (2 * pos);
	}

	// Function to return the position of the right child for the node currently at pos
	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

	// Function that returns true if the passed node is a leaf node
	private boolean isLeaf(int pos) {
		if (pos >= (size / 2) && pos <= size) {
			return true;
		}
		return false;
	}

	// Function to swap two nodes of the heap
	private void swap(int fpos, int spos) {
		int tmp;
		tmp = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = tmp;
	}

	// Function to heapify the node at pos
	private void minHeapify(int pos) {

		// If the node is a non-leaf node and greater
		// than any of its child
		if (!isLeaf(pos)) {
			if (Heap[pos] > Heap[leftChild(pos)]
					|| Heap[pos] > Heap[rightChild(pos)]) {

				// Swap with the left child and heapify
				// the left child
				if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
					swap(pos, leftChild(pos));
					minHeapify(leftChild(pos));
				}

				// Swap with the right child and heapify
				// the right child
				else {
					swap(pos, rightChild(pos));
					minHeapify(rightChild(pos));
				}
			}
		}
	}

	// Function to insert a node into the heap
	public void insert(int element) {
		if (size >= maxSize) {
			return;
		}
		//increase the size of an array
		Heap[++size] = element;
		int current = size;

		//comparison of current element with parent until and unless parent is smaller than root element
		while (Heap[current] < Heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	// Function to print the contents of the heap
	public void print()
	{
		for (int i = 1; i <= size / 2; i++) {
			System.out.print(" PARENT : " + Heap[i]
					+ " LEFT CHILD : " + Heap[2 * i]
					+ " RIGHT CHILD :" + Heap[2 * i + 1]
			);
			System.out.println();
		}
	}

	// Function to build the min heap using the minHeapify
	public void minHeap() {
		for (int pos = (size / 2); pos >= 1; pos--) {
			minHeapify(pos);
		}
	}

	//remove and return the minimum element from the heap
	public int remove() {
		int popped = Heap[FRONT];

		//last leaf node to root
		Heap[FRONT] = Heap[size-1];

		//calling to rearrange
		minHeapify(FRONT);

		return popped;
	}
	
	public static void main(String args[]) {
		System.out.println("The Min Heap is ");
		MinHeap minHeap = new MinHeap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
		minHeap.minHeap();
		minHeap.print();
		System.out.println("Removing Minimum Element : "+ minHeap.remove());
		minHeap.print();
	}

}
