package com.borntocode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NextController {

	@RequestMapping("/next")
	public String nextPage() {
		return "/WEB-INF/jsp/finalPage.jsp";
	}
}
