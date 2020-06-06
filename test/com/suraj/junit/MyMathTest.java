package com.suraj.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	public void sum_with3numbers() {
		// Absence of failure is success
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {1,2,3});
		assertEquals(6, result);
		System.out.println(result);
	}
	
	@Test
	public void sum_with1numbers() {
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] {1});
		assertEquals(1, result);
		System.out.println(result);
	}

}
