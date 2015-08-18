package com.longai.dao;

import java.util.List;
import java.util.Map;

import com.longai.model.*;

public class MessageDAO extends BaseDAO{
	public void save(Message message){
		super.saveOrUpdate(message);
	}
	public void delete(Message message){
		super.delete(message);
	}
	public Message findById(int id){
		return (Message)super.findById(id, Message.class);
	}
	public List<Message> findAll(){
		Map<String, Object>map=null;
		String queryStr="from Message";
		return super.queryAll(queryStr, map);
	}
}
