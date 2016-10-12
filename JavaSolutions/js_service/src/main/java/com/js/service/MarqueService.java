package com.js.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.model.AddMarqueDto;
import com.js.model.RegistrationDto;
import com.js.repository.MarqueRepository;
import com.js.repository.RegistrationRepository;

@Service
public class MarqueService {

	@Autowired
	private MarqueRepository marqueRepository;
	

public List<AddMarqueDto> addMarque(AddMarqueDto addMarque){
	
    System.out.println("service of marque");
	List<AddMarqueDto> listOfMarque = null;
	listOfMarque =marqueRepository.addMarque(addMarque);
	if (listOfMarque != null) {
	   return listOfMarque;
	}else{
		return null;
	}
	
}	
}