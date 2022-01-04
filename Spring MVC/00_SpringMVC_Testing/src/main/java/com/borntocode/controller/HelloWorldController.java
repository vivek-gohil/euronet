package com.borntocode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String display() {
		System.out.println("display()");
		return "/WEB-INF/jsp/index.jsp";
	}

	@RequestMapping("/print")
	public String print() {
		System.out.println("print()");
		return "/WEB-INF/jsp/homePage.jsp";
	}
}
