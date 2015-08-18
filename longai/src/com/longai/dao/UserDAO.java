package com.longai.dao;

import com.longai.model.User;

public class UserDAO extends BaseDAO{
	public void save(User user){
		super.saveOrUpdate(user);
	}
	
}
