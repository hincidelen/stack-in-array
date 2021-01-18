package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class ThreeStackInArrayTest {

	@Test
	public void testThreeStackInArray() {
		Stack[] arrayWithThreeStack = ThreeStackInArray.createArrayWithThreeStack();
		assertNotNull(arrayWithThreeStack);
		assertEquals(3, arrayWithThreeStack.length);
		assertTrue(arrayWithThreeStack[0] instanceof Stack);
		assertTrue(arrayWithThreeStack[1] instanceof Stack);
		assertTrue(arrayWithThreeStack[2] instanceof Stack);
	}

}
