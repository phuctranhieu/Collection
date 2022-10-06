package com.vn.daicent.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class List1 {
	public static void main(String[] args) {
		School scl = new School(1, "xyz");
		School scl1 = new School(2, "qwe");
		School scl2 = new School(3, "jkl");
		System.out.println(scl.equals(scl2) && scl.equals(scl1));
		Set<School> schl = new HashSet<School>();
		schl.add(scl2);
		schl.add(scl1);
		schl.add(scl);
		for (School s : schl) {
			System.out.println(s);
		}
		Student std = new Student(1, "NAM", 9, 8,new Clazz(1, "Class 1"));
		Student std2 = new Student(2, "HAI", 7, 7,new Clazz(2, "Class 2"));
		Student std3 = new Student(3, "THANH", 5, 7,new Clazz(3, "Class 3"));
		Student std4 = new Student(4, "NGA", 9, 6,new Clazz(4, "Class 4"));
		Student std5 = new Student(5, "MINH", 5, 7,new Clazz(5, "Class 5"));
		Class cl = new Class(1, "1");
		Class c2 = new Class(2, "2");
		Class c3 = new Class(3, "3");
		Class c4 = new Class(4, "4");
		Class c5 = new Class(5, "5");

		Grade gd = new Grade(1, "Grade 1");
		Grade gd1 = new Grade(2, "Grade 2");
		Grade gd2 = new Grade(3, "Grade 3");
		Grade gd3 = new Grade(4, "Grade 4");
		Grade gd4 = new Grade(5, "Grade 5");

	
		// Sắp xếp theo Key

		List<Student> lists = new ArrayList<Student>();
		lists.add(std);
		lists.add(std2);
		lists.add(std4);
		// Collections.sort((List<Student>) lists);
		for (Student st : lists) {
			System.out.println(st.toString());
		}

		compareByAge ageComparator = new compareByAge();
		Collections.sort(lists, ageComparator);
		System.out.println("Compare by age:");
		for (Student st : lists) {
			System.out.println(st.toString());
		}
		compareByPoint point = new compareByPoint();
		Collections.sort(lists, point);
		System.out.println("Compare by point: ");
		for (Student stdd : lists) {
			System.out.println(stdd.toString());
		}
		System.out.println("Highest point: ");

		System.out.println(lists.get(0));

		System.out.println("==============");
//	        Set<Student> setStudent = new HashSet<>();
//	        setStudent.add(std4);
//	        setStudent.add(std3);
//	        setStudent.add(std2);
//	        setStudent.add(std1);
//	        setStudent.add(std);
//	        for (Student s: setStudent) {
//				System.out.println(s);			
//			}


		System.out.println("----------");

		List<ClassStudent> listClStd = new ArrayList<>();
		listClStd.add(null);

		Map<Class, Student> mapClassStudent = new HashMap<Class, Student>();
		mapClassStudent.put(c5, std4);
		mapClassStudent.put(c4, std3);
		mapClassStudent.put(c3, std2);
		mapClassStudent.put(c2, std);

		System.out.println(mapClassStudent);
	}}
											
	

