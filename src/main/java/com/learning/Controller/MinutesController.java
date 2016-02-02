package com.learning.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learning.Model.Activity;
import com.learning.Model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		System.out.println("Exercise:" + exercise.getMinutes());
		return "addMinutes";
	}
	
	@RequestMapping(value="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("swim");
		activities.add(swim);
		
		return activities;
	}

	/*
	 * @RequestMapping(value="/addMoreMinutes") public String
	 * addMoreMinutes(@ModelAttribute("exercise") Exercise exercise){
	 * System.out.println("Exercise within forward method:" +
	 * exercise.getMinutes()); return "addMinutes"; }
	 */

}
