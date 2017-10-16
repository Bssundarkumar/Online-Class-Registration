package com.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.university.entity.Courses;
import com.university.entity.CoursesRegestered;
import com.university.entity.Department;
import com.university.entity.Student;
import com.university.service.StudentService;

@Controller
@RequestMapping("/login")
public class LogInController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/student")
	public String studentLogin(Model myModel) {
		return "StudentLogin";
	}

	@GetMapping("/professor")
	public String professorLogin(Model myModel) {
		return "ProfessorLogin";
	}

	@GetMapping("/admin")
	public String adminLogin(Model myModel) {
		return "AdminLogin";
	}

	@GetMapping("/backToWelcomeForm")
	public String backToWelcome(Model myModel) {
		return "welcome";
	}

	@GetMapping("/studentpage")
	public String studentHome(Model model) {
		return "StudentHome";
	}
//StudentLogin
	@SuppressWarnings("unused")
	@PostMapping("/studentLogin")
	public String backToWelcomeForm(@RequestParam("firstName") String firstName,
			@RequestParam("password") String loginPassword, Model model) {
		//get student from database 
		Student student=studentService.getStudent(firstName);
		List<Courses> cs=studentService.getCourses();
		List<CoursesRegestered> courses=studentService.getCoursList(student.getStudentId());
		List<Department> departments=studentService.getDepartment();
		
		model.addAttribute("student",student);
		model.addAttribute("courses",courses);
		model.addAttribute("departments", departments);
		if(student==null){
			return "StudentLoginFailure";
		}
		if(student.getPassword().equals(loginPassword)){
		//validate with password
		return "StudentHome";
		}else{
			return "StudentLoginFailure";
		}
	}
	
	 @RequestMapping(value="/getCourseList",method=RequestMethod.POST)
	 @ResponseBody
	 public  List<Courses> getSecndList(@RequestParam("selectDepartment")String departmentName, Model model){
		 List<Courses> courses=studentService.getCourseList(departmentName);
		 	model.addAttribute("selectCourses",courses);
		 	System.out.println(courses);
	        return courses;
	    }

}
