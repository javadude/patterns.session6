package com.javadude.composite;

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
	public String writeReport(String indent) {
		return minions.stream()
				.map(minion -> minion.writeReport(indent + "  "))
				.reduce((soFar, myReport) -> soFar += "\n" + myReport)
				.orElse(indent + "(no minions)");

// NON-STREAM EQUIVALENT:
//		if (minions.isEmpty())
//			return indent + "(no minions)";
//		String report = "";
//		for (Employee minion : minions) {
//			report += minion.writeReport(indent + "  ") + "\n";
//		}
//		return report;
	}
}
