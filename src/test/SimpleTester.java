package main;

public class SimpleTester {

	public static void main(String args[]) {
		
		//works
		SimpleDataStructures myStack = new SimpleStack();
		myStack.add(10);
		myStack.add(20);
		myStack.add(50);
		myStack.add(60);
		System.out.println(myStack.remove() + " is removed from the stack!");
		System.out.println(myStack.remove() + " is removed from the stack!");
		System.out.println(myStack.remove() + " is removed from the stack!");
		System.out.println(myStack.remove() + " is removed from the stack!");
		System.out.println(myStack.remove() + " is removed from the stack!");
		
		//works
		SimpleDataStructures myQueue = new SimpleQueue();
		myQueue.add(10);
		myQueue.add(20);
		myQueue.add(50);
		myQueue.add(60);
		System.out.println(myQueue.remove() + " is removed from the queue!");
		System.out.println(myQueue.remove() + " is removed from the queue!");
		System.out.println(myQueue.remove() + " is removed from the queue!");
		System.out.println(myQueue.remove() + " is removed from the queue!");
		System.out.println(myQueue.remove() + " is removed from the queue!");
		
	}
}
