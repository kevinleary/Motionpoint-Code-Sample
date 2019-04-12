package main;


public class SimpleQueue implements SimpleDataStructures{
	
	//SimpleDataStructures queue = new SimpleQueue();
	private int back = -1;		//trails behind
	private int front = 0;
	private int count = 0;
	int arr[] = new int[MAX];
	
	public boolean isEmpty() {
	
		if (count <= 0)
			return true;
		else
			return false;
	}

	public void add(int x) throws SimpleOverflowException {
		
		if (count >= (MAX)) {
			System.out.println("Queue Overflow!");
			throw new SimpleOverflowException("Queue Overflow");
		}
		else {
			//back = (back+1);
			arr[++back] = x;
			count++;
			System.out.println(x + " was pushed on to the queue");
		}
	}

	public int remove() throws SimpleUnderflowException {

		if (isEmpty()) {
			System.out.println("Queue underflow!");
			throw new SimpleUnderflowException("Stack Underflow");
		}
		else {
			//front = (front+1);
			//front++;
			int x = arr[front];
			
			//brute force traversal to remove the top of the queue
			for(int i=0; i <= count; i++) {
				arr[i] = arr[i+1];
			}
			--count;
			back--;
			return x;
		}
	}
	
	
}
