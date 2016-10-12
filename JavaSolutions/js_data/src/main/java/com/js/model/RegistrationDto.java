package com.js.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table(name = "registrationdetails")
public class RegistrationDto {
	
	@Id
	@GeneratedValue
	@Column(name = "LOGIN_ID")
	private Integer rid;
	
	
	@Column(name = "FIRST_NAME")
	private String firstname;

	
	@Column(name = "Last_NAME")
	private String lastname;

	@Column(name = "EMAIL_ID")
	private String emailid;

	@Column(name = "MOBILE")
	private String mobileno;
	
	@Column(name = "PASSWORD")
    private String password;
	
	@Column(name = "TOTAL_FEES")
    private String totalfees;
	
	@OneToMany( targetEntity=FeesDto.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "frid", referencedColumnName="LOGIN_ID")
	 
	private Set children; 
	
	
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}
	/*@Column(name = "FILE_UPLOAD")
	private String fileName = null;
	
	private CommonsMultipartFile file = null;
*/
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getTotalfees() {
	return totalfees;
}
public void setTotalfees(String totalfees) {
	this.totalfees = totalfees;
}
/*public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}
public CommonsMultipartFile getFile() {
	return file;
}
public void setFile(CommonsMultipartFile file) {
	this.file = file;
	this.fileName = file.getOriginalFilename();

}*/


}
