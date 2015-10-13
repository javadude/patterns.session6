package com.javadude.composite.with.strategy.and.type.registry;

public class Worker extends Employee {

	public Worker(String name) {
		super(name);
	}

	@Override
	public void useProcessor(EmployeeProcessor processor) {
		processor.preProcess(this);
		processor.process(this);
		processor.postProcess(this);
	}
}
