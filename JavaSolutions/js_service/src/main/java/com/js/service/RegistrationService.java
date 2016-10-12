package com.js.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.model.RegistrationDto;
import com.js.repository.*;
@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository registrationRepository;
	
public void register(RegistrationDto registration){
		
        System.out.println("service");
		registrationRepository.registration(registration);
		System.out.println("service work finished");
		
	}
public List<RegistrationDto> showUsersList(RegistrationDto registration){
	
    System.out.println("service");
	List<RegistrationDto> listOfUsers = null;
	listOfUsers =registrationRepository.showUsersList(registration);
	if (listOfUsers != null) {
	   return listOfUsers;
	}else{
		return null;
	}
	
}	
}

