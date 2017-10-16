package com.university.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Coursestaken")
public class CoursesRegestered {
	/**
	 * 
	 */
	
	@Column(name="studentId")
	private int studentId;
	@Id
	@Column(name="courseId")
	private int courseId;
	@Column(name="term")
	private String trem;
	@Column(name="classId")
	private String classId;
	
	@Column(name="professorId")
	private int professorId;
	@Column(name="grade")
	private String grade;
	@Column(name="classTiming")
	private String classTiming;
	
	@OneToOne(cascade = {CascadeType.ALL }, fetch=FetchType.LAZY)
	@JoinColumn(name="courseId")
	private Courses courses;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="professorId",insertable=false, updatable=false)
	private Professor professor;
	
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getTrem() {
		return trem;
	}
	public void setTrem(String trem) {
		this.trem = trem;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public int getProfessorId() {
		return professorId;
	}
	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getClassTiming() {
		return classTiming;
	}
	public void setClassTiming(String classTiming) {
		this.classTiming = classTiming;
	}
	
	

}
