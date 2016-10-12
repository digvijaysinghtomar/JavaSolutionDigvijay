package com.js.adminController;
import com.js.service.*;
import com.js.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminLoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/adminLogin", method=RequestMethod.GET)
	public String showLogin1(Model model) {
		System.out.println("I am Here at login Model controller");
		model.addAttribute("LoginDto", new LoginDto());
		return "adminLogin";
		
	}
	
	@RequestMapping(value = "/verifyAdminLogin", method = RequestMethod.POST)
	public String verifyLogin(@ModelAttribute("LoginDto") LoginDto login) {
	    boolean log;
		System.out.println("Inside controller");
	    System.out.println(login.getId());
	    System.out.println(login.getPassword());
	    log = loginService.verifyLoginService(login);
	    if (log == false) {
			System.out.println("login fail");
	    	return "adminLogin";
		} else {
			System.out.println("login sucess");
			return "adminDashboard";
		}

	}
	
	

}