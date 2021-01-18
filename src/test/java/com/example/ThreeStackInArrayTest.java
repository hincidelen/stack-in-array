package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Stack;

import org.junit.jupiter.api.Test;

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
