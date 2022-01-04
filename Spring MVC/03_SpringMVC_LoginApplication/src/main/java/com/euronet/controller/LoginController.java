package com.euronet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	private String userName;
	private String password;

	@RequestMapping("/")
	public String display() {
		return "login";
	}

//	@RequestMapping("userlogin")
//	public String login(HttpServletRequest request, HttpServletResponse response) {
//		userName = request.getParameter("username");
//		password = request.getParameter("userpassword");
//
//		System.out.println("UserName :: " + userName);
//
//		if (password.equals("admin"))
//			return "home";
//		else
//			return "failure";
//	}

//	@RequestMapping("userlogin")
//	public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
//		userName = request.getParameter("username");
//		password = request.getParameter("userpassword");
//
//		System.out.println("UserName :: " + userName);
//
//		if (password.equals("admin")) {
//			model.addAttribute("message", userName);
//			return "home";
//		}
//		else {
//			model.addAttribute("message", "Invalid User Details");
//			return "failure";
//		}
//	}

//	@RequestMapping("userlogin")
//	public String login(@RequestParam("username") String userName, @RequestParam("userpassword") String password,
//			Model model) {
//
//		System.out.println("UserName :: " + userName);
//
//		if (password.equals("admin")) {
//			model.addAttribute("message", userName);
//			return "home";
//		} else {
//			model.addAttribute("message", "Invalid User Details");
//			return "failure";
//		}
//	}

	@RequestMapping("userlogin")
	public String login(@RequestParam String username, @RequestParam String userpassword, Model model) {

		System.out.println("UserName :: " + username);

		if (userpassword.equals("admin")) {
			model.addAttribute("message", username);
			return "home";
		} else {
			model.addAttribute("message", "Invalid User Details");
			return "failure";
		}
	}

}
