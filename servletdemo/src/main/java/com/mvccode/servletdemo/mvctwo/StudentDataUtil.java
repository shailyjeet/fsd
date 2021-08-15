package com.mvccode.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	public static List<Student> getStudents() {

		// create an empty list
		List<Student> students = new ArrayList<>();

		// add sample data
		students.add(new Student("J", "J", "jj@gmail.com"));
		students.add(new Student("Adi", "J", "adij@gmail.com"));
		students.add(new Student("C", "J", "cj@gmail.com"));

		// return the list
		return students;
	}
}
