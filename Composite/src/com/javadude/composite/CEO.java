package com.javadude.composite;

public class CEO extends CompositeEmployee {
	public CEO(String name) {
		super(name);
	}
	
	@Override
	public String writeReport(String indent) {
		return indent + getName() + " telling people 'You're Holding it Wrong'\n" +
				super.writeReport(indent);
	}
}
