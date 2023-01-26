package com.prowings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.Student;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hellooooo everyone !!!!";
	}

	@GetMapping("/student")
	public Student getStudent() {
		Student s1 = new Student();
		s1.setId(10);
		s1.setName("Pramod");
		s1.setCity("Kolhapur");
		System.out.println("new student to be created");
		return s1;
	}

}
