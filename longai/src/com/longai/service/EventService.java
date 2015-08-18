package com.longai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longai.dao.*;
import com.longai.model.*;
@Service
public class EventService {
	@Autowired
	private EventDAO eventDAO;

	public Event findById(int id){
		return eventDAO.findById(id);
	}
	public void save(Event event){
		eventDAO.save(event);
	}
	public void delete(Event event){
		eventDAO.delete(event);
	}
	public List<Event> findAll(){
		return eventDAO.findAll();
	}
}
