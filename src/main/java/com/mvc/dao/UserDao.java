package com.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mvc.model.user;
import com.mvc.model.userforform2;

@Repository
public class UserDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	public void saveUser(userforform2 User) {
		System.out.println("UserDao.saveUser()");
		hibernateTemplate.save(User);
	
		
	}


}
