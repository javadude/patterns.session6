package com.javadude.composite.overload;

public interface Tester {
	void foo(Employee employee);
	void foo(CompositeEmployee employee);
	void foo(Manager manager);
	void foo(VP vp);
	void foo(CEO ceo);
	void foo(Worker worker);
}
