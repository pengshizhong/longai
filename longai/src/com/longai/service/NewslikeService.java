package com.longai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longai.dao.*;
import com.longai.model.*;
@Service
public class NewslikeService {
	@Autowired
	private NewslikeDAO newslikeDAO;

	public Newslike findById(int id){
		return newslikeDAO.findById(id);
	}
	public void save(Newslike newslike){
		newslikeDAO.save(newslike);
	}
	public void delete(Newslike newslike){
		newslikeDAO.delete(newslike);
	}
	public List<Newslike> findAll(){
		return newslikeDAO.findAll();
	}
}
