package com.vn.daicent.test;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparator<Student> {
	private int idStudent;
	private String name;
	private int age;
	private int point;
	private Clazz clazz;
	public Student(int idStudent, String name, int age, int point, Clazz clazz) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.age = age;
		this.point = point;
		this.clazz = clazz;
	}
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	@Override
	public String toString() {
		return "Student" + "idStudent=" + idStudent + " " + "name=" + name + " " + "age=" + age + " " + "point=" + point +"clazz" + clazz+ "\n";
	}
	@Override
	public int compare(Student o1, Student o2) {
		return this.getName().compareTo(o1.getName());
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, clazz, idStudent, name, point);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(clazz, other.clazz) && idStudent == other.idStudent
				&& Objects.equals(name, other.name) && point == other.point;
	}
	
}
