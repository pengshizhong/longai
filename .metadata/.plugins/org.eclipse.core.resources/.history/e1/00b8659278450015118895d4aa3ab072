package com.longai.dao;

import java.util.List;
import java.util.Map;

import com.longai.model.*;

public class NewsDAO extends BaseDAO{
	public void save(News news){
		super.saveOrUpdate(news);
	}
	public void delete(News news){
		super.delete(news);
	}
	public News findById(int id){
		return (News)super.findById(id, News.class);
	}
	public List<News> findAll(){
		Map<String, Object>map=null;
		String queryStr="from News";
		return super.queryAll(queryStr, map);
	}
}
