package com.javadude.visitor;

public class Worker extends Employee {

	public Worker(String name) {
		super(name);
	}

	@Override
	public void useProcessor(EmployeeProcessor processor) {
		processor.process(this);
	}
	public void accept(EmployeeVisitor visitor) {
		visitor.visit(this);
	}
}
