package com.sms.service;

import java.util.List;

import com.sms.entity.Student_ent;
import com.sms.model.StudentDTO;

public interface Student_service {

//	for create new student
	StudentDTO createStudent(Student_ent student_ent);

//	fetch all student data
	List<StudentDTO> getAllStudent();

//	fetch by id
	StudentDTO getStudentById(int id);

//	update by id
	StudentDTO updateById(int id, Student_ent student_ent);

//	delete by id
	String deleteById(int id);
}
