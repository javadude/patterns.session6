package com.javadude.visitor;

public class Manager extends CompositeEmployee {

	public Manager(String name) {
		super(name);
	}
	public void accept(EmployeeVisitor visitor) {
		visitor.visit(this);
	}
}
