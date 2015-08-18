package com.longai.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.longai.model.*;
@Repository
public class PictureDAO extends BaseDAO{
	public void save(Picture picture){
		super.saveOrUpdate(picture);
	}
	public void delete(Picture picture){
		super.delete(picture);
	}
	public Picture findById(int id){
		return (Picture)super.findById(id, Picture.class);
	}
	public List<Picture> findAll(){
		Map<String, Object>map=null;
		String queryStr="from Picture";
		return super.queryAll(queryStr, map);
	}
}
