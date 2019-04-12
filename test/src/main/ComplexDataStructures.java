package main;

public interface ComplexDataStructures {
	
	//Node head;					//inital node 
	
	static class Node {
		int value;
		Node next;
		Node prev;
		//Node() {next = null; prev = null;}		default constructor for 
		//Node prev; will be implemented outside of the interface
		Node(int v) { 
			value = v; 
			next = null;
			prev = null;
		}			//constructor for node
	}
	
//	public void append(int x);				//adds to end of LL

	public void insert(Node n, int x);		// can insert anywhere after the given node
	
	public void insert(int x);				//Overload - inserts at the end 
	
	public void remove(int key);			// removes the node with the given key
	
//	public boolean isEmpty();
	
	public void printLinkedList();
	
}
