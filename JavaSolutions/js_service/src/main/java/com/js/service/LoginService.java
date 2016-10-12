package com.js.service;
 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.model.LoginDto;
import com.js.repository.LoginRepository;
@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;
public boolean verifyLoginService(LoginDto login){
	
	System.out.println("inside service");
	System.out.println(login.getId());
	System.out.println(login.getPassword());
	
	
	boolean status = false;
	List<Object> memberList = null;
	memberList = loginRepository.verifyLogin(login);
	
	if (memberList.size() == 0) {
		status = false;
	} else {
		System.out.println("service work finished");
		status = true;
	}

	return status;
}}