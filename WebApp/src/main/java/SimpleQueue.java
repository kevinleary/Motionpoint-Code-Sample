
public class SimpleQueue implements SimpleDataStructures{
	
	SimpleDataStructures queue = new SimpleQueue();
	private int front = -1;
	int arr[] = new int[queue.MAX];
	
	public boolean isEmpty() {
	
		if (front < 0)
			return true;
		else
			return false;
	}

	public void push(int x) {
		
		if (front >= (queue.MAX-1)) {
			System.out.println("Queue Overflow!");
		}
		else {
			arr[++front] = x;
			System.out.println(x + " was pushed on to the queue");
		}
	}

	public int pop() {

		if (isEmpty()) {
			System.out.println("Queue underflow!");
			return -1;
		}
		else {
			int x = arr[front--];
			return x;
		}
	}
	
	
}
