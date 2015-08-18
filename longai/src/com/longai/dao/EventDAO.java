package com.longai.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.longai.model.*;
@Repository
public class EventDAO extends BaseDAO{
	public void save(Event event){
		super.saveOrUpdate(event);
	}
	public void delete(Event event){
		super.delete(event);
	}
	public Event findById(int id){
		return (Event)super.findById(id, Event.class);
	}
	public List<Event> findAll(){
		Map<String, Object>map=null;
		String queryStr="from Event";
		return super.queryAll(queryStr, map);
	}
}
