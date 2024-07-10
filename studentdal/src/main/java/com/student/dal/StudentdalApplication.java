package com.student.dal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentdalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentdalApplication.class, args);
		System.out.println("Student_Data_Access_Layer");
		System.err.println("Student_Data_Access_Layer");
	}

}
