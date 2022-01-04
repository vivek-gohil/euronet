package com.euronet.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloWorldController {

	public HelloWorldController() {
		System.out.println("HelloWorldController Object Created!");
	}

	@RequestMapping(value = "greet", method = RequestMethod.GET)
	public String displayGet() {
		return "Reqest Type is Get";
	}

	@RequestMapping(value = "greet", method = RequestMethod.POST)
	public String displayPost() {
		return "Request type is post";
	}

	@RequestMapping(value = "greet", method = RequestMethod.PUT)
	public String displayPut() {
		return "Request type is Put";
	}

	@RequestMapping(value = "greet", method = RequestMethod.DELETE)
	public String displayDelete() {
		return "Request type is Delete";
	}

}
