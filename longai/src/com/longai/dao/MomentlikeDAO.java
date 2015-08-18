package com.longai.dao;

import java.util.List;
import java.util.Map;

import com.longai.model.*;

public class MomentlikeDAO extends BaseDAO{
	public void save(Momentlike like){
		super.saveOrUpdate(like);
	}
	public void delete(Momentlike like){
		super.delete(like);
	}
	public Momentlike findById(int id){
		return (Momentlike)super.findById(id, Momentlike.class);
	}
	public List<Momentlike> findAll(){
		Map<String, Object>map=null;
		String queryStr="from Momentlike";
		return super.queryAll(queryStr, map);
	}
}
