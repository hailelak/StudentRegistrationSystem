package com.app.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Student {	
	
	private long studentId;	
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	Address address;
	
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	public long getStudentId() {
		return studentId;
	}	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
