package com.university.bean;

import java.util.List;

import com.university.entity.CoursesRegestered;
import com.university.entity.Student;

public class StudentCourse {
	private Student student;
	private List<CoursesRegestered> coursesRegestered;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public List<CoursesRegestered> getCoursesRegestered() {
		return coursesRegestered;
	}
	public void setCoursesRegestered(List<CoursesRegestered> coursesRegestered) {
		this.coursesRegestered = coursesRegestered;
	}
	
	
}
