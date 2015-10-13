package com.javadude.composite;

public class Manager extends CompositeEmployee {

	public Manager(String name) {
		super(name);
	}
	
	@Override
	public String writeReport(String indent) {
		return indent + getName() + " managing stuff\n" +
				super.writeReport(indent);
	}
}
