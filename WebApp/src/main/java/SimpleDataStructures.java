/*
 * Interface for stacks and queues for array implementations
 * 
 */
public interface SimpleDataStructures {
	
	static final int MAX = 50;
	int beginningNode = 0;
	int arr[] = new int[MAX];
	
	boolean isEmpty();
	
	boolean push(int x);
	
	int pop();
}
