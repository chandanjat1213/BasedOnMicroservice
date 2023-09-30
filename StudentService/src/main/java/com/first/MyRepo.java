package com.first;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MyRepo extends JpaRepository<Student, Integer> {
	
	@Query("from Student where tid=?1")
	public List<Student> getListByTid(int tid);
	
	/*
	 * @Query("delete from Student where roll=?1") public void deleteByRoll(int
	 * roll);
	 */

}
