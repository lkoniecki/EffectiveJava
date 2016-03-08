package workshop.exercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.google.common.collect.Sets;

public class Excercise2Test {
	@Test
	public void testNullSet() {
		try {
			Excercise2.union(null, Sets.newHashSet());
			fail("IllegalArgumentException should be returned");
		} catch (IllegalArgumentException e) {
			//should fail
		}

		try {
			Excercise2.union(Sets.newHashSet(), null);
			fail("IllegalArgumentException should be returned");
		} catch (IllegalArgumentException e) {
			//should fail
		}

		try {
			Excercise2.union(null, null);
			fail("IllegalArgumentException should be returned");
		} catch (IllegalArgumentException e) {
			//should fail
		}
	}

	@Test
	public void testBothEmptySet() {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		assertTrue(Excercise2.union(set1, set2).isEmpty());
	}

	@Test
	public void testOneEmptySet() {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = Sets.newHashSet(1, 2, 3);
		Set<Integer> expectedResult = Sets.union(set1, set2);
		Set<Integer> result = Excercise2.union(set1, set2);
		assertEquals("Wrong set size", expectedResult.size(), result.size());
		assertTrue(Sets.difference(expectedResult, result).isEmpty());

		set1 = Sets.newHashSet(1, 2, 3);
		set2 = new HashSet<>();
		expectedResult = Sets.union(set1, set2);
		result = Excercise2.union(set1, set2);
		assertEquals("Wrong set size", expectedResult.size(), result.size());
		assertTrue(Sets.difference(expectedResult, result).isEmpty());
	}

	@Test
	public void testDifferentSetsUnion() {
		Set<Integer> set1 = Sets.newHashSet(1, 2, 3, 8, 9);
		Set<Integer> set2 = Sets.newHashSet(3, 4, 5, 6);
		Set<Integer> expectedResult = Sets.union(set1, set2);
		Set<Integer> result = Excercise2.union(set1, set2);
		assertEquals("Wrong set size", expectedResult.size(), result.size());
		assertTrue(Sets.difference(expectedResult, result).isEmpty());
	}

	@Test
	public void testTwoSameSets() {
		Set<Integer> set1 = Sets.newHashSet(1, 2, 3);
		Set<Integer> set2 = Sets.newHashSet(1, 2, 3);
		Set<Integer> expectedResult = Sets.union(set1, set2);
		Set<Integer> result = Excercise2.union(set1, set2);
		assertEquals("Wrong set size", expectedResult.size(), result.size());
		assertTrue(Sets.difference(expectedResult, result).isEmpty());
	}

	/**
	@Test
	public void testTwoDifferentTypes() {
		Set<Integer> set1 = Sets.newHashSet(1, 2, 3);
		Set<Number> set2 = Sets.newHashSet(3, 4, 5);
		Set<Number> expectedResult = Sets.union(set1, set2);
		Set<Number> result = Excercise2.union(set1, set2);
		assertEquals("Wrong set size", expectedResult.size(), result.size());
		assertTrue(Sets.difference(expectedResult, result).isEmpty());
	}
	*/
}
