package com.javadude.visitor;

public interface EmployeeVisitor {
	void visit(Employee employee);
	void visit(CompositeEmployee employee);
	void visit(Manager manager);
	void visit(VP vp);
	void visit(CEO ceo);
	void visit(Worker worker);
}
