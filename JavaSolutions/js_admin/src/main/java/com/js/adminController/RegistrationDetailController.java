package com.js.adminController;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.js.model.RegistrationDto;
import com.js.service.RegistrationService;


@Controller
public class RegistrationDetailController {

	
	@Autowired
	private RegistrationService registrationService;

	@RequestMapping(value = "/viewList", method = { RequestMethod.GET, RequestMethod.POST })
	public String registration(@ModelAttribute("RegistrationDto") RegistrationDto registeration,
			BindingResult result, ModelMap model,Map<String, Object> map,HttpServletRequest request) {
		    boolean regist;
		 
		    String method = request.getMethod();
			if (("GET").equals(method)) {
				
				model.addAttribute("RegistrationDto", new RegistrationDto());
				List<RegistrationDto> listOfUsers=null; 
				listOfUsers = registrationService.showUsersList(registeration);
				for(RegistrationDto li:listOfUsers)
				{
				 System.out.println(li.getEmailid());
				 //System.out.println("hello i am here at registrationdetail controller");
				}
				model.addAttribute("users", listOfUsers);
			    return "registrationDetail";
				
			}
			else{
		           		
					    return "adminLogin";
					
			}

			}
		
}
	

