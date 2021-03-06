package com.longai.model;

import java.util.HashSet;
import java.util.Set;


/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private Integer userSid;
     private String name;
     private String nickname;
     private String email;
     private String location;
     private String biography;
     private String profilepic;
     private String gender;
     private String type;
     private Double preferencegens;
     private Double selfgens;
     private String userId;
     private Set momentlikes = new HashSet(0);
     private Set momentcomments = new HashSet(0);
     private Set newslikes = new HashSet(0);
     private Set pictures = new HashSet(0);
     private Set newscomments = new HashSet(0);
     private Set enrolls = new HashSet(0);


    // Constructors

    /** default constructor */
    public User() {
    }

    
    /** full constructor */
    public User(String name, String nickname, String email, String location, String biography, String profilepic, String gender, String type, Double preferencegens, Double selfgens, String userId, Set momentlikes, Set momentcomments, Set newslikes, Set pictures, Set newscomments, Set enrolls) {
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.location = location;
        this.biography = biography;
        this.profilepic = profilepic;
        this.gender = gender;
        this.type = type;
        this.preferencegens = preferencegens;
        this.selfgens = selfgens;
        this.userId = userId;
        this.momentlikes = momentlikes;
        this.momentcomments = momentcomments;
        this.newslikes = newslikes;
        this.pictures = pictures;
        this.newscomments = newscomments;
        this.enrolls = enrolls;
    }

   
    // Property accessors

    public Integer getUserSid() {
        return this.userSid;
    }
    
    public void setUserSid(Integer userSid) {
        this.userSid = userSid;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    public String getBiography() {
        return this.biography;
    }
    
    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getProfilepic() {
        return this.profilepic;
    }
    
    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Double getPreferencegens() {
        return this.preferencegens;
    }
    
    public void setPreferencegens(Double preferencegens) {
        this.preferencegens = preferencegens;
    }

    public Double getSelfgens() {
        return this.selfgens;
    }
    
    public void setSelfgens(Double selfgens) {
        this.selfgens = selfgens;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
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

    public Set getNewslikes() {
        return this.newslikes;
    }
    
    public void setNewslikes(Set newslikes) {
        this.newslikes = newslikes;
    }

    public Set getPictures() {
        return this.pictures;
    }
    
    public void setPictures(Set pictures) {
        this.pictures = pictures;
    }

    public Set getNewscomments() {
        return this.newscomments;
    }
    
    public void setNewscomments(Set newscomments) {
        this.newscomments = newscomments;
    }

    public Set getEnrolls() {
        return this.enrolls;
    }
    
    public void setEnrolls(Set enrolls) {
        this.enrolls = enrolls;
    }
   








}