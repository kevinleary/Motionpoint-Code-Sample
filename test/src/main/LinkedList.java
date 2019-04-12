package main;

public class LinkedList implements ComplexDataStructures{
	
	ComplexDataStructures.Node head = new Node(0);		//Default value of 0.. user gives the node a value @start


	@Override
	public void insert(Node n, int x) {
		// TODO Auto-generated method stub
		
		if (n == null) {
			System.out.println("You passed a 'null' node!");
			return;
		}
		
		ComplexDataStructures.Node newNode = new Node(x);
		newNode.next = n.next;
		n.next = newNode;
		
	}

	
	public void printLinkedList() {
		// TODO Auto-generated method stub
		ComplexDataStructures.Node tempNode = new Node(0);
		tempNode = head;
		
		while(tempNode != null) {
		
			System.out.print(tempNode.value + " ");
			tempNode = tempNode.next;
		}
		
	}


	public void insert(int x) {
		// TODO Auto-generated method stub
		//Node n;
		ComplexDataStructures.Node newNode = new Node(x);
		
		newNode.next = head;
		head = newNode;
		
		
	
	}


	public void remove(int key) {
		// TODO Auto-generated method stub
		//we'll cheat and have it doubly linked here
		
		ComplexDataStructures.Node tempNode = new Node(0);
		
		tempNode = head;
		tempNode.prev = head;
		
		if(tempNode != null && tempNode.value == key)
		{
			head = tempNode.next;
			return;
		}
		
		while (tempNode != null && tempNode.value != key) {
			
			if(tempNode.prev == head && tempNode.next == head)
				tempNode.next = head.next;
			else {
				tempNode = tempNode.next;
				//tempNode.next = tempNode.next.next;
				//tempNode.prev = tempNode.prev.next;
			}
			
		}
		
		if(tempNode == null) 		//wasnt found
			return;
		
		tempNode.prev = tempNode.next;
		tempNode.next = null;
		
	}

}
