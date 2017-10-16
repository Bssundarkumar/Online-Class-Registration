package com.university.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="studentId")
	private int studentId;
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
	@Column(name="dob")
	private Date dateOfBirth;
	@Column(name="address")
	private String address;
	@Column(name="deptId")
	private int departmentId;
	@Column(name="yearEnrolled")
	private String yearEnrolled;
	@Column(name="overallGPA")
	private float overALlGPA;
	
	
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getYearEnrolled() {
		return yearEnrolled;
	}
	public void setYearEnrolled(String yearEnrolled) {
		this.yearEnrolled = yearEnrolled;
	}
	public float getOverALlGPA() {
		return overALlGPA;
	}
	public void setOverALlGPA(float overALlGPA) {
		this.overALlGPA = overALlGPA;
	}
	
	
	/*@ManyToMany
	@JoinTable(name="JOIN_STUDENT_COURES",
	joinColumns={@JoinColumn(name="studentId")},
	inverseJoinColumns={@JoinColumn(name="courseId")})
	public List<CoursesRegestered> getCoursesRegestered() {
		return coursesRegestered;
	}
	public void setCoursesRegestered(List<CoursesRegestered> coursesRegestered) {
		this.coursesRegestered = coursesRegestered;
	}*/
	
	
	
	
	
}
