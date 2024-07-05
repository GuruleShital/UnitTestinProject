package com.BikkadIT.CrudRepositoryMethods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import com.BikkadIT.CrudRepositoryMethods.entity.Student;
import com.BikkadIT.CrudRepositoryMethods.service.StudentserviceI;

@Controller
public class StudentController {

	@Autowired
	private StudentserviceI studentserviceI;

	public Student saveStudent(Student stu) {
		Student student = studentserviceI.saveStudent(stu);
		return student;

	}

	public List<Student> saveAllStudent(List<Student> students) {

		List<Student> saveAllStudents = studentserviceI.saveAllStudents(students);
		return saveAllStudents;

	}

	public List<Student> getAllStudents() {
		List<Student> allRecordss = studentserviceI.getAllRecordss();
		return allRecordss;

	}

	public List<Student> getAllStudentMPK(List<Integer> ids) {

		List<Student> allStuMPK = studentserviceI.getAllStuMPK(ids);
		return allStuMPK;

	}

	public boolean existRecord(Integer id) {
		boolean existsByIdStu = studentserviceI.existsByIdStu(id);
		return existsByIdStu;

	}

	public long countNoOfRecord() {
		long countNoOfRecord = studentserviceI.countNoOfRecord();
		return countNoOfRecord;

	}

	public Student getStuById(Integer id) {
		Student studentById = studentserviceI.getStudentById(id);
		return studentById;

	}

	public void deleteRecordById(Integer id) {
		studentserviceI.deleteRecordById(id);
	}

	public void deleteRecordByObject(Student stu) {
		studentserviceI.deleteRecordByObject(stu);

	}

	public void deleteStuByMPK(List<Integer> list) {
		studentserviceI.deleteStuByMPK(list);

	}

	public void deleteAllRecords() {

		studentserviceI.deleteAllRecords();
	}

	public Page<Student> Pagination() {

		Page<Student> pagination = studentserviceI.Pagination();
		return pagination;

	}

	public List<Student> SortingStu() {
		List<Student> sorting = studentserviceI.Sorting();
		return sorting;

	}

	public Student getStuPathByid(int rollno) {
		Student stuPathByid = studentserviceI.getStuPathByid(rollno);
		return stuPathByid;

	}

	public Student getStuByName(String name) {
		Student stuByName = studentserviceI.getStuByName(name);
		return stuByName;

	}

	public Student getStuByAddr(String addr) {
		Student stuByAddr = studentserviceI.getStuByAddr(addr);
		return stuByAddr;
	}

	public Student getStuByNameAndAddr(String name, String addr) {
		Student stuNameAndAddr = studentserviceI.getStuNameAndAddr(name, addr);
		return stuNameAndAddr;
	}

	public Student getStuByNameorAddr(String name, String addr) {
		Student stuNameORAddr = studentserviceI.getStuNameOrAddr(name, addr);
		return stuNameORAddr;
	}

	public List<Student> getStuBetween(int rollno1, int rollno2) {

		List<Student> stuBetween = studentserviceI.getStuBetween(rollno1, rollno2);
		return stuBetween;

	}

	public List<Student> getStuRollnoLessthan(int rollno) {
		List<Student> stuRollnoLessThan = studentserviceI.getStuRollnoLessthan(rollno);
		return stuRollnoLessThan;

	}

	public List<Student> getStuRollnoLessthanEqual(int rollno) {
		List<Student> stuRollnoLessthanEqual = studentserviceI.getStuRollnoLessthanEqual(rollno);
		return stuRollnoLessthanEqual;
	}

	public List<Student> getStuRollnoGreaterthan(int rollno) {
		List<Student> stuRollnoGreaterthan = studentserviceI.getStuRollnoGreaterthan(rollno);
		return stuRollnoGreaterthan;

	}

	public List<Student> getStuRollnoGreaterthanEqual(int rollno) {
		List<Student> stuRollnoGreaterthanEqual = studentserviceI.getStuRollnoGreaterthanEqual(rollno);
		return stuRollnoGreaterthanEqual;

	}

	public List<Student> getStuNameIsNotnull() {
		List<Student> stuNameIsNotNull = studentserviceI.getStuNameIsNotNull();
		return stuNameIsNotNull;
		}
	
	public List<Student> getStuNameNotNull(){
		List<Student> stuNameNotNull = studentserviceI.getStuNameNotNull();
		return stuNameNotNull;
		
	}
	public List<Student>getStuNameLike(String name){
		List<Student> stuNameLike = studentserviceI.getStuNameLike(name);
		return stuNameLike;
		
	}
	public List<Student>getStuNameNotLike(String name){
		List<Student> stuNameNotLike = studentserviceI.getStuNameNotLike(name);
		return stuNameNotLike;
		
	}
	public List<Student>getStuNameStartingWith(String s){
		List<Student> stuNameStartingWith = studentserviceI.getStuNameStartingWith(s);
		return stuNameStartingWith;
	}
	public List<Student> getStuNameEndingWith(String s){
		List<Student> stuNameEndingWith = studentserviceI.getStuNameEndingWith(s);
		return stuNameEndingWith;
		
	}
	public List<Student> getAllStuHql(){
		List<Student> allStuHql = studentserviceI.getAllStuHql();
		return allStuHql;
		
	}
	public List<Student> getAllStuSql(){
		List<Student> allStuSql = studentserviceI.getAllStuSql();
		return allStuSql;
		
	}
	public Student getAllStuByIdHql(int rollno) {
		Student allStuByIdHql = studentserviceI.getAllStuByIdHql(rollno);
		return allStuByIdHql;
	}
	public Student getAllStuByIdSql(int rollno) {
		return null;
		
	}

}