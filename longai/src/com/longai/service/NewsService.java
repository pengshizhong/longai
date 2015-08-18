package com.longai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longai.dao.*;
import com.longai.model.*;
@Service
public class NewsService {
	@Autowired
	private NewsDAO newsDAO;

	public News findById(int id){
		return newsDAO.findById(id);
	}
	public void save(News news){
		newsDAO.save(news);
	}
	public void delete(News news){
		newsDAO.delete(news);
	}
	public List<News> findAll(){
		return newsDAO.findAll();
	}
}
