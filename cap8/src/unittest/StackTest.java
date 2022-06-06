package unittest;

public class StackTest {
	@Test
	public void testEmptyStackException() {
	  boolean sucesso = false;
	  try {
	    Stack s<Integer> = new Stack<Integer>();
	    s.push(10);
	    int r = stack.pop();
	    r = stack.pop();
	  } catch (EmptyStackException e) {
	    sucesso = true;
	  }
	  assertTrue(sucesso);
	}
}
