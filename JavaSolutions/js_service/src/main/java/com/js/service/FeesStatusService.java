package com.js.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.model.FeesDto;
import com.js.model.RegistrationDto;
import com.js.repository.FeesStatusRepository;
import com.js.repository.RegistrationRepository;

@Service
public class FeesStatusService {
	@Autowired
	private FeesStatusRepository feesStatusRepository;
	
public void register(FeesDto feesdto){
		
        System.out.println("service");
		feesStatusRepository.registration(feesdto);
		System.out.println("service work finished");
		
	}
public List<FeesDto> showUsersList(FeesDto registration){
	
    System.out.println("service");
	List<FeesDto> listOfUsers = null;
	listOfUsers =feesStatusRepository.showUsersList(registration);
	if (listOfUsers != null) {
	   return listOfUsers;
	}else{
		return null;
	}
	
}	
}
