package com.BikkadIT.CrudRepositoryMethods;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.BikkadIT.CrudRepositoryMethods.controller.StudentController;
import com.BikkadIT.CrudRepositoryMethods.entity.Student;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class CrudRepositoryMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudRepositoryMethodsApplication.class, args);
		StudentController studentController = context.getBean(StudentController.class);

		/*
		 * Student stu =new Student(); stu.setRollno(1); stu.setName("shital");
		 * stu.setAddr("Nashik"); stu.setPanNo("123PQR");
		 * 
		 * Student student = studentController.saveStudent(stu);
		 * System.out.println(student);
		 * 
		 * Student stu3 =new Student(); stu3.setRollno(3); stu3.setName("Gayatri");
		 * stu3.setAddr("Pune"); stu3.setPanNo("XYZ345");
		 * 
		 * Student stu4 =new Student(); stu4.setRollno(4); stu4.setName("Neha");
		 * stu4.setAddr("Nashik"); stu4.setPanNo("MNO987");
		 * 
		 * Student stu5 =new Student(); stu5.setRollno(5); stu5.setName("Nikita");
		 * stu5.setAddr("Mohadi"); stu5.setPanNo("UVW678");
		 * 
		 * List<Student> list=new ArrayList(); list.add(stu3); list.add(stu4);
		 * list.add(stu5);
		 * 
		 * List<Student> saveAllStudent = studentController.saveAllStudent(list);
		 * System.out.println(saveAllStudent);
		 */
		// List<Student> allStudents = studentController.getAllStudents();
		// System.out.println(allStudents);

		/*
		 * List<Integer>ids =new ArrayList(); ids.add(2); ids.add(4); List<Student>
		 * allStudentMPK = studentController.getAllStudentMPK(ids);
		 * System.out.println(allStudentMPK);
		 */

		/*
		 * boolean existRecord = studentController.existRecord(6);
		 * System.out.println(existRecord);
		 */

		/*
		 * long countNoOfRecord = studentController.countNoOfRecord();
		 * System.out.println(countNoOfRecord);
		 */

		/*
		 * Student stuById = studentController.getStuById(2); System.out.println(stuById
		 * );
		 */

		// studentController.deleteRecordById(5);

		/*
		 * Student stu=new Student(); stu.setRollno(4);
		 * studentController.deleteRecordByObject(stu);
		 */

		/*
		 * List<Integer>ids =new ArrayList(); ids.add(2); ids.add(4);
		 * 
		 * studentController.deleteStuByMPK(ids);
		 */

		// studentController.deleteAllRecords();

		/*
		 * Page<Student> pagination = studentController.Pagination(); for(Student
		 * p:pagination) { System.out.println(p); }
		 * 
		 * 
		 * }
		 */

		/*
		 * List<Student> sortingStu = studentController.SortingStu(); for(Student
		 * s:sortingStu) { System.out.println(s); }
		 */

		/*
		 * Student stuPathByid = studentController.getStuPathByid(1);
		 * System.out.println(stuPathByid);
		 */

		/*
		 * Student stuByName = studentController.getStuByName("Nikita");
		 * System.out.println(stuByName);
		 */

		/*
		 * Student stuByAddr = studentController.getStuByAddr("Nashik");
		 * System.out.println(stuByAddr);
		 */
		
	/*	Student stuByNameAndAddr = studentController.getStuByNameAndAddr("Shital", "Nashik");
		System.out.println(stuByNameAndAddr);
*/
	/*	Student stuByNameORAdrr = studentController.getStuByNameorAddr("Shital", "Mohadi");
		System.out.println(stuByNameORAdrr);*/
		
	/*	List<Student> stuBetween = studentController.getStuBetween(2,6);
		System.out.println(stuBetween);
		*/
	/*	List<Student> stuRollnoLessThan = studentController.getStuRollnoLessthan(5);
		System.out.println(stuRollnoLessThan);*/
		
	/*	List<Student> stuRollnoLessthanEqual = studentController.getStuRollnoLessthanEqual(5);
		System.out.println(stuRollnoLessthanEqual);*/
		
		/*List<Student> stuRollnoGreaterthan = studentController.getStuRollnoGreaterthan(4);
		System.out.println(stuRollnoGreaterthan);*/
		
	/*	List<Student> stuRollnoGreaterthanEqual = studentController.getStuRollnoGreaterthanEqual(4);
		System.out.println(stuRollnoGreaterthanEqual);*/
		
	/*	List<Student> stuNameNotnull = studentController.getStuNameIsNotnull();
		System.out.println(stuNameNotnull);*/
		
		/*List<Student> stuNameNotNull = studentController.getStuNameNotNull();
		System.out.println(stuNameNotNull);*/
		
	/*List<Student> stuNameLike = studentController.getStuNameLike("Gayatri");
		System.out.println(stuNameLike);*/
		
	/*	List<Student> stuNameNotLike = studentController.getStuNameNotLike("Supriya");
		System.out.println(stuNameNotLike);*/
		
		/*List<Student> stuNameStartingWith = studentController.getStuNameStartingWith("m");
		System.out.println(stuNameStartingWith);*/
		
		/*List<Student> stuNameEndingWith = studentController.getStuNameEndingWith("r");
		System.out.println(stuNameEndingWith);*/
		
	/*	List<Student> allStuHql = studentController.getAllStuHql();
		System.out.println(allStuHql);
		
		List<Student> allStuSql = studentController.getAllStuSql();
		System.out.println(allStuSql);*/

		Student allStuByIdHql = studentController.getAllStuByIdHql(3);
		System.out.println(allStuByIdHql);
		
	/*	Student allStuByIdSql = studentController.getAllStuByIdSql(5);
		System.out.println(allStuByIdSql);*/
	}
}