package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.Student;

@Controller
public class StudentController {
	@GetMapping("/start")
	public String start() {
		return "index";
	}
	@PostMapping("registration")
	public String regdetails(Student student){
		System.out.println(student.getName());
		System.out.println(student.getPass());
		return "success";
		
	}

}
