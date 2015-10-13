package com.javadude.composite.overload;

public class CEO extends CompositeEmployee {
	public CEO(String name) {
		super(name);
	}
	public void testOverload(Tester tester) {
		tester.foo(this);
	}
}
