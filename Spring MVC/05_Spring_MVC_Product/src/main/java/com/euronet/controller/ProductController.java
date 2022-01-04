package com.euronet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	// @RequestMapping("/")
	public String display() {
		return "index";
	}

	// @RequestMapping("newproduct")
	@RequestMapping("/")
	public String displayProductPage(Model model) {
		return "productdetails";
	}
}
