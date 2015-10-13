package com.javadude.composite.with.strategy.and.type.registry;

public interface EmployeeProcessor {
	void preProcess(Employee employee);
	void process(Employee employee);
	void postProcess(Employee employee);
}
