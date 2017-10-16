package com.university.service;

import java.util.List;

import com.university.entity.Courses;
import com.university.entity.CoursesRegestered;
import com.university.entity.Department;
import com.university.entity.Student;


public interface StudentService {

	List<Student> getStudents();

	Student getStudent(String firstName);

	List<CoursesRegestered> getCoursList(int studentId);

	List<Courses> getCourses();

	List<Department> getDepartment();

	List<Courses> getCourseList(String departmentName);

	
}
