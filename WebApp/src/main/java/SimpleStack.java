
public class SimpleStack implements SimpleDataStructures{
	
	SimpleDataStructures stack = new SimpleStack();
	private int top = -1;
	int arr[] = new int[MAX];
	
	public boolean isEmpty() {
		
		if (top  < 0) 
			return true;
		else 
			return false;
			
	}

	public void push(int x) {
		
		if (top >= (MAX-1)) {
			System.out.println("Stack Overflow");
		}
		else {
			arr[++top] = x;
			System.out.println(x + " was pushed on to the stack");
		}
	}

	public int pop() {
		
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			
			int x = arr[--top];
			return x;
		}
	}

}
