package sorting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestSorting {
	
	Sort<Integer> integer = new Sort<Integer>();
	Sort<String> string = new Sort<String>();
	final Integer[] ogInt  = {9, 8, 7, 6, 5, 4, 3, 2, 1};
	final String[] ogString = {"zaa", "xan", "zz", "apple", "abc"};
	
	Integer[] intArray;
	String[] stringArray;
	
	@Before
	public void setUp() {
		intArray = ogInt.clone();
		stringArray = ogString.clone();
	}
	
	@Test
	public void testBubbleSort() {
		assertTrue(Arrays.equals(ogInt, intArray));
		assertTrue(Arrays.equals(ogString, stringArray));
		
		intArray = integer.bubbleSort(intArray);
		assertFalse(Arrays.equals(ogInt, intArray));
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(intArray));
		stringArray = string.bubbleSort(stringArray);
		assertFalse(Arrays.equals(ogString, stringArray));
		assertEquals("[abc, apple, xan, zaa, zz]", Arrays.toString(stringArray));
	}
	
	@Test
	public void testMergeSort() {
		assertTrue(Arrays.equals(ogInt, intArray));
		assertTrue(Arrays.equals(ogString, stringArray));
		
		intArray = integer.mergeSort(intArray);
		assertFalse(Arrays.equals(ogInt, intArray));
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(intArray));
		stringArray = string.mergeSort(stringArray);
		assertFalse(Arrays.equals(ogString, stringArray));
		assertEquals("[abc, apple, xan, zaa, zz]", Arrays.toString(stringArray));
	}
}
