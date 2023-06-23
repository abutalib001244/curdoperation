package com.crudoperation;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crudoperation.entity.Student;
import com.crudoperation.repository.StudentRepository;

@SpringBootTest
class CrudoperationApplicationTests {
	
	@Autowired
	private StudentRepository studentRepo;

	@Test
	void saveStudent() {
		Student s=new Student();
		s.setName("Talib");
		s.setCourse("Testing");
		s.setFee(10000);
		
		studentRepo.save(s);
	}
	@Test
	void deleteStudent() {
		studentRepo.deleteById(1L);
	}
	@Test
	void findStudent() {
		Optional<Student> findById = studentRepo.findById(3L);
		Student student = findById.get();
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
	}
	
	@Test
	void updateStudent() {
		Student s=new Student();
		s.setId(3L);
		s.setName("Talib");
		s.setCourse("Development");
		s.setFee(40000);
		
		studentRepo.save(s);
	}
		
	

}
