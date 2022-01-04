package com.euronet.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.euronet.pojo.MessageUtil;

public class TestJUnit {
	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		message = "Hello JUnit";
		assertEquals(message, messageUtil.printMessage());
	}

}
