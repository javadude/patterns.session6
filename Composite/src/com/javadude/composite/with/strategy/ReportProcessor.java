package com.javadude.composite.with.strategy;

public class ReportProcessor implements EmployeeProcessor {
	private String report = "";
	@Override
	public void process(Employee employee) {
		report += employee.getName() + ": ";
		
		if (employee.getClass() == CEO.class) {
			report += "telling people \"you're holding it wrong\"";
		} else if (employee.getClass() == VP.class) {
			report += "vicing";
		} else if (employee.getClass() == Manager.class) {
			report += "managing";
		} else if (employee.getClass() == Worker.class) {
			report += "doing the actual work";
		}
		report += "\n";
	}
	public String getReport() {
		return report;
	}
}
