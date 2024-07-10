package com.student.dal;

import com.student.dal.entities.Student;
import com.student.dal.repos.StudentRepostory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepostory repo;
	@Test
	void testCreatesStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("SpringBoot Use");
		student.setFee(30d);

//		Test and Save the data in the table
//		repo.save(student);

	}
	@Test
	void testFindStudent(){
//		Test and Read the data from the table
//		Student student = repo.findById(1l).get();
//		System.out.println(student);
	}

	@Test
	void testUpdateStudent(){
//		Test and Update the data from the table
//		Student student = repo.findById(1l).get();
//		student.setFee(40d);
//		repo.save(student);
//		System.out.println(student);
	}

	@Test
	void testDeleteStudent(){
//		Test and Delete the data from the table
//		Student student = repo.findById(1l).get();
//		repo.delete(student);
	}


}
