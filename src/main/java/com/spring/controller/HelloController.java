package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	//How we tie this to the URL w/request mapping
	@RequestMapping(value="/greeting")
	public String sayHello(Model model){
		
		model.addAttribute("greeting", "Hello World!");
		
		return "hello";
	}
}
