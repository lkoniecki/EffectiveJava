package workshop.exercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

public class Excercise1Test {
	private Excercise1 ex;

	@Before
	public void setUp() {
		ex = new Excercise1();
	}

	@Test(expected=IllegalArgumentException.class)
	public void nullListTest() {
		ex.groupBy(null);
	}

	public void emptyListTest() {
		Map<String, Long> result = ex.groupBy(new ArrayList<>());
		assertNotNull("Result should not be null", result);
		assertTrue("Result should be empty", result.isEmpty());
	}

	@Test
	public void testSimpleList() {
		Map<String, Long> result = ex.groupBy(Lists.newArrayList("A", "B", "C", "D"));
		validateNoElements(result, 1, "A");
		validateNoElements(result, 1, "B");
		validateNoElements(result, 1, "C");
		validateNoElements(result, 1, "D");
	}

	@Test
	public void testMultipleElements() {
		Map<String, Long> result = ex.groupBy(Lists.newArrayList("Z", "A", "B", "A", "A", "Z", "D", "C", "D"));
		validateNoElements(result, 3, "A");
		validateNoElements(result, 1, "B");
		validateNoElements(result, 1, "C");
		validateNoElements(result, 2, "D");
		validateNoElements(result, 2, "Z");
	}

	private void validateNoElements(Map<String, Long> result, long expected, String element) {
		long noElements = result.get(element);
		assertEquals("Wrong number of " + element + " elements", expected, noElements);
	}
}