package com.javadude.visitor.multiple.methods;

public class VisitorTest {
	public static void main(String[] args) {
		EmployeeVisitor tester = new ConcreteVisitor();
		new Worker("Scott").accept(tester);
		new VP("Scott").accept(tester);
		new Manager("Scott").accept(tester);
		new CEO("Scott").accept(tester);
	}
}
