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
	
//  public static void main(String[] args) {
//
//    // teste 1
//    List<Integer> s = new ArrayList<Integer>();
//    System.out.println(s.isEmpty());
//
//    // teste 2
//    s = new ArrayList<Integer>();
//    s.add(1);
//    System.out.println(s.isEmpty());
//
//    // teste 3
//    s = new ArrayList<Integer>();
//    s.add(1);
//    s.add(2);
//    s.add(3);
//    System.out.println(s.size());
//    System.out.println(s.get(0));
//    System.out.println(s.get(1));
//    System.out.println(s.get(2));
//
//    // teste 4
//    s = new ArrayList<Integer>();
//    s.add(1);
//    s.add(2);
//    s.add(3);
//    int elem = s.remove(2);
//    System.out.println(elem);
//    System.out.println(s.get(0));
//    System.out.println(s.get(1));
//
//    // teste 5
//    s = new ArrayList<Integer>();
//    s.add(1);
//    s.remove(0);
//    System.out.println(s.size());
//    System.out.println(s.isEmpty());
//
//    // teste 6
//    try {
//      s = new ArrayList<Integer>();
//      s.add(1);
//      s.add(2);
//      s.remove(2);
//    }
//
//    catch (IndexOutOfBoundsException e) {
//      System.out.println("IndexOutOfBound");
//    }
//
//  }

}