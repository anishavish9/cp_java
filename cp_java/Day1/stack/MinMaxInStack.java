package stack;

public class MinMaxInStack {
	private int[] arr;
    private int top ;

    public MinMaxInStack(int size)
    {
        arr = new int[size];
        top =-1;
    }

    public void push(int n) {
        if (top == arr.length - 1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            arr[top] = n;
        }
    }
    
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int poppedElement = arr[top];
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
    
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }

    }
    
    public boolean isEmpty()
    {
        return top == -1;
    }
    
    public static void main(String args[]) {
    	MinMaxInStack stack = new MinMaxInStack(6);
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("\nInput some elements on the stack:");
        stack.push(11);
        stack.push(25);
        stack.push(36);
        stack.push(84);
        stack.push(35);
        stack.show();
        System.out.println("***************************************************");
        //minimum value
        System.out.println("Minimum value from stack : " +stack.minimumValue());
        //maximum value
        System.out.println("Maximum value from stack : " +stack.maximumValue());
        System.out.println("***************************************************");

        System.out.println("\nTop element of the stack: " + stack.peek());
        System.out.println("\nRemove two element from the stack:");
        stack.pop();
        stack.pop();
        stack.show();
        System.out.println("\nTop element of the stack after popping: " + stack.peek());
        System.out.println("\nIs the stack empty? " + stack.isEmpty());
        
       
    }

	private int minimumValue() {
		int temp = arr[0];
		if(top != -1) {
			for (int i = top; i >= 0; i--) {
                if(arr[i] < temp) {
                	temp = arr[i];
                }
            }
		}
		return temp;
	}

	private int maximumValue() {
		int temp = arr[0];
		if(top != -1) {
			for (int i = top; i >= 0; i--) {
                if(arr[i] > temp) {
                	temp = arr[i];
                }
            }
		}
		return temp;
	}

}
