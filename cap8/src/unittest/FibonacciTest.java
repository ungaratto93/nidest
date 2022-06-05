package unittest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

	@Test
	public void getFibonacciSequence(){
		
		int value = Fibonacci.sequence(6);
		assertEquals(8, value);
	}
 }
