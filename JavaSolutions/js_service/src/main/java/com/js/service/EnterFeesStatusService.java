package com.js.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.model.FeesDto;
import com.js.repository.EnterFeesStatusRepository;



@Service
public class EnterFeesStatusService {
	@Autowired
	private EnterFeesStatusRepository feesStatusRepository;
	
public void register(FeesDto feesdto){
		
        System.out.println("service");
		feesStatusRepository.registration(feesdto);
		System.out.println("service work finished");
		
	}
}
