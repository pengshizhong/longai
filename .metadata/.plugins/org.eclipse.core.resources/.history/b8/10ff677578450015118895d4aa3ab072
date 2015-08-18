package com.longai.dao;

import java.util.List;
import java.util.Map;

import com.longai.model.*;

public class NewscommentDAO extends BaseDAO{
	public void save(Newscomment comment){
		super.saveOrUpdate(comment);
	}
	public void delete(Newscomment comment){
		super.delete(comment);
	}
	public Newscomment findById(int id){
		return (Newscomment)super.findById(id, Newscomment.class);
	}
	public List<Newscomment> findAll(){
		Map<String, Object>map=null;
		String queryStr="from Newscomment";
		return super.queryAll(queryStr, map);
	}
}
