package com.javadude.composite.overload;

public class Worker extends Employee {

	public Worker(String name) {
		super(name);
	}

	@Override
	public void useProcessor(EmployeeProcessor processor) {
		processor.process(this);
	}
}
