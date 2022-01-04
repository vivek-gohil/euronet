package com.euronet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String display() {
		return "/WEB-INF/jsp/index.jsp";
	}
}
