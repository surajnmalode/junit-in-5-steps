package com.suraj.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class AssertTest {

	@BeforeClass()
	public void beforeClass() {
		System.out.println("before Class");
	}

	@Before()
	public void before() {
		System.out.println("before");
	}

	@After()
	public void after() {
		System.out.println("after");
	}
	
	@AfterClass()
	public void afterClass() {
		System.out.println("after Class");
	}

	@Test
	void test() {
		boolean condn = true;
		assertEquals(true, condn);
		assertTrue(condn);
//		assertFalse(condn);
//		assertNotNull;
//		assertNull;
	}

}
