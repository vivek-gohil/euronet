package com.euronet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.euronet.model.UserDetails;

@Controller
public class UserDetailsController {

	@RequestMapping("/")
	public String display() {
		return "index";
	}

	@RequestMapping("userdetailsform")
	public String displayUserDetailsForm(Model model) {
		UserDetails userDetails = new UserDetails();
		model.addAttribute("userDetails", userDetails);
		return "userdetails";
	}

	@RequestMapping("submitform")
	public String submitUserDetailsForm(@ModelAttribute UserDetails userDetails) {
		System.out.println(userDetails);
		return "displayuserdetails";
	}
}
