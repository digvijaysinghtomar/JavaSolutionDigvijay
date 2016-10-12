package com.js.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.js.model.LoginDto;
@Repository
public class LoginRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	
	public List<Object> verifyLogin(LoginDto login){
		System.out.println("Inside Repository");
		System.out.println(login.getId());
		System.out.println(login.getPassword());
		String emailId = login.getId();
		String password = login.getPassword();
		List<Object> login2 = null;
		login2 = hibernateTemplate
				.find("from LoginDto al where al.id = ? and al.password = ?", emailId, password);
		System.out.println("out of repository");
		return login2;
		
	
	}

}


