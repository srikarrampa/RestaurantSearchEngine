package com.springboot.type;

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
public class Type {
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int type_id;
	private String type_name;
	private String type_created_by;
	private Date type_created_date;
//	private UserType usertype;
	
	public Type()
	{
		
	}
	
	public Type(int type_id, String type_name, String type_created_by, Date type_created_date) {
		super();
		this.type_id = type_id;
		this.type_name = type_name;
		this.type_created_by = type_created_by;
		this.type_created_date = type_created_date;
	}
	
	
	
	
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public String getType_created_by() {
		return type_created_by;
	}
	public void setType_created_by(String type_created_by) {
		this.type_created_by = type_created_by;
	}
	public Date getType_created_date() {
		return type_created_date;
	}
	public void setType_created_date(Date type_created_date) {
		this.type_created_date = type_created_date;
	}
	
//	@OneToMany(mappedBy = "type")
//    public UserType getUserType() {
//        return usertype;
//    }
//
//    public void setUserType(UserType usertype) {
//        this.usertype = usertype;
//    }
	
	
}
