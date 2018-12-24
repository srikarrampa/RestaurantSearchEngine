package com.springboot.range;

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
public class Ranges {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_range;
	private String range_desc;
	private String range_created_by;
	private Date range_created_date;
	private String range_level;
	
	public String getRange_desc() {
		return range_desc;
	}

	public void setRange_desc(String range_desc) {
		this.range_desc = range_desc;
	}

	public String getRange_created_by() {
		return range_created_by;
	}

	public void setRange_created_by(String range_created_by) {
		this.range_created_by = range_created_by;
	}

	public Date getRange_created_date() {
		return range_created_date;
	}

	public void setRange_created_date(Date range_created_date) {
		this.range_created_date = range_created_date;
	}

	public String getRange_level() {
		return range_level;
	}

	public void setRange_level(String range_level) {
		this.range_level = range_level;
	}

	public Ranges()
	{
		
	}

	public Ranges(int id_range, String range_desc, String range_created_by, Date range_created_date,
			String range_level) {
		super();
		this.id_range = id_range;
		this.range_desc = range_desc;
		this.range_created_by = range_created_by;
		this.range_created_date = range_created_date;
		this.range_level = range_level;
	}
	
	
}
