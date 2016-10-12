package com.js.controller;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import com.js.validator.*;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.js.model.*;
import com.js.service.*;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@Autowired
	private RegistrationValidator registrationValidator;
	
@RequestMapping(value = "/signup", method=RequestMethod.GET)
public String register(Map<String, Object> map) {
	System.err.println("i am here1-------------controller get");
	map.put("RegistrationDto", new RegistrationDto());
	return "registration";
}

/*
@RequestMapping(value = "/registration", method = RequestMethod.POST)
public String registration(@ModelAttribute("RegistrationDto") RegistrationDto register) {
	System.err.println("i am here2------at controller post");
	registrationService.register(register);
	System.out.println("controller work finished");
	return "registration";
   
}
*/


@RequestMapping(value = "/registration", method = RequestMethod.POST)
public String registration(@ModelAttribute("RegistrationDto") RegistrationDto register
		,BindingResult result, ModelMap model,Map<String, Object> map, HttpServletRequest request) {
	System.err.println("i am here2------at controller post");
	
	registrationValidator.validate(register, result);
	if (result.hasErrors()) {
		System.out.println("page contain error in validation");
		return "registration";
	
	}
	else{
		/*
		FileOutputStream outputStream = null;
		
        String filePath = System.getProperty("java.io.tmpdir") + File.separator +  register.getFile().getOriginalFilename();

        try {

            outputStream = new FileOutputStream(new File(filePath));

            outputStream.write( register.getFile().getFileItem().get());

            outputStream.close();

        } catch (Exception e) {

           System.out.println("Error while saving file");

           return "registration";

        }
*/
		registrationService.register(register);
			System.out.println("controller work finished");
		 return "welcome";
	}
	
   
}}
