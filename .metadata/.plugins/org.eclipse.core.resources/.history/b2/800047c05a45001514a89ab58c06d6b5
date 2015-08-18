package com.longai.service;

import java.util.List;

import com.longai.dao.*;
import com.longai.model.*;

public class NewscomService {
	private NewscommentDAO newscommentDAO;
	public void setNewscomDAO(NewscommentDAO newscommentDAO) {
		this.newscommentDAO=newscommentDAO;
	}
	public Newscomment findById(int id){
		return newscommentDAO.findById(id);
	}
	public void save(Newscomment newscomment){
		newscommentDAO.save(newscomment);
	}
	public void delete(Newscomment newscomment){
		newscommentDAO.delete(newscomment);
	}
	public List<Newscomment> findAll(){
		return newscommentDAO.findAll();
	}
}
