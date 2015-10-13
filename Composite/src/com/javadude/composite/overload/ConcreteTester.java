package com.javadude.composite.overload;

public class ConcreteTester implements Tester {
	public void foo(Employee employee) {
		System.out.println("Employee called");
	}
	public void foo(CompositeEmployee employee) {
		System.out.println("Composite Employee called");
	}
	public void foo(Manager manager) {
		System.out.println("Manager called");
	}
	public void foo(VP vp) {
		System.out.println("VP called");
	}
	public void foo(CEO ceo) {
		System.out.println("CEO called");
	}
	public void foo(Worker worker) {
		System.out.println("Worker called");
	}
}
