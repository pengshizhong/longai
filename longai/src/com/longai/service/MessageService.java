package com.longai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longai.dao.*;
import com.longai.model.*;
@Service
public class MessageService {
	@Autowired
	private MessageDAO messageDAO;

	public Message findById(int id){
		return messageDAO.findById(id);
	}
	public void save(Message message){
		messageDAO.save(message);
	}
	public void delete(Message message){
		messageDAO.delete(message);
	}
	public List<Message> findAll(){
		return messageDAO.findAll();
	}
}
