package com.longai.service;

import java.util.List;

import com.longai.dao.*;
import com.longai.model.*;

public class EventService {
	private EventDAO eventDAO;
	public void setEventDAO(EventDAO eventDAO) {
		this.eventDAO=eventDAO;
	}
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
