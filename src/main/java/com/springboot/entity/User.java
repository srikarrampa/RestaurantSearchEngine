package com.springboot.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user")
	private int idUser;
	@Column(name="username")
	private String username;
	@Column(name="user_created_by")
	private String userCreatedBy;
	@Column(name="user_created_date")
	private Date userCreatedDate;
	

	public User()
	{
		
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserCreatedBy() {
		return userCreatedBy;
	}

	public void setUserCreatedBy(String userCreatedBy) {
		this.userCreatedBy = userCreatedBy;
	}

	public Date getUserCreatedDate() {
		return userCreatedDate;
	}

	public void setUserCreatedDate(Date userCreatedDate) {
		this.userCreatedDate = userCreatedDate;
	}

	public User(int idUser, String username, String userCreatedBy, Date userCreatedDate) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.userCreatedBy = userCreatedBy;
		this.userCreatedDate = userCreatedDate;
	}
	
	
}
