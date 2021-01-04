package com.example.demo.h2.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.h2.model.Student;
import com.example.demo.h2.repositories.StudentRepository;

@RestController
@RequestMapping("/springh2")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return (List<Student>) studentRepository.findAll();
	}
	@GetMapping("/students/{id}")
	public Optional<Student> getStudentById(@PathVariable Integer id) {
		return studentRepository.findById(id);
	} 
	@PostMapping("/students")
	public void addstudent(@RequestBody Student student) {
		studentRepository.save(student);
	}
	@PutMapping("/students")
	public void updatestudent(
			@PathVariable("id") Integer id,
			@RequestBody Student student) {
		studentRepository.save(student);
	}
	@DeleteMapping("/students/{id}")
	public void deletestudent(@PathVariable("id") Integer id) {
		studentRepository.deleteById(id); 
	}

}
