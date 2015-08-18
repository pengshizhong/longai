package com.longai.model;

import java.sql.Timestamp;

/**
 * Newscomment entity. @author MyEclipse Persistence Tools
 */

public class Newscomment implements java.io.Serializable {

	// Fields

	private Integer newscommentId;
	private News news;
	private User user;
	private String commentContet;
	private Timestamp pubtime;

	// Constructors

	/** default constructor */
	public Newscomment() {
	}

	/** full constructor */
	public Newscomment(News news, User user, String commentContet,
			Timestamp pubtime) {
		this.news = news;
		this.user = user;
		this.commentContet = commentContet;
		this.pubtime = pubtime;
	}

	// Property accessors

	public Integer getNewscommentId() {
		return this.newscommentId;
	}

	public void setNewscommentId(Integer newscommentId) {
		this.newscommentId = newscommentId;
	}

	public News getNews() {
		return this.news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCommentContet() {
		return this.commentContet;
	}

	public void setCommentContet(String commentContet) {
		this.commentContet = commentContet;
	}

	public Timestamp getPubtime() {
		return this.pubtime;
	}

	public void setPubtime(Timestamp pubtime) {
		this.pubtime = pubtime;
	}

}