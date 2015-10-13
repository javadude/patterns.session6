package com.javadude.visitor.multiple.methods;

public class Manager extends CompositeEmployee {

	public Manager(String name) {
		super(name);
	}
	public void accept(EmployeeVisitor visitor) {
		visitor.preVisit(this);
		visitor.visit(this);
		acceptChildren(visitor);
		visitor.postVisit(this);
	}
}
