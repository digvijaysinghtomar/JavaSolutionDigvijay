package com.js.adminController;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.js.model.AddMarqueDto;
import com.js.service.MarqueService;


@Controller
public class MarqueController {

	@Autowired
	private MarqueService marqueService;
	
	@RequestMapping(value = "/viewMarque", method=RequestMethod.GET)
	public String register(Map<String, Object> map) {
		System.err.println("i am here1-------------controller get");
		map.put("AddMarqueDto", new AddMarqueDto());
		return "addMarque";
	}
	
	
	
	@RequestMapping(value = "/addMarque", method = RequestMethod.POST)
	public String addMarqueMethod(@ModelAttribute("AddMarqueDto")  AddMarqueDto addMarque, ModelMap model,Map<String, Object> map) {
		System.err.println("i am here2------at controller post");
		List<AddMarqueDto> marqueList=null;
		
		
	    marqueList=	marqueService.addMarque(addMarque);
	    
		System.out.println("controller work finished");
		model.addAttribute("MarqueList", marqueList);
		return "addMarque";
	   
	}
	/*
	@RequestMapping(value = "/verifyAdminLogin", method = RequestMethod.POST)
	public String verifyLogin(@ModelAttribute("AddMarqueDto") AddMarqueDto addMarque) {
	    List<AddMarqueDto> log;
		System.out.println("Inside controller");
	    System.out.println(addMarque.getId());
	    System.out.println(addMarque.getMarque());
	    log =marqueService.showMarqueList(addMarque);
	    if (log == null) {
			System.out.println("login fail");
	    	return "adminDashboard";
		} else {
			System.out.println("login sucess");
			return "addMarque";
		}

	}
*/
	
	
	
}
