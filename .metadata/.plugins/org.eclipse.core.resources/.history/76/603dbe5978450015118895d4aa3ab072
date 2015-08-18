package com.longai.dao;

import java.util.List;
import java.util.Map;

import com.longai.model.*;

public class EnrollDAO extends BaseDAO{
	public void save(Enroll enroll){
		super.saveOrUpdate(enroll);
	}
	public void delete(Enroll enroll){
		super.delete(enroll);
	}
	public Enroll findById(int id){
		return (Enroll)super.findById(id, Enroll.class);
	}
	public List<Enroll> findAll(){
		Map<String, Object>map=null;
		String queryStr="from Enroll";
		return super.queryAll(queryStr, map);
	}
}
