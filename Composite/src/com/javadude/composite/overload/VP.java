package com.javadude.composite.overload;

public class VP extends CompositeEmployee {
	public VP(String name) {
		super(name);
	}
	public void testOverload() {
		OverloadTest.foo(this);
	}
}
