package com.subash.Employee.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.subash.Employee.Model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

	List<Student> l = new ArrayList<Student>(List.of(
			new Student(101, "Subash", 76),
			new Student(102, "Mani", 85)
	));
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return l;
	}
	
	@PostMapping("/students")
	public Student addStudents(@RequestBody Student student) {
		l.add(student);
		return student;
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest req) {
		return (CsrfToken) req.getAttribute("_csrf");
	}
	
}
