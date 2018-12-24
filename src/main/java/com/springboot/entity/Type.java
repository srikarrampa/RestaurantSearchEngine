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
public class Type {
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="type_id")
	private int typeId;
	@Column(name="type_name")
	private String typeName;
	@Column(name="type_created_by")
	private String typeCreatedBy;
	@Column(name="type_created_date")
	private Date typeCreatedDate;

	public Type()
	{
		
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeCreatedBy() {
		return typeCreatedBy;
	}

	public void setTypeCreatedBy(String typeCreatedBy) {
		this.typeCreatedBy = typeCreatedBy;
	}

	public Date getTypeCreatedDate() {
		return typeCreatedDate;
	}

	public void setTypeCreatedDate(Date typeCreatedDate) {
		this.typeCreatedDate = typeCreatedDate;
	}

	public Type(int typeId, String typeName, String typeCreatedBy, Date typeCreatedDate) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.typeCreatedBy = typeCreatedBy;
		this.typeCreatedDate = typeCreatedDate;
	}
	
	
	
}
