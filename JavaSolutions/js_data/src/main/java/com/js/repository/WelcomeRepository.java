package com.js.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.js.model.AddMarqueDto;

@Repository
public class WelcomeRepository {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public List<AddMarqueDto> addMarque(AddMarqueDto addmarque) {
		
		if (addmarque != null) {
			String f=	addmarque.getMarque();
			System.out.println(f);
	        System.out.println("repository");
	        hibernateTemplate.saveOrUpdate(addmarque);
			List<AddMarqueDto> addmarquelist = null;
		addmarquelist = hibernateTemplate.find("from AddMarqueDto");
		return addmarquelist;
	   } else {
		return null;
	}

}	


}