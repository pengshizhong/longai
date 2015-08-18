package com.longai.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Moment entity. @author MyEclipse Persistence Tools
 */

public class Moment implements java.io.Serializable {

	// Fields

	private Integer momentId;
	private String momentContent;
	private Timestamp momentPubtime;
	private Set momentlikes = new HashSet(0);
	private Set momentcomments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Moment() {
	}

	/** full constructor */
	public Moment(String momentContent, Timestamp momentPubtime,
			Set momentlikes, Set momentcomments) {
		this.momentContent = momentContent;
		this.momentPubtime = momentPubtime;
		this.momentlikes = momentlikes;
		this.momentcomments = momentcomments;
	}

	// Property accessors

	public Integer getMomentId() {
		return this.momentId;
	}

	public void setMomentId(Integer momentId) {
		this.momentId = momentId;
	}

	public String getMomentContent() {
		return this.momentContent;
	}

	public void setMomentContent(String momentContent) {
		this.momentContent = momentContent;
	}

	public Timestamp getMomentPubtime() {
		return this.momentPubtime;
	}

	public void setMomentPubtime(Timestamp momentPubtime) {
		this.momentPubtime = momentPubtime;
	}

	public Set getMomentlikes() {
		return this.momentlikes;
	}

	public void setMomentlikes(Set momentlikes) {
		this.momentlikes = momentlikes;
	}

	public Set getMomentcomments() {
		return this.momentcomments;
	}

	public void setMomentcomments(Set momentcomments) {
		this.momentcomments = momentcomments;
	}

}