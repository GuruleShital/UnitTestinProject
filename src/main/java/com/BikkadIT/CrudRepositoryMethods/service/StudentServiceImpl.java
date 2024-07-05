package com.BikkadIT.CrudRepositoryMethods.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.BikkadIT.CrudRepositoryMethods.dao.StudentRepositroy;
import com.BikkadIT.CrudRepositoryMethods.entity.Student;

@Service
public class StudentServiceImpl implements StudentserviceI {
	@Autowired
	private StudentRepositroy studentRepositroy;

	@Override
	public Student saveStudent(Student stu) {
		Student student = studentRepositroy.save(stu);
		return student;
	}

	@Override
	public List<Student> saveAllStudents(List<Student> students) {
		List<Student> saveAll = (List<Student>) studentRepositroy.saveAll(students);
		return saveAll;
	}

	@Override
	public List<Student> getAllRecordss() {
		List<Student> all = (List<Student>) studentRepositroy.findAll();
		return all;
	}

	@Override
	public List<Student> getAllStuMPK(List<Integer> list) {
		List<Student> allById = (List<Student>) studentRepositroy.findAllById(list);
		return allById;
	}

	@Override
	public boolean existsByIdStu(Integer ids) {
		boolean existsById = studentRepositroy.existsById(ids);
		return existsById;
	}

	@Override
	public long countNoOfRecord() {
		long count = studentRepositroy.count();
		return count;
	}

	@Override
	public Student getStudentById(Integer id) {
		Student byId = studentRepositroy.findById(id).get();
		return byId;
	}

	@Override
	public void deleteRecordById(Integer id) {
		studentRepositroy.deleteById(id);
	}

	@Override
	public void deleteRecordByObject(Student stu) {
		studentRepositroy.delete(stu);

	}

	@Override
	public void deleteStuByMPK(List<Integer> list) {

		studentRepositroy.deleteAllById(list);
	}

	@Override
	public void deleteAllRecords() {

		studentRepositroy.deleteAll();
	}

	@Override
	public Page<Student> Pagination() {
		PageRequest of = PageRequest.of(2, 3);
		Page<Student> all = studentRepositroy.findAll(of);
		return all;
	}

	@Override
	public List<Student> Sorting() {
		List<Student> all = studentRepositroy.findAll(Sort.by("name").descending());
		return all;
	}

	@Override
	public Student getStuPathByid(int rollno) {

		Student byRollno = studentRepositroy.findByRollno(rollno);
		return byRollno;
	}

	@Override
	public Student getStuByName(String name) {
		Student byName = studentRepositroy.findByName(name);
		return byName;
	}

	@Override
	public Student getStuByAddr(String addr) {
		Student byAddr = studentRepositroy.findByAddr(addr);
		return byAddr;
	}

	@Override
	public Student getStuNameAndAddr(String name, String addr) {
		Student byNameAndAddr = studentRepositroy.findByNameAndAddr(name, addr);
		return byNameAndAddr;
	}

	@Override
	public Student getStuNameOrAddr(String name, String addr) {
		Student byNameORAddr = studentRepositroy.findByNameOrAddr(name, addr);
		return byNameORAddr;
	}

	@Override
	public List<Student> getStuBetween(int rollno1, int rollno2) {
		List<Student> byIdBetween = studentRepositroy.findByRollnoBetween(rollno1, rollno2);
		return byIdBetween;
	}

	@Override
	public List<Student> getStuRollnoLessthan(int rollno) {
		List<Student> byRollnoLessThan = studentRepositroy.findByRollnoLessThan(rollno);
		return byRollnoLessThan;
	}

	@Override
	public List<Student> getStuRollnoLessthanEqual(int rollno) {
		List<Student> byRollnoLessThanEqual = studentRepositroy.findByRollnoLessThanEqual(rollno);
		return byRollnoLessThanEqual;
	}

	@Override
	public List<Student> getStuRollnoGreaterthan(int rollno) {
		List<Student> byRollnoGreaterThan = studentRepositroy.findByRollnoGreaterThan(rollno);
		return byRollnoGreaterThan;
	}

	@Override
	public List<Student> getStuRollnoGreaterthanEqual(int rollno) {
		List<Student> byRollnoGreaterThanEqual = studentRepositroy.findByRollnoGreaterThanEqual(rollno);
		return byRollnoGreaterThanEqual;
	}

	@Override
	public List<Student> getStuNameIsNotNull() {
		List<Student> byNameIsNotNull = studentRepositroy.findByNameIsNotNull();
		return byNameIsNotNull;
	}

	@Override
	public List<Student> getStuNameNotNull() {
		List<Student> byNameNotNull = studentRepositroy.findByNameNotNull();
		return byNameNotNull;
	}

	@Override
	public List<Student> getStuNameLike(String name) {
		List<Student> byNameLike = studentRepositroy.findByNameLike(name);
		return byNameLike;
	}

	@Override
	public List<Student> getStuNameNotLike(String name) {
		List<Student> byNameNotLike = studentRepositroy.findByNameNotLike(name);
		return byNameNotLike;
	}

	@Override
	public List<Student> getStuNameStartingWith(String s) {
		List<Student> byNameStartingWith = studentRepositroy.findByNameStartingWith(s);
		return byNameStartingWith;
	}

	@Override
	public List<Student> getStuNameEndingWith(String s) {
		List<Student> byNameEndingWith = studentRepositroy.findByNameEndingWith(s);
		return byNameEndingWith;
	}

	@Override
	public List<Student> getAllStuHql() {
		List<Student> studentsHql = studentRepositroy.getStudentsHql();
		return studentsHql;
	}

	@Override
	public List<Student> getAllStuSql() {
		List<Student> studentsSql = studentRepositroy.getStudentsSql();
		return studentsSql;
	}

	@Override
	public Student getAllStuByIdHql(int rollno) {
		Student stuByIdHql = studentRepositroy.getStuByIdHql(rollno);
		return stuByIdHql;
	}

	

}
