package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@PostMapping
	public Student postStudent(@RequestBody Student std){
		return studentRepo.save(std);
		
	}
	
	@GetMapping
	public List<Student> getStudent(){
		return studentRepo.findAll();
		
	}

}
