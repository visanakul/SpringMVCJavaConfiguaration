package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.service.HelloService;

@Controller
public class HelloController {
	@Autowired
	private HelloService helloService;
	
	 public HelloController() {
		 System.out.println("***HelloController***");
		 
	}
	@RequestMapping("/home.htm")
	public String helloRequest(Model model){
		model.addAttribute("msg", helloService.helloMsg());
		return "hello";
	}
}
