package com.javadude.composite.overload;

public class OverloadTest {

	public static void foo(Employee employee) {
		System.out.println("Employee called");
	}
	public static void foo(CompositeEmployee employee) {
		System.out.println("Composite Employee called");
	}
	public static void foo(Manager manager) {
		System.out.println("Manager called");
	}
	public static void foo(VP vp) {
		System.out.println("VP called");
	}
	public static void foo(CEO ceo) {
		System.out.println("CEO called");
	}
	public static void foo(Worker worker) {
		System.out.println("Worker called");
	}

	public static void main(String[] args) {
		new Worker("Scott").testOverload();
		new VP("Scott").testOverload();
		new Manager("Scott").testOverload();
		new CEO("Scott").testOverload();
	}
}
