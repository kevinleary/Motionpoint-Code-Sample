package test;

public interface ComplexDataStructures {
	
	//Node head;					//inital node 
	
	static class Node {
		int value;
		Node next;
		//Node prev; will be implemented outside of the interface
		Node(int v) { value = v; next = null;}			//constructor for node
	}
	
	public void append(int x);				//adds to end of LL

	public void insert(Node n, int x);		// can insert anywhere after the given node
	
	public int remove();
	
	public boolean isEmpty();
	
	
	
}
