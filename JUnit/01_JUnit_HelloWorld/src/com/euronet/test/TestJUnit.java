package com.euronet.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJUnit {

	@Test
	public void testAdd() {
		String str = "JUnit is simple";
		assertEquals("JUnit is easy", str);

	}

}
