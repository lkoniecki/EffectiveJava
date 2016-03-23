package workshop.generics;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class DummyStackTest {
	//object to be tested. Object is recreated before each test run.
	private DummyStack stack;

	@Before
	public void setUp() {
		stack = new DummyStack();
	}

	@Test
	public void testAddAll() {
		//add integers
		Collection<Integer> intList = Arrays.asList(1, 2, 3);
		stack.pushAll(intList);
		//and numbers
		Collection<Number> numList = Arrays.asList(4, 5, 6);
		stack.pushAll(numList);

		//now check if result is correct
		Number[] result = new Number[6];
		stack.popAll().toArray(result);
		//check if a proper number of elements is returned
		assertEquals(6, result.length);
		//check if a elements in a proper order are being returned
		assertEquals(1, result[0]);
		assertEquals(2, result[1]);
		assertEquals(3, result[2]);
		assertEquals(4, result[3]);
		assertEquals(5, result[4]);
		assertEquals(6, result[5]);
		//check if queue is empty
		assertEquals(0, stack.popAll().size());
	}

	@Test
	public void testPopAll() {
		//add collection of integers
		Collection<Integer> intList = Arrays.asList(1, 2, 3);
		stack.pushAll(intList);

		//but collect result to a collection of numbers
		Collection<Number> numList = new ArrayList<>();
		stack.popAll(numList);

		//now check if result is correct
		Number[] result = new Number[3];
		numList.toArray(result);
		//check if a proper number of elements is returned
		assertEquals(3, result.length);
		//check if a elements in a proper order are being returned
		assertEquals(1, result[0]);
		assertEquals(2, result[1]);
		assertEquals(3, result[2]);
		//check if queue is empty
		assertEquals(0, stack.popAll().size());
	}
}
