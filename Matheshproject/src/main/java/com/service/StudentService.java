package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class StudentService {

	public List<Student> checkByAge(List<Student> list, int age) {

		List<Student> listStud = new ArrayList<Student>();
		for (Student student : list) {
			if (student != null) {
				if (student.getAge() >= age) {
					listStud.add(student);
				}
			}
		}

		return listStud;
	}
}
