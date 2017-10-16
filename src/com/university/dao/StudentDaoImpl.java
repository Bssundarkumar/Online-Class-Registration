package com.university.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.university.entity.Courses;
import com.university.entity.CoursesRegestered;
import com.university.entity.Department;
import com.university.entity.Professor;
import com.university.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Student> getStudents() {
		Session currentSession = sessionFactory.getCurrentSession();
		List<Student> students = currentSession.createQuery("from Student").list();
		return students;
	}

	// Student LogiN Controller
	@Override
	public Student getStudent(String firstName) {
		Session currentSession = sessionFactory.getCurrentSession();

		List<Student> students = currentSession.createQuery(
				"from Student S where S.firstName='"+firstName +"'").list();
		Student student = null;
		for (Iterator iterator = students.iterator(); iterator.hasNext();) {
			Student student1 = (Student) iterator.next();
			student = student1;

		}
		if (student != null) {
			return student;
		} else {
			return null;
		}
	}

	@Override
	public List<CoursesRegestered> getCourseList(int studentId) {
		Session currentSession = sessionFactory.getCurrentSession();
	/*	CoursesRegestered coursesRegestered=new CoursesRegestered();
		
		Courses courses=new Courses();
		courses.setCourseId(11);
		courses.setCourseName("AdvanceSoftware Engineering");
		courses.setDepartmentId(2);
		courses.setNoOfCredits(3);
		courses.setTerm("sdsd");
		
		
		Professor professor=new Professor();
		professor.setAddress("guntur");
		professor.setDepartmentId(1);
		professor.setEmailId("bss5757@gmail.com");
		professor.setFirstName("sundar");
		professor.setGender("male");
		professor.setProfessorId(1);
		professor.setPassword("password");
		professor.setLastName("kumar");
		professor.setYearEnrolled("2014");
		
		
		coursesRegestered.setClassId("1");
		coursesRegestered.setClassTiming("bakdhvvk");
		coursesRegestered.setCourseId(courses.getCourseId());
		coursesRegestered.setCourses(courses);
		coursesRegestered.setGrade("A");
		coursesRegestered.setProfessor(professor);
		coursesRegestered.setProfessorId(professor.getProfessorId());
		coursesRegestered.setStudentId(1);
		coursesRegestered.setTrem("a");
	
		currentSession.save(coursesRegestered);*/
		List<CoursesRegestered> courseList = currentSession.createQuery("from CoursesRegestered c  where c.studentId='"+studentId+"'").list();
		/*for (CoursesRegestered coursesRegestered : courseList) {
			Courses cs=currentSession.get(Courses.class, coursesRegestered.getCourseId());
			
		}*/
		if (courseList != null) {
			return courseList;
		} else {
			return null;
		}

	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		
		Session currentSession=sessionFactory.getCurrentSession();
		List<Department> departments = currentSession.createQuery(
				"from Department").list();
		return departments;
	}

	@Override
	public List<Courses> getCourseList(String departmentName) {
		Session currentSession=sessionFactory.getCurrentSession();
		List<Department> departments = currentSession.createQuery(
				"from Department D where D.departmentName='"+departmentName +"'").list();
		Department department = null;
		for (Iterator iterator = departments.iterator(); iterator.hasNext();) {
			Department department2 = (Department) iterator.next();
			department = department2;

		}	
		List<Courses> courses=currentSession.createQuery(
				"from Courses C where C.departmentId='"+department.getDepartmentId()+"'").list();
		return courses; 
	}

	

	/*@Override
	public Courses getCourses(int courseId) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		List<Courses> thecourses=currentSession.createQuery("from course S where S.courseId='"+courseId+ "'").list();
		Courses  course=null;
		for (Iterator iterator = thecourses.iterator(); iterator.hasNext();) {
			Courses course1 = (Courses) iterator.next();
			course = course1;

		}
		if (course != null) {
			return course;
		} else {
			return null;
		}
		
		
	}*/
}
