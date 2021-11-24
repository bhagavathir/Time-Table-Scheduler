package com.za.tutorial.ga.cs.domain;
import java.util.ArrayList;
public class Course {
	private String number = null;
	private String name =null;
	private int maxNumbOfStudents;
	private ArrayList<Instructor> instructors;
	public Course(String number, String name, ArrayList<Instructor> instructors, int maxNumbOfStudents) {
		this.number=number;
		this.name=name;
		this.instructors=instructors;
		this.maxNumbOfStudents=maxNumbOfStudents;
	}
	public String getNumber() { return number;}
	public String getName() { return name;}
	public ArrayList<Instructor> getInstructors(){ return instructors;}
	public int getMaxNumbOfStudents() { return maxNumbOfStudents;}
	public String toString() { return name; }
}
