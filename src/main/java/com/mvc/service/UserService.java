package com.mvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.UserDao;
import com.mvc.model.user;
import com.mvc.model.userforform2;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public void saveUser(userforform2 User) {
		 System.out.println("UserService.saveUser()");
		 userDao.saveUser(User);
		
		
		
	}

}
