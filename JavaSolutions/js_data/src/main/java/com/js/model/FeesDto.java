package com.js.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "feesdetails")
public class FeesDto {
	
	@Id
	@GeneratedValue
	@Column(name = "F_ID")
	private Integer id;
	
	
	
	@Column(name = "F_EMI")
	private Integer feesEmi;
	
	@Column(name = "F_REMAIN_AMOUNT")
	private String feesRemainingAmount;
	
	
	@Column(name = "F_DATE")
	private Date fdate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="frid",referencedColumnName="LOGIN_ID") 
	private RegistrationDto registerdto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Integer getFeesEmi() {
		return feesEmi;
	}

	public void setFeesEmi(Integer feesEmi) {
		this.feesEmi = feesEmi;
	}

	public String getFeesRemainingAmount() {
		return feesRemainingAmount;
	}

	public void setFeesRemainingAmount(String feesRemainingAmount) {
		this.feesRemainingAmount = feesRemainingAmount;
	}

	public Date getFdate() {
		return fdate;
	}

	public void setFdate(Date fdate) {
		this.fdate = fdate;
	}

	public RegistrationDto getRegisterdto() {
		return registerdto;
	}

	public void setRegisterdto(RegistrationDto registerdto) {
		this.registerdto = registerdto;
	}
	



}
