package com.university.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentCourse")
public class StudentCourse {
	@Id
	@Column(name="courseId")
	private int courseId;
	@Column(name="courseName")
	private String courseName;
	@Column(name="proffName")
	private String professorName;
	@Column(name="classId")
	private int classId;
	@Column(name="classTiming")
	private String classTiming;
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
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassTiming() {
		return classTiming;
	}
	public void setClassTiming(String classTiming) {
		this.classTiming = classTiming;
	}
	
	
}
