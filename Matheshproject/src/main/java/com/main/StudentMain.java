package com.main;

import java.util.ArrayList;
import java.util.List;

import com.model.Student;
import com.service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Madhesh", 24, 97.65f);
		Student student2 = new Student(2, "Siva", 28, 100.00f);
		Student student3 = new Student(3, "Gokul", 22, 99.99f);
		Student student4 = new Student(4, "Kabilan", 24, 98.88f);

		List<Student> listOStudents = new ArrayList<Student>();
		listOStudents.add(student1);
		listOStudents.add(student2);
		listOStudents.add(student3);
		listOStudents.add(student4);

		StudentService service = new StudentService();
		List<Student> result = service.checkByAge(listOStudents, 28);
		if (result != null && result.size() > 0) {
			for (Student student : result) {

				// System.out.println(student.toString());
				System.out.println(student.getStudName());

			}

		} else {
			System.out.println("There is no data");
		}
	}

}
