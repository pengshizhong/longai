package com.longai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longai.dao.*;
import com.longai.model.*;
@Service
public class NewscommentService {
	@Autowired
	private NewscommentDAO newscommentDAO;

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
