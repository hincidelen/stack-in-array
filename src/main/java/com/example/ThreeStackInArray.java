package com.example;

import java.util.Stack;

public class ThreeStackInArray {

	public static Stack<Object>[] createArrayWithThreeStack() {

		Stack<Object>[] stackArray = new Stack[3];
		stackArray[0] = new Stack<Object>();
		stackArray[1] = new Stack<Object>();
		stackArray[2] = new Stack<Object>();
		return stackArray;
	}
}
