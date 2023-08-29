package com.velocity.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="librarycard")
public class Librarycard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="startdate")
	private String startdate;
	@Column(name="enddate")
	private String enddate;
	@Column(name="bookdetail")
	private String bookdetail;
	@Column(name="validity")
	private Integer validity;
	
	
	public Long getId() { 
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getBookdetail() {
		return bookdetail;
	}
	public void setBookdetail(String bookdetail) {
		this.bookdetail = bookdetail;
	}
	public Integer getValidity() {
		return validity;
	}
	public void setValidity(Integer validity) {
		this.validity = validity;
	}
	
	
}
