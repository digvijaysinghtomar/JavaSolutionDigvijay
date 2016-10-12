package com.js.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.js.model.AddMarqueDto;
import com.js.service.WelcomeService;



@Controller
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeService;
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String addMarqueMethod(@ModelAttribute("AddMarqueDto")  AddMarqueDto addMarque, ModelMap model,Map<String, Object> map) {
		System.err.println("i am here2------at controller post");
		List<AddMarqueDto> marqueList=null;
		
		
	    marqueList=	welcomeService.addMarque(addMarque);
	    
		System.out.println("controller work finished");
		model.addAttribute("MarqueList", marqueList);
		System.out.println(marqueList);
		return "welcome";
	   
	}
}
