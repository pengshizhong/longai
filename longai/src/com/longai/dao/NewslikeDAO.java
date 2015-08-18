package com.longai.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.longai.model.*;
@Repository
public class NewslikeDAO extends BaseDAO{
	public void save(Newslike like){
		super.saveOrUpdate(like);
	}
	public void delete(Newslike like){
		super.delete(like);
	}
	public Newslike findById(int id){
		return (Newslike)super.findById(id, Newslike.class);
	}
	public List<Newslike> findAll(){
		Map<String, Object>map=null;
		String queryStr="from Newslike";
		return super.queryAll(queryStr, map);
	}
}
