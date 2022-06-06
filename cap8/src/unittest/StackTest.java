package unittest;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.Test;

public class StackTest {

	@Test(expected = EmptyStackException.class)
	public void testEmptyStackException() {
	    Stack <Integer>stack = new Stack<Integer>();
	    stack.pop();
	}
	
}
