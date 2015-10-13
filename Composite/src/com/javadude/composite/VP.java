package com.javadude.composite;

public class VP extends CompositeEmployee {
	public VP(String name) {
		super(name);
	}
	
	@Override
	public String writeReport(String indent) {
		return indent + getName() + " vicing stuff\n" +
				super.writeReport(indent);
	}
}
