package com.js.adminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.js.model.FeesDto;
import com.js.service.EnterFeesStatusService;
import com.js.service.FeesStatusService;

@Controller
public class EnterFeesStatusController {

	@Autowired
	private EnterFeesStatusService feesService;
	@RequestMapping(value = "/EnterFeesEmi", method=RequestMethod.GET)
	public String showLogin1(Model model) {
		System.out.println("I am Here at login Model controller-------");
		model.addAttribute("FeesDto", new FeesDto());
		return "EnterFeesEmi";
		
	}
}
