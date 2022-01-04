package com.euronet.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.euronet.pojo.MessageUtil;

public class TestUnit1 {
	String message = "Euronet";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		System.out.println("inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}

}
