package com.longai.model;

import java.util.HashSet;
import java.util.Set;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	private Integer newsId;
	private String content;
	private String auther;
	private String title;
	private Set newslikes = new HashSet(0);
	private Set newscomments = new HashSet(0);

	// Constructors

	/** default constructor */
	public News() {
	}

	/** full constructor */
	public News(String content, String auther, String title, Set newslikes,
			Set newscomments) {
		this.content = content;
		this.auther = auther;
		this.title = title;
		this.newslikes = newslikes;
		this.newscomments = newscomments;
	}

	// Property accessors

	public Integer getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuther() {
		return this.auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set getNewslikes() {
		return this.newslikes;
	}

	public void setNewslikes(Set newslikes) {
		this.newslikes = newslikes;
	}

	public Set getNewscomments() {
		return this.newscomments;
	}

	public void setNewscomments(Set newscomments) {
		this.newscomments = newscomments;
	}

}