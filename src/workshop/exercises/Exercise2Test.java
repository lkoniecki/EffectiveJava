package workshop.exercises;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Exercise2Test {
	@Test
	public void testNullSet() {
		try {
			Exercise2.union(null, new HashSet<>());
			fail("IllegalArgumentException should be returned");
		} catch (IllegalArgumentException e) {
			//should fail
		}

		try {
			Exercise2.union(new HashSet<>(), null);
			fail("IllegalArgumentException should be returned");
		} catch (IllegalArgumentException e) {
			//should fail
		}

		try {
			Exercise2.union(null, null);
			fail("IllegalArgumentException should be returned");
		} catch (IllegalArgumentException e) {
			//should fail
		}
	}

	@Test
	public void testBothEmptySet() {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		assertTrue(Exercise2.union(set1, set2).isEmpty());
	}

	@Test
	public void testOneEmptySet() {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3));

		Set<Integer> expectedResult = new HashSet<>(set1);
		expectedResult.addAll(set2);
		Set<Integer> result = Exercise2.union(set1, set2);
		assertTrue(expectedResult.equals(result));
		set1 = new HashSet<>(Arrays.asList(1, 2, 3));

		set2 = new HashSet<>();
		expectedResult = new HashSet<>(set1);
		result = Exercise2.union(set1, set2);
		assertTrue(expectedResult.equals(result));
	}

	@Test
	public void testDifferentSetsUnion() {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,9));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6));

		Set<Integer> expectedResult = new HashSet<Integer>(set1);
		expectedResult.addAll(set2);
		Set<Integer> result = Exercise2.union(set1, set2);
		assertTrue(expectedResult.equals(result));
	}

	@Test
	public void testTwoSameSets() {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3));

		Set<Integer> expectedResult = new HashSet<>(set1);
		expectedResult.addAll(set2);
		Set<Integer> result = Exercise2.union(set1, set2);
		assertTrue(expectedResult.equals(result));
	}

	/*
	@Test
	public void testTwoDifferentTypes() {
		Set<Integer> set1 = Sets.newHashSet(1, 2, 3);
		Set<Number> set2 = Sets.newHashSet(3, 4, 5);
		Set<Number> expectedResult = Sets.union(set1, set2);
		Set<Number> result = Exercise2.union(set1, set2);
		assertEquals("Wrong set size", expectedResult.size(), result.size());
		assertTrue(Sets.difference(expectedResult, result).isEmpty());
	}
	*/
}
