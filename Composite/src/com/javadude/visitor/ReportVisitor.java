package com.javadude.visitor;

public class ReportVisitor implements EmployeeVisitor {
	private String report = "";

	@Override
	public void visit(Employee employee) {
		// should never be called; abstract class
	}

	@Override
	public void visit(CompositeEmployee employee) {
		// should never be called; abstract class
	}

	@Override
	public void visit(Manager manager) {
		report += manager.getName() + ": managing\n";
	}

	@Override
	public void visit(VP vp) {
		report += vp.getName() + ": vicing\n";
	}

	@Override
	public void visit(CEO ceo) {
		report += ceo.getName() + ": telling people \"you're holding it wrong\"\n";
	}

	@Override
	public void visit(Worker worker) {
		report += worker.getName() + ": doing the actual work\n";
	}

	public String getReport() {
		return report;
	}
}
