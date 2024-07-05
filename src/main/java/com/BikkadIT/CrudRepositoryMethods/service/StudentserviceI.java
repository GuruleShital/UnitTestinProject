package com.BikkadIT.CrudRepositoryMethods.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

import com.BikkadIT.CrudRepositoryMethods.entity.Student;

public interface StudentserviceI {

	public Student saveStudent(Student stu);

	public List<Student> saveAllStudents(List<Student> students);

	public List<Student> getAllRecordss();

	public List<Student> getAllStuMPK(List<Integer> list);

	public Student getStudentById(Integer id);

	public boolean existsByIdStu(Integer ids);

	public long countNoOfRecord();

	public void deleteRecordById(Integer id);

	public void deleteRecordByObject(Student stu);

	public void deleteStuByMPK(List<Integer> list);

	public void deleteAllRecords();

	public Page<Student> Pagination();

	public List<Student> Sorting();

	public Student getStuPathByid(int rollno);

	public Student getStuByName(String name);
	
	public Student getStuByAddr(String addr);
	
	public Student getStuNameAndAddr(String name,String addr);
	
	public Student getStuNameOrAddr(String name,String addr);
	
	public List<Student> getStuBetween(int rollno1,int rollno2);
	
	public List<Student> getStuRollnoLessthan(int rollno);
	
	public List<Student> getStuRollnoLessthanEqual(int rollno);
	
	public List<Student> getStuRollnoGreaterthan(int rollno);
	
	public List<Student> getStuRollnoGreaterthanEqual(int rollno);
	
	public List<Student> getStuNameIsNotNull();
	
	public List<Student> getStuNameNotNull();
	
	public List<Student>getStuNameLike(String name);
	
	public List<Student>getStuNameNotLike(String name);
	
	public List<Student>getStuNameStartingWith(String s);
	
	public List<Student>getStuNameEndingWith(String s);
	
	public List<Student> getAllStuHql();
	
	public List<Student> getAllStuSql();
	
	public Student getAllStuByIdHql(int rollno);
	

	


}
