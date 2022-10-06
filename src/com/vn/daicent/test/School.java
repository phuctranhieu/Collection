package com.vn.daicent.test;

public class School {
	private int idSchool;
	private String nameSchool;
	
	
	public School(int idSchool, String nameSchool) {
		super();
		this.idSchool = idSchool;
		this.nameSchool = nameSchool;
	}
	public int getIdSchool() {
		return idSchool;
	}
	public void setIdSchool(int idSchool) {
		this.idSchool = idSchool;
	}
	public String getNameSchool() {
		return nameSchool;
	}
	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() != this.getClass()) {
			return false;
		}
		School sl = (School) obj;
		return this.idSchool == sl.idSchool && this.nameSchool == sl.nameSchool;
	}
	@Override
	public int hashCode() {
		return nameSchool.hashCode();
	}

	@Override
	public String toString() {
		return "idSchool=" + idSchool + " " + "nameSchool=" + nameSchool + "\n";
	}
}
