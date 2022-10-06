package com.vn.daicent.test;

import java.util.Comparator;

public class compareByAge implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		if (o1.getAge()>o2.getAge()) {
			return 1;
		}
		else if (o1.getAge()<o2.getAge()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
