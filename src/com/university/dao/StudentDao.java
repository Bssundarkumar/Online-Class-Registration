package com.university.dao;

import java.util.List;

import com.university.entity.Courses;
import com.university.entity.CoursesRegestered;
import com.university.entity.Department;
import com.university.entity.Student;


public interface StudentDao {

	List<Student> getStudents();

	Student getStudent(String firstName);

	List<CoursesRegestered> getCourseList(int studentId);

	List<Courses> getCourses();

	List<Department> getDepartment();

	
	List<Courses> getCourseList(String departmentName);

	/*Courses getCourses(int courseId);
	
*/

}
