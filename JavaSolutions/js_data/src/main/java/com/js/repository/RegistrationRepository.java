package com.js.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.js.model.*;
@Repository
public class RegistrationRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	public void registration(RegistrationDto register) {
		if (register != null) {
		String f=	register.getFirstname();
		System.out.println(f);
         System.out.println(register.getMobileno());
		System.out.println("repository");
			//System.out.println(register);
			hibernateTemplate.saveOrUpdate(register);
			System.out.println("i finished work of repository");
		}
		else{
			System.out.println("not completed succesfully and have a null value");
			
		}
			
		
		
	}
	public List<RegistrationDto> showUsersList(RegistrationDto register) {
		if (register != null) {
			List<RegistrationDto> login2 = null;
			login2 = hibernateTemplate.find("from RegistrationDto");
			return login2;
		   } else {
			return null;
		}

	}	
	
	
}
