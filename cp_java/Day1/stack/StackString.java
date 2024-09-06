package stack;

public class StackString {
    private String[] arr;
    private int top;

    public StackString(int size) {
        arr = new String[size];
        top = -1;
    }

    public void push(String n) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = n;
        }
    }

    public String pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            String poppedElement = arr[top];
            top--;
            return poppedElement;
        }
    }

    public void show() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public String peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return arr[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String args[]) {
    	StackString stack = new StackString(6);
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("\nInput some elements on the stack:");
        stack.push("Cat");
        stack.push("Dog");
        stack.push("Elephant");
        stack.push("Lion");
        stack.push("Tiger");
        stack.show();
        System.out.println("\nTop element of the stack: " + stack.peek());
        System.out.println("\nRemove two elements from the stack:");
        stack.pop();
        stack.pop();
        stack.show();
        System.out.println("\nTop element of the stack after popping: " + stack.peek());
        System.out.println("\nIs the stack empty? " + stack.isEmpty());
    }
}
