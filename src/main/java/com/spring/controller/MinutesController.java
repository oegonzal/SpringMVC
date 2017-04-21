package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Exercise;


@Controller
public class MinutesController {
	
	//What url am i going to intercept this with?
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		System.out.println("exercise: " + exercise.getMinutes());
		
		//"forward:addMoreMinutes.html" skips the load of that page but executes it
		return "addMinutes"; //"redirect:addMoreMinutes.html" goes to page designated
	}
	
//	@RequestMapping(value = "/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise) {
//		System.out.println("exercising: " + exercise.getMinutes());
//		return "addMinutes";
//	}
	
}
