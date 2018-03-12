package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.ReviewDao;

@Controller 
public class MainController {
	
	@Autowired
	ReviewDao reviewDao;

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String displayHome() {
		return "home";
	}
	
	@RequestMapping(path="/form", method=RequestMethod.GET)
	public String displayForm() {
		return "form";
	}

	@RequestMapping(path="/form", method=RequestMethod.POST)
	public String processForm(@RequestParam String username,
			@RequestParam String title,
			@RequestParam String text,
			@RequestParam int rating) {
		
		return "redirect:/";
		
	}
}
		
	