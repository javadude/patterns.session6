package com.javadude.composite.overload;

public class OverloadTest {
	public static void main(String[] args) {
		Tester tester = new ConcreteTester();
		new Worker("Scott").testOverload(tester);
		new VP("Scott").testOverload(tester);
		new Manager("Scott").testOverload(tester);
		new CEO("Scott").testOverload(tester);
	}
}
