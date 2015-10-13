package com.javadude.visitor.multiple.methods;

public interface EmployeeVisitor {
	void preVisit(Manager manager);
	void visit(Manager manager);
	void postVisit(Manager manager);
	void preVisit(VP vp);
	void visit(VP vp);
	void postVisit(VP vp);
	void preVisit(CEO ceo);
	void visit(CEO ceo);
	void postVisit(CEO ceo);
	void preVisit(Worker worker);
	void visit(Worker worker);
	void postVisit(Worker worker);
}
