package com.javadude.composite.with.strategy;

// Basic concept of an Employee - has a name and
//   can write a report
public abstract class Employee {
	private String name;

	public String getName() {
		return name;
	}

	public Employee(String name) {
		this.name = name;
	}
	
	public abstract void useProcessor(EmployeeProcessor processor);
}
