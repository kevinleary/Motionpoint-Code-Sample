package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import main.SimpleOverflowException;
import main.SimpleUnderflowException;
import test.SimpleTesterTest.QueueTest;
import test.SimpleTesterTest.StackTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	StackTest.class,
	QueueTest.class
})

public class SimpleTester {

	public static void main(String args[]) throws SimpleUnderflowException, SimpleOverflowException {
		
		//works - with exceptions 
		//implement print() ?
		
//		SimpleDataStructures myStack = new SimpleStack();
//		
//		try {
//			myStack.add(10);
//			myStack.add(20);
//			myStack.add(50);
//			myStack.add(60);
//			
//			System.out.println(myStack.remove() + " is removed from the stack!");
//			System.out.println(myStack.remove() + " is removed from the stack!");
//			System.out.println(myStack.remove() + " is removed from the stack!");
//			System.out.println(myStack.remove() + " is removed from the stack!");
//			//System.out.println(myStack.remove() + " is removed from the stack!");
//			
//			//test overflow
//			for (int i=1; i <= (SimpleDataStructures.MAX + 5); i++) {
//				myStack.add(i);
//			}
//			 
//		} 
//		
//		catch (SimpleOverflowException | SimpleUnderflowException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//System.out.println(myStack.remove() + " is removed from the stack!");
		
//		System.out.println();
//		//works
//		SimpleDataStructures myQueue = new SimpleQueue();
//		myQueue.add(10);
//		myQueue.add(20);
//		myQueue.add(50);
//		myQueue.add(60);
//		System.out.println(myQueue.remove() + " is removed from the queue!");
//		System.out.println(myQueue.remove() + " is removed from the queue!");
//		System.out.println(myQueue.remove() + " is removed from the queue!");
//		System.out.println(myQueue.remove() + " is removed from the queue!");
//		System.out.println(myQueue.remove() + " is removed from the queue!");
//		
//		for (int i=1; i <= (SimpleDataStructures.MAX + 5); i++) {
//			myQueue.add(i);
//		}
		
//		ComplexDataStructures ll = new LinkedList();
//		ll.insert(1);
//		ll.insert(2);
//		ll.insert(3);
//		ll.insert(4);
//		ll.printLinkedList();
//		
//		ll.remove(0);
//		ll.printLinkedList();
		
		
	}
}
