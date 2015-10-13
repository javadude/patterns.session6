package com.javadude.visitor;

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
	protected void acceptChildren(EmployeeVisitor visitor) {
		minions.stream()
			.forEach(minion -> minion.accept(visitor));
	}
	public void accept(EmployeeVisitor visitor) {
		visitor.visit(this);
		acceptChildren(visitor);
	}
}
