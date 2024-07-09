package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="answer123")
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	
	private int id;
	private String answername;
	private String postedBy;
	public Answer() {
		// TODO Auto-generated constructor stub
	}
	public Answer(int id, String answername, String postedBy) {
		super();
		this.id = id;
		this.answername = answername;
		this.postedBy = postedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswername() {
		return answername;
	}
	public void setAnswername(String answername) {
		this.answername = answername;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	

}