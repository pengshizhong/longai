package com.longai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longai.dao.*;
import com.longai.model.*;
@Service
public class UserService {
	@Autowired
    UserDAO userDAO;
	public User findById(int id){
		return userDAO.findById(id);
	}
	public void save(User user){
		userDAO.save(user);
	}
	public void delete(User user){
		userDAO.delete(user);
	}
	public List<User> findAll(){
		return userDAO.findAll();
	}

}
