package com.data.jpa;

import com.data.jpa.entity.Student;
import com.data.jpa.persistence.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaDemoApplication.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		Student student = new Student();
		student.setId(1);
		student.setName("Vijay");
		student.setRank(123L);
		student.setGender("Male");
		studentRepository.save(student);
		System.out.println("Entry inserted");
	}

}
