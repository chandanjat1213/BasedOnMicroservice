package com.first;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TrainerService {

	@Autowired
	public TrainerServiceApplication ap;
	
	public Trainer getTrainerbyId(int id)
	{
		Trainer t;
		if(id==1)
		{
			t = new Trainer(1,"tanveer","java", new ArrayList<Student>());
		}
		else if(id==2)
		{
			t = new Trainer(2,"gourav","java", new ArrayList<Student>());
		}
		else if(id==3)
		{
			t = new Trainer(1,"ronak","java", new ArrayList<Student>());
		}
		else if(id==4)
		{
			t = new Trainer(1,"abhishekh","java", new ArrayList<Student>());
		}
		else
		{
			t = null;
		}
		RestTemplate template = ap.getRestTemplate();
		List l=template.getForObject("http://student-service/student/"+id, List.class);
		t.setStudents(l);
		return t;
	}
	
	public Student addStudent(Student s)
	{
		RestTemplate template=ap.getRestTemplate();
		return template.postForObject("http://student-service/student", s, Student.class);
	}
	
	public String deleteStudent(int id)
	{
		RestTemplate template = ap.getRestTemplate();
		template.delete("http://student-service/student/"+id);
		return "deleted";
	}
	
	public String updateStudent(Student s,int id)
	{
		RestTemplate template = ap.getRestTemplate();
	 	template.put("http://student-service/student/"+id, s);
	 	return "updated";
		
	}
}
