package com.longai.service;

import java.util.List;
import com.longai.dao.*;
import com.longai.model.*;

public class UserService {
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO=userDAO;
	}
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
