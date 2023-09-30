package com.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	public TrainerService service;
	
	@GetMapping("trainer/{id}")
	public Trainer show(@PathVariable("id") int id)
	{
		return this.service.getTrainerbyId(id);
	}
	
	@PostMapping("trainerAddStudent")
	public Student addStudent(@RequestBody Student s)
	{
		return this.service.addStudent(s);
	}
	
	@DeleteMapping("trainerDelStudent/{id}")
	public String deleteStudent(@PathVariable("id") int id)
	{
		return this.service.deleteStudent(id); 
	}
	
	@PutMapping("trainerUpStudent/{id}")
	public String updateStudent(@RequestBody Student s,@PathVariable("id") int id)
	{
		return this.service.updateStudent(s, id);
	}
}
