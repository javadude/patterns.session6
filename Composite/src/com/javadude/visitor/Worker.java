package com.javadude.visitor;

public class Worker extends Employee {

	public Worker(String name) {
		super(name);
	}

	public void accept(EmployeeVisitor visitor) {
		visitor.visit(this);
	}
}
