package com.euronet.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.euronet.pojo.MessageUtil;

public class TestUnit2 {
	String message = "Euronet";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testSalutationMessage() {
		System.out.println("inside testSalutationMessage()");
		message = " Hi " + "Euronet";
		assertEquals(message, messageUtil.salutationMessage());
	}
}
