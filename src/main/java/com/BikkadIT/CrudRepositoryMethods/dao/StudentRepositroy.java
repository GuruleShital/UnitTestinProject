package com.BikkadIT.CrudRepositoryMethods.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.BikkadIT.CrudRepositoryMethods.entity.Student;

@Repository
public interface StudentRepositroy extends JpaRepository<Student, Integer> {

	public Student findByRollno(int rollno);

	public Student findByName(String name);
	
	public Student findByAddr(String addr);
	
	public Student findByNameAndAddr(String name,String addr);
	
	public Student findByNameOrAddr(String name,String addr);
	
	public List<Student> findByRollnoBetween(int rollno1,int rollno2);
	
	public List<Student> findByRollnoLessThan(int rollno);
	
	public List<Student> findByRollnoLessThanEqual(int rollno);
	
	public List<Student> findByRollnoGreaterThan(int rollno);
	
	public List<Student> findByRollnoGreaterThanEqual(int rollno);
	
	public List<Student> findByNameIsNotNull();
	
	public List<Student> findByNameNotNull();
	
	public List<Student>findByNameLike(String name);
	
	public List<Student>findByNameNotLike(String name);
	
	public List<Student>findByNameStartingWith(String s);
	
	public List<Student>findByNameEndingWith(String s);
	
	@Query("from Student")
	public List<Student> getStudentsHql();
	
	@Query(value="Select *from Student_table" ,nativeQuery = true)
	public List<Student> getStudentsSql();
	
	@Query("FROM Student WHERE rollno=:rollno")
	public Student getStuByIdHql(int rollno);
	



}
