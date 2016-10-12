package com.js.adminController;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.js.model.FeesDto;
import com.js.model.LoginDto;
import com.js.model.RegistrationDto;
import com.js.service.FeesStatusService;
import com.js.service.RegistrationService;

@Controller
public class FeesStatusController {

	@Autowired
	private FeesStatusService feesService;
	
	/*@RequestMapping(value = "/viewFeeStatus", method=RequestMethod.GET)
	public String showLogin1(Model model) {
		System.out.println("I am Here at login Model controller-------");
		model.addAttribute("FeesDto", new FeesDto());
		return "feesStatus";
		
	}
	*/
	
	

	@RequestMapping(value = "/viewFeeStatus", method = { RequestMethod.GET, RequestMethod.POST })
	public String registration(@ModelAttribute("FeesDto") FeesDto feesdto,
			BindingResult result, ModelMap model,Map<String, Object> map,HttpServletRequest request) {
		   // boolean regist;
		 
		    String method = request.getMethod();
			if (("GET").equals(method)) {
				//map.put("UserRegistration", new UserRegistration());
				model.addAttribute("FeesDto", new FeesDto());
				List<FeesDto> listOfUsers=null; 
				
				listOfUsers = feesService.showUsersList(feesdto);
				
				
				for(FeesDto li:listOfUsers)
				{
					
					System.out.println("i am here at  view fees status controller");
					System.out.println(li.getFeesEmi());
					
				}
				model.addAttribute("users", listOfUsers);
			    return "feesStatus";
				
			}
			else{
		           		
					    return "registrationDetail";
					
			}

			}
		
}
	

