package com.javadude.visitor.multiple.methods;

public class CEO extends CompositeEmployee {
	public CEO(String name) {
		super(name);
	}
	public void accept(EmployeeVisitor visitor) {
		visitor.preVisit(this);
		visitor.visit(this);
		acceptChildren(visitor);
		visitor.postVisit(this);
	}
}
