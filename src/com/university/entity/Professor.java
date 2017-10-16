package com.university.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class Professor  {
	@Id
	@Column(name="professorId")
	private int professorId;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="emailId")
	private String emailId;
	@Column(name="password")
	private String password;
	@Column(name="gender")
	private String gender;
	@Column(name="address")
	private String address;
	@Column(name="yearEnrolled")
	private String yearEnrolled;
	@Column(name="deptId")
	private int departmentId;
	
	@OneToOne(mappedBy="professor")
	private CoursesRegestered coursesRegestered;
	
	
	public CoursesRegestered getCoursesRegestered() {
		return coursesRegestered;
	}
	public void setCoursesRegestered(CoursesRegestered coursesRegestered) {
		this.coursesRegestered = coursesRegestered;
	}
	public int getProfessorId() {
		return professorId;
	}
	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getYearEnrolled() {
		return yearEnrolled;
	}
	public void setYearEnrolled(String yearEnrolled) {
		this.yearEnrolled = yearEnrolled;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	@Override
	public String toString() {
		return "ProfessorEntity [professorId=" + professorId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", password=" + password + ", gender=" + gender
				+ ", address=" + address + ", yearEnrolled=" + yearEnrolled
				+ ", departmentId=" + departmentId + "]";
	}
	
	
}
