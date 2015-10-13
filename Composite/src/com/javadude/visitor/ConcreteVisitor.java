package com.javadude.visitor;

public class ConcreteVisitor implements EmployeeVisitor {
	public void visit(Employee employee) {
		System.out.println("Employee called");
	}
	public void visit(CompositeEmployee employee) {
		System.out.println("Composite Employee called");
	}
	public void visit(Manager manager) {
		System.out.println("Manager called");
	}
	public void visit(VP vp) {
		System.out.println("VP called");
	}
	public void visit(CEO ceo) {
		System.out.println("CEO called");
	}
	public void visit(Worker worker) {
		System.out.println("Worker called");
	}
}
