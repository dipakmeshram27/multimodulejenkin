package com.jbk.domain;

public class Employeepojo {
	int age;
	String loc;
	public Employeepojo(int age, String loc) {
		super();
		this.age = age;
		this.loc = loc;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Employeepojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", loc=" + loc + "]";
	}
	
	
}
