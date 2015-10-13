package com.javadude.visitor;

public class VP extends CompositeEmployee {
	public VP(String name) {
		super(name);
	}
	public void accept(EmployeeVisitor visitor) {
		visitor.visit(this);
		acceptChildren(visitor);
	}
}
