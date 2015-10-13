package com.javadude.visitor.multiple.methods;

public class ConcreteVisitor implements EmployeeVisitor {
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
	
	// do nothing...
	@Override public void preVisit(Manager manager) { }
	@Override public void postVisit(Manager manager) { }
	@Override public void preVisit(VP vp) { }
	@Override public void postVisit(VP vp) { }
	@Override public void preVisit(CEO ceo) { }
	@Override public void postVisit(CEO ceo) { }
	@Override public void preVisit(Worker worker) { }
	@Override public void postVisit(Worker worker) { }
}
