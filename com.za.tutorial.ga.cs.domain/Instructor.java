package com.za.tutorial.ga.cs.domain;

public class Instructor {
	private String id;
	private String name;
	public Instructor(String id, String name) {
		this.name=name;
		this.id=id;
	}
	public String getId() { return id; }
	public String getName() { return name; }
	public String toString() { return name; }
}
