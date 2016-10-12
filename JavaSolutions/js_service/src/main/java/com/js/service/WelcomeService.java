package com.js.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.model.AddMarqueDto;
import com.js.repository.WelcomeRepository;

@Service
public class WelcomeService {

	@Autowired
	private WelcomeRepository welcomeRepository;
	

public List<AddMarqueDto> addMarque(AddMarqueDto addMarque){
	
    System.out.println("service of marque");
	List<AddMarqueDto> listOfMarque = null;
	listOfMarque =welcomeRepository.addMarque(addMarque);
	if (listOfMarque != null) {
	   return listOfMarque;
	}else{
		return null;
	}
	
}	
}
