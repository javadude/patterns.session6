package com.javadude.visitor;

public class CEO extends CompositeEmployee {
	public CEO(String name) {
		super(name);
	}
	public void accept(EmployeeVisitor visitor) {
		visitor.visit(this);
		acceptChildren(visitor);
	}
}
