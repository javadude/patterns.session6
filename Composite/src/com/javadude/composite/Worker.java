package com.javadude.composite;

public class Worker extends Employee {

	public Worker(String name) {
		super(name);
	}

	@Override
	public String writeReport(String indent) {
		return indent + getName() + ": real data stuff and stuff";
	}
}
