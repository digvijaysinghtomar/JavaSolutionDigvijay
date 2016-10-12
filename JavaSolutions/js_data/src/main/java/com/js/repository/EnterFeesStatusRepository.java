package com.js.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.js.model.FeesDto;
@Repository
public class EnterFeesStatusRepository {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void registration(FeesDto register) {
		if (register != null) {
		 System.out.println(register.getFdate()+"--------------------");
        
		System.out.println("repository");
			//System.out.println(register);
			hibernateTemplate.saveOrUpdate(register);
			System.out.println("i finished work of Enter fees repository");
		}
		else{
			System.out.println("not completed succesfully and have a null value");
			
		}}
			
		

}
