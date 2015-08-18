package com.longai.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Event entity. @author MyEclipse Persistence Tools
 */

public class Event implements java.io.Serializable {

	// Fields

	private Integer eventSid;
	private String eventId;
	private String title;
	private String sponsors;
	private Timestamp starttime;
	private Timestamp endtime;
	private String status;
	private String contenturl;
	private String permission;
	private String location;
	private Set enrolls = new HashSet(0);

	// Constructors

	/** default constructor */
	public Event() {
	}

	/** full constructor */
	public Event(String eventId, String title, String sponsors,
			Timestamp starttime, Timestamp endtime, String status,
			String contenturl, String permission, String location, Set enrolls) {
		this.eventId = eventId;
		this.title = title;
		this.sponsors = sponsors;
		this.starttime = starttime;
		this.endtime = endtime;
		this.status = status;
		this.contenturl = contenturl;
		this.permission = permission;
		this.location = location;
		this.enrolls = enrolls;
	}

	// Property accessors

	public Integer getEventSid() {
		return this.eventSid;
	}

	public void setEventSid(Integer eventSid) {
		this.eventSid = eventSid;
	}

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSponsors() {
		return this.sponsors;
	}

	public void setSponsors(String sponsors) {
		this.sponsors = sponsors;
	}

	public Timestamp getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContenturl() {
		return this.contenturl;
	}

	public void setContenturl(String contenturl) {
		this.contenturl = contenturl;
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set getEnrolls() {
		return this.enrolls;
	}

	public void setEnrolls(Set enrolls) {
		this.enrolls = enrolls;
	}

}