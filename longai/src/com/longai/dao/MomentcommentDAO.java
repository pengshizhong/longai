package com.longai.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.longai.model.*;
@Repository
public class MomentcommentDAO extends BaseDAO {
	public void save(Momentcomment comment){
		super.saveOrUpdate(comment);
	}
	public void delete(Momentcomment comment){
		super.delete(comment);
	}
	public Momentcomment findById(int id){
		return (Momentcomment)super.findById(id, Momentcomment.class);
	}
	public List<Momentcomment> findAll(){
		Map<String, Object>map=null;
		String queryStr="from Momentcomment";
		return super.queryAll(queryStr, map);
	}
}
