package com.javadude.visitor.multiple.methods;

public class Worker extends Employee {

	public Worker(String name) {
		super(name);
	}

	public void accept(EmployeeVisitor visitor) {
		visitor.preVisit(this);
		visitor.visit(this);
		visitor.postVisit(this);
	}
}
