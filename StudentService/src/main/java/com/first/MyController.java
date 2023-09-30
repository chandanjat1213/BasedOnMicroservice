package com.first;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	public StudentService service;
	
	@GetMapping("/student/{tid}")
	public List<Student> show(@PathVariable("tid") int tid)
	{
		return service.searchByTid(tid);
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student s)
	{
		return service.addStudent(s);
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable("id") int id)
	{
	   service.delete(id);
	   return "deleted";
	}
	
	@PutMapping("/student/{id}")
	public Student updateStudent(@RequestBody Student s,@PathVariable("id") int id)
	{
		return service.update(s,id);
	}
	
	@GetMapping("/student")
	public List<Student> show()
	{
		return service.showAll();
	}
}
