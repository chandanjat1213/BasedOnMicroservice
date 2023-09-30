package com.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	public MyRepo repo;

	public Student addStudent(Student s)
	{
		return repo.save(s);
	}
	
	public List<Student> searchByTid(int id)
	{
		return repo.getListByTid(id);
	}
	
	public void delete(int id)
	{
		repo.deleteById(id);
	}
	
	public Student update(Student s,int id)
	{
		Student s1 = repo.findById(id).orElse(new Student());
		if(s1==null)
		{
			return s1;
		}
		else
		{
			s1.setRoll(s.getRoll());
			s1.setName(s.getName());
			s1.setFees(s.getFees());
			s1.setTid(s.getTid());
			return repo.save(s1);
		}
	}
	
	public List<Student> showAll()
	{
		return repo.findAll();
	}
}
