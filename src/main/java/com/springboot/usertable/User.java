package com.springboot.usertable;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.springboot.usertypetable.UserType;


@Entity
public class User {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_user;
	private String username;
	private String user_created_by;
	private Date user_created_date;
	
//	private UserType usertype;
	public User()
	{
		
	}
	
	public User(int id_user, String username, String user_created_by, Date user_created_date) {
		super();
		this.id_user = id_user;
		this.username = username;
		this.user_created_by = user_created_by;
		this.user_created_date = user_created_date;
	}
	
	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUser_created_by() {
		return user_created_by;
	}
	public void setUser_created_by(String user_created_by) {
		this.user_created_by = user_created_by;
	}
	public Date getUser_created_date() {
		return user_created_date;
	}
	public void setUser_created_date(Date user_created_date) {
		this.user_created_date = user_created_date;
	} 
	
//	@OneToMany(mappedBy = "user")
//    public UserType getUserType() {
//        return usertype;
//    }
//
//    public void setUserType(UserType usertype) {
//        this.usertype = usertype;
//    }
//	
}
