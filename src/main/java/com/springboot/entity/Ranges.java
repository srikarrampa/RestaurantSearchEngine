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
public class Ranges {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_range")
	private int idRange;
	@Column(name="range_desc")
	private String rangeDesc;
	@Column(name="range_created_by")
	private String rangeCreatedBy;
	@Column(name="range_created_date")
	private Date rangeCreatedDate;
	@Column(name="range_level")
	private String rangeLevel;
	
	
	public int getIdRange() {
		return idRange;
	}

	public void setIdRange(int idRange) {
		this.idRange = idRange;
	}

	public String getRangeDesc() {
		return rangeDesc;
	}

	public void setRangeDesc(String rangeDesc) {
		this.rangeDesc = rangeDesc;
	}

	public String getRangeCreatedBy() {
		return rangeCreatedBy;
	}

	public void setRangeCreatedBy(String rangeCreatedBy) {
		this.rangeCreatedBy = rangeCreatedBy;
	}

	public Date getRangeCreatedDate() {
		return rangeCreatedDate;
	}

	public void setRangeCreatedDate(Date rangeCreatedDate) {
		this.rangeCreatedDate = rangeCreatedDate;
	}

	public String getRangeLevel() {
		return rangeLevel;
	}

	public void setRangeLevel(String rangeLevel) {
		this.rangeLevel = rangeLevel;
	}

	public Ranges()
	{
		
	}

	public Ranges(int idRange, String rangeDesc, String rangeCreatedBy, Date rangeCreatedDate, String rangeLevel) {
		super();
		this.idRange = idRange;
		this.rangeDesc = rangeDesc;
		this.rangeCreatedBy = rangeCreatedBy;
		this.rangeCreatedDate = rangeCreatedDate;
		this.rangeLevel = rangeLevel;
	}

	
	
	
}
