package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestContorller {
	@RequestMapping("/home")
	//@ResponseBody
	public String handletest() {
		return  "home";
	}
	@RequestMapping("/login")
	@ResponseBody
	public String handletest_2() {
		return  "../views/home.jsp";
	}
	@RequestMapping("/contact")
	@ResponseBody
	public String handletest_3() {
		return  "Welcome to contact page";
	}
	
	
}
