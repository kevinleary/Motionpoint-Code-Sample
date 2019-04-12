package main;


public class SimpleStack implements SimpleDataStructures{
	
	//SimpleDataStructures stack = new SimpleStack();
	private int top = -1;
	int arr[] = new int[MAX];
	
	public boolean isEmpty() {
		
		if (top  < 0) 
			return true;
		else 
			return false;
			
	}

	public void add(int x) throws SimpleOverflowException{
		
		if (top >= (MAX-1)) { 
			System.out.println("Stack Overflow");
			throw new SimpleOverflowException("Stack Overflow");
		}
		else {
			arr[++top] = x;
			System.out.println(x + " was pushed on to the stack");
		}
	}

	public int remove() throws SimpleUnderflowException{
		
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			throw new SimpleUnderflowException("Stack Underflow");
			
		}
		else {
			
			int x = arr[top--];
			return x;
		}
	}

}
