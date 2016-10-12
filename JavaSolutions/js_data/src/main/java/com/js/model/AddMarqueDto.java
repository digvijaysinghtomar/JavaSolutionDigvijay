package com.js.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marquelist")
public class AddMarqueDto {
	@Id
	@GeneratedValue
	@Column(name = "Marque_Id")
	private Integer id;
	
	@Column(name = "Marque")
	private String marque;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	

}
