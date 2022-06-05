package com.demo;

public class Officer {
	int id;
	String name;
	int salary;
	String grade;



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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Officer(int id, String name, int salary, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Officer [id=" + id + ", name=" + name + ", salary=" + salary + ", grade=" + grade + "]";
	}

}
