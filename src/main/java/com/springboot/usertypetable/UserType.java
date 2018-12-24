package com.springboot.usertypetable;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.springboot.type.Type;
import com.springboot.usertable.User;


@SuppressWarnings("serial")
@Entity
@Table(name = "usertypetable")
public class UserType implements Serializable{
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idusertypetable;
	
	@Column(name = "idusertypetable")
	public int getIdUserTypeTable() {
		return idusertypetable;
	}


	public void setIdUserTypeTable(int idusertypetable) {
		this.idusertypetable = idusertypetable;
	}
	
	@ManyToOne
	@JoinColumn(name = "userid")
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@ManyToOne
	@JoinColumn(name = "typeid")
	private Type type;
	

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	public UserType()
	{
		
	}
	public UserType(int idusertypetable, int userId, int typeId) {
		super();
		this.idusertypetable = idusertypetable;
		this.user = new User(userId,"","",null);
		this.type = new Type(typeId,"","",null);
	}

	
	
	
}
