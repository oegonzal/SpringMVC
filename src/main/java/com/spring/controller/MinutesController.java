package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.model.Activity;
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
	
	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		run.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		run.setDesc("Swim");
		activities.add(swim);
		
		return activities;
	}
	
//	@RequestMapping(value = "/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise) {
//		System.out.println("exercising: " + exercise.getMinutes());
//		return "addMinutes";
//	}
	
}
