package com.longai.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.longai.model.*;
@Repository
public class UserDAO extends BaseDAO{
	public void save(User user){
		super.saveOrUpdate(user);
	}
	public void delete(User user){
		super.delete(user);
	}
	public User findById(int id){
		return (User)super.findById(id, User.class);
	}
	public List<User> findAll(){
		Map<String, Object>map=null;
		String queryStr="from User";
		return super.queryAll(queryStr, map);
	}
}
