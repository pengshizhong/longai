package com.longai.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.longai.model.*;
@Repository
public class MomentDAO extends BaseDAO{
	public void save(Moment moment){
		super.saveOrUpdate(moment);
	}
	public void delete(Moment moment){
		super.delete(moment);
	}
	public Moment findById(int id){
		return (Moment)super.findById(id, Moment.class);
	}
	public List<Moment> findAll(){
		Map<String, Object>map=null;
		String queryStr="from Moment";
		return super.queryAll(queryStr, map);
	}
}
