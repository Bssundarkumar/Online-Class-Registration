package com.university.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.university.dao.StudentDao;
import com.university.entity.Courses;
import com.university.entity.CoursesRegestered;
import com.university.entity.Department;
import com.university.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	@Transactional
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		
		return studentDao.getStudents();
	}
	@Override
	@Transactional
	public Student getStudent(String firstName) {
		// TODO Auto-generated method stub
		
		return studentDao.getStudent(firstName);
	}
	@Override
	@Transactional
	public List<CoursesRegestered> getCoursList(int studentId) {
		// TODO Auto-generated method stub
		System.out.println("1");
		return studentDao.getCourseList(studentId);
	}
	@Override
	@Transactional
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return studentDao.getCourses();
	}
	@Override
	@Transactional
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		return studentDao.getDepartment();
	}
	@Override
	@Transactional
	public List<Courses> getCourseList(String departmentName) {
		// TODO Auto-generated method stub
		return studentDao.getCourseList(departmentName);
	}
	

	
}
