package unittest;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class ArrayTest {

	List<Integer> s;
	
	@Before
	public void setUp() {
		s = new ArrayList<Integer>();
	}
	
	@Test
	public void whenArrayIsEmptyThenAssertTrue() {
		assertTrue(s.isEmpty());
	}
	
	@Test
	public void whenArrayIsNotEmptyThenAssertFalse() {
		s.add(1);
		assertFalse(s.isEmpty());
	}
	
	@Test
	public void whenArrayHaveThreeElThenSizeAssertEq() {
	    s.add(1);
	    s.add(2);
	    s.add(3);
	    assertEquals(3, s.size());
	}
	
	@Test
	public void whenArrayElIsRemovedThenSizeDecreaseAndElAssertEq() {
	    s.add(1);
	    s.add(2);
	    s.add(3);
	    int el = s.remove(2); // number 3
	    assertEquals(3 , el);
	    assertEquals(2, s.size());
	}
	
	@Test
	public void whenArrayAllElisRemovedThenSizeAssertEqToZeroAndIsEmptyAssertTrue() {
	    s.add(1);
	    s.remove(0);
	    assertEquals(0, s.size());
	    assertTrue(s.isEmpty());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void whenArrayWrongIndexThenAssertIndexOutOfBoundsException() {
		s.add(1); // index 0
		s.add(2); // index 1
		s.remove(2);
	}

}