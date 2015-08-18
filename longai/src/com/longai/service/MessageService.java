package com.longai.service;

import java.util.List;

import com.longai.dao.*;
import com.longai.model.*;

public class MessageService {
	private MessageDAO messageDAO;
	public void setMessageDAO(MessageDAO messageDAO) {
		this.messageDAO=messageDAO;
	}
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
