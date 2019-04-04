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

	public void add(int x) {
		
		if (front == (MAX)) {
			System.out.println("Queue Overflow!");
		}
		else {
			//back = (back+1);
			arr[++back] = x;
			count++;
			System.out.println(x + " was pushed on to the queue");
		}
	}

	public int remove() {

		if (isEmpty()) {
			System.out.println("Queue underflow!");
			return -1;
		}
		else {
			//front = (front+1);
			//front++;
			--count; 
			return arr[front++];
		}
	}
	
	
}
