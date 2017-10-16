package com.university.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Courses {
	@Id
	@Column(name="courseId")
	private int courseId;
	@Column(name="courseName")
	private String courseName;
	@Column(name="term")
	private String term;
	@Column(name="deptId")
	private int departmentId;
	@Column(name="credits")
	private int noOfCredits;
	/*private List<Student> students;
	*/
	@OneToOne(mappedBy="courses")
	private CoursesRegestered coursesRegestered;
	
	public CoursesRegestered getCoursesRegestered() {
		return coursesRegestered;
	}
	public void setCoursesRegestered(CoursesRegestered coursesRegestered) {
		this.coursesRegestered = coursesRegestered;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public int getNoOfCredits() {
		return noOfCredits;
	}
	public void setNoOfCredits(int noOfCredits) {
		this.noOfCredits = noOfCredits;
	}
	
	/*@ManyToMany
	@JoinTable(name="JOIN_STUDENT_COURES",
	joinColumns={@JoinColumn(name="courseId")},
	inverseJoinColumns={@JoinColumn(name="studentId")})
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}*/
	
	
	
	
	
	

	

}
