package com.euronet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController {
	@RequestMapping("/")
	public String display() {
//		return "WEB-INF/jsp/index.jsp";
		return "index";
	}

	@RequestMapping("next")
	public String displayNext() {
//		return "WEB-INF/jsp/pageone.jsp";
		return "pageone";
	}

	@RequestMapping("/last")
	public String displayLast() {
//		return "WEB-INF/jsp/pagetwo.jsp";
		return "pagetwo";
	}
}
