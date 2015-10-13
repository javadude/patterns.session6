package com.javadude.composite.with.strategy.and.type.registry;

import java.util.ArrayList;
import java.util.List;

// Basic concept of a Composite Employee
// It's an employee that can have other employees as minions
// When asked to write a report, it delegates and combines
//   into a single string
public abstract class CompositeEmployee extends Employee {
	private List<Employee> minions = new ArrayList<>();
	
	public CompositeEmployee(String name) {
		super(name);
	}

	public List<Employee> getMinions() {
		return minions;
	}
	public CompositeEmployee add(Employee minion) {
		minions.add(minion);
		return this;
	}
	@Override
	public void useProcessor(EmployeeProcessor processor) {
		processor.preProcess(this);
		processor.process(this);
		minions.stream()
			.forEach(minion -> minion.useProcessor(processor));
		processor.postProcess(this);

// NON-STREAM EQUIVALENT:
//		processor.process(this);
//		for (Employee minion : minions) {
//			minion.useProcessor(processor);
//		}
	}
}
