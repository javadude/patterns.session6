package com.javadude.visitor.multiple.methods;

public class ReportVisitor implements EmployeeVisitor {
	private String report = "";
	private String indent = "";

	@Override
	public void preVisit(Manager manager) {
		report += indent + manager.getName() + ": managing\n";
	}

	@Override
	public void preVisit(VP vp) {
		report += indent + vp.getName() + ": vicing\n";
	}

	@Override
	public void preVisit(CEO ceo) {
		report += indent + ceo.getName() + ": telling people \"you're holding it wrong\"\n";
	}

	@Override
	public void preVisit(Worker worker) {
		report += indent + worker.getName() + ": doing the actual work\n";
	}

	@Override
	public void visit(Manager manager) {
		indent += "  ";
	}

	@Override
	public void postVisit(Manager manager) {
		indent = indent.substring(2);
	}

	@Override
	public void visit(VP vp) {
		indent += "  ";
	}

	@Override
	public void postVisit(VP vp) {
		indent = indent.substring(2);
	}

	@Override
	public void visit(CEO ceo) {
		indent += "  ";
	}

	@Override
	public void postVisit(CEO ceo) {
		indent = indent.substring(2);
	}

	@Override
	public void visit(Worker worker) {
		indent += "  ";
	}

	@Override
	public void postVisit(Worker worker) {
		indent = indent.substring(2);
	}
	
	public String getReport() {
		return report;
	}
}
