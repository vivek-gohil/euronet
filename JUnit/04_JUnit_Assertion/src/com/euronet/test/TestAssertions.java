package com.euronet.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAssertions {

	@Test
	public void testAssertions() {

		String str1 = new String("abc");
		String str2 = new String("abc");

		// Check that two objects are equal values
		System.out.println("assertEquals");
		assertEquals(str1, str2);

		System.out.println("assertTrue");
		int val1 = 5;
		int val2 = 6;
		assertTrue(val1 < val2);

		System.out.println("assertFalse");
		assertFalse(val1 > val2);

		// Check that an object isn't null
		System.out.println("assertNotNull");
		String str3 = null;
		assertNotNull(str1);
		// assertNotNull(str3);

		// Check that an object is null
		System.out.println("assertNull");
		assertNull(str3);

		// Check whether two arrays are equal to each other.
		System.out.println("assertArraysEquals");
		String[] expectedArray = { "one", "two", "three" };
		String[] resultArray = { "one", "two", "three" };
		assertArrayEquals(expectedArray, resultArray);

	}
}
