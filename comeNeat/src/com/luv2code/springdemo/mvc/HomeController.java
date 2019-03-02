package com.luv2code.springdemo.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String showIndex1() {
		return "index"; 
	}
	@RequestMapping("/index")
public String showIndex2() {
	return "index"; 
}
	@RequestMapping("/logged")
	public String showLogged() {
		return "logged"; 
	}
	@RequestMapping("/choice")
	public String choice() {
		return "choice"; 
	}
	@RequestMapping("/sellFood")
		public String selling() {
			return "sellFood";
		}
	@RequestMapping("/profile")
	public String Profile() {
		return "profile"; 
	}
	}

