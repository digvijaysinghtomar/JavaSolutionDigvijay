package com.js.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.js.model.FeesDto;
import com.js.model.RegistrationDto;

@Repository
public class FeesStatusRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void registration(FeesDto register) {
		if (register != null) {
		 System.out.println(register.getFdate());
        
		System.out.println("repository");
			//System.out.println(register);
			hibernateTemplate.saveOrUpdate(register);
			System.out.println("i finished work of repository");
		}
		else{
			System.out.println("not completed succesfully and have a null value");
			
		}}
			
		
	
	
	
	public List<FeesDto> showUsersList(FeesDto register) {
		if (register != null) {
			List<FeesDto> login2 = null;
			login2 = hibernateTemplate.find("from FeesDto");
			return login2;
		   } else {
			return null;
		}

	}	
	
	



}
