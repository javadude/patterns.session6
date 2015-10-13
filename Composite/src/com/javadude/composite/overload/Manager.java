package com.javadude.composite.overload;

public class Manager extends CompositeEmployee {

	public Manager(String name) {
		super(name);
	}
	public void testOverload(Tester tester) {
		tester.foo(this);
	}
}
