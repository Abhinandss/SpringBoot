package com.exampleSpring.RestApi;

import javax.persistence.Entity;

@Entity
public class Course {
private int rnum;
private String name;
private String dept;
public int getRnum() {
	return rnum;
}
public void setRnum(int rnum) {
	this.rnum = rnum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public Course(int rnum, String name, String dept) {
	super();
	this.rnum = rnum;
	this.name = name;
	this.dept = dept;
}
@Override
public String toString() {
	return "Course [rnum=" + rnum + ", name=" + name + ", dept=" + dept + "]";
}



}
