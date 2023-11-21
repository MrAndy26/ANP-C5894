package com.anudip5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


   @Entity
   @Table(name="student_details")
	public class Student
	{
	   
	   @Id
	   private int id;
	   
	   @Column(name="stuname")
	   private String name;
	   
	   @Column(name="stumarks")
	   private int marks;
	   
	   
	   public Student(int id, String name, int marks) {
			super();
			this.id = id;
			this.name = name;
			this.marks = marks;
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		
		return this.id+": "+this.name+": "+this.marks;
	}
    
}


