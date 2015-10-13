package com.javadude.visitor.multiple.methods;

public class VP extends CompositeEmployee {
	public VP(String name) {
		super(name);
	}
	public void accept(EmployeeVisitor visitor) {
		visitor.preVisit(this);
		visitor.visit(this);
		acceptChildren(visitor);
		visitor.postVisit(this);
	}
}
