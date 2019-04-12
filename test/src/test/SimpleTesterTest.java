package test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.SimpleDataStructures;
import main.SimpleOverflowException;
import main.SimpleStack;
import main.SimpleUnderflowException;

class SimpleTesterTest {
	
	SimpleDataStructures myStack = new SimpleStack();
	
	@DisplayName("JUnit Stack Tester")
	class StackTest {
		@Test
		void push() throws SimpleOverflowException {
			try {
				myStack.add(1);
			}catch (SimpleOverflowException e) {
				e.printStackTrace();
			}
		}
		
		@Test
		void pop() throws SimpleUnderflowException {
			try {
				myStack.remove();
			}catch (SimpleUnderflowException e) {
				e.printStackTrace();
			}
		}
	
		@Test
		void isNotEmpty() {
			assertFalse(myStack.isEmpty());
		}
	}
	
	@DisplayName("JUnit Queue Tester")
	class QueueTest {
		@Test
		void push() throws SimpleOverflowException {
			try {
				myStack.add(1);
			}catch (SimpleOverflowException e) {
				e.printStackTrace();
			}
		}
		
		@Test
		void pop() throws SimpleUnderflowException {
			try {
				myStack.remove();
			}catch (SimpleUnderflowException e) {
				e.printStackTrace();
			}
		}
	
		@Test
		void isNotEmpty() {
			assertFalse(myStack.isEmpty());
		}
	}
}
