package main;

/*
 * Interface for stacks and queues for array implementations
 * 
 * All fields are inheritily static and final in an interface
 */
public interface SimpleDataStructures {
	
	static final int MAX = 50;
	//int beginningNode = -1;			//where the top or bottom is not
	//int arr[] = new int[MAX];		// .. in 0 -> 50 
	
	boolean isEmpty();
	
	void add(int x);
	
	int remove();
}
