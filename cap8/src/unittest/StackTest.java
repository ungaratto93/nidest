package unittest;

import static org.junit.Assert.assertTrue;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.Test;

public class StackTest {

	@Test
	public void testEmptyStackException() {
	  boolean sucesso = false;
	  try {
	    Stack <Integer>s = new Stack<Integer>();
	    s.push(10);
	    s.pop();
	    s.pop();
	  } catch (EmptyStackException e) {
	    sucesso = true;
	  }
	  assertTrue(sucesso);
	}
	
}
