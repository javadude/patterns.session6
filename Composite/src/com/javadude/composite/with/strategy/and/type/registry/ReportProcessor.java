package com.javadude.composite.with.strategy.and.type.registry;

import java.util.HashMap;
import java.util.Map;

public class ReportProcessor implements EmployeeProcessor {
	public interface Handler {
		String handle(Employee employee);
	}
	private static Map<Class<?>, Handler> registry = new HashMap<>();
	public static void register(Class<?> clazz, Handler handler) {
		registry.put(clazz, handler);
	}
	
	static {
		registry.put(CEO.class,     employee -> "telling people \"you're holding it wrong\"");
		registry.put(VP.class,      employee -> "vicing");
		registry.put(Manager.class, employee -> "managing");
		registry.put(Worker.class,  employee -> "doing the actual work");
		// could register new types from outside this class!
	}
	
	private String report = "";
	private String indent = "";

	@Override
	public void preProcess(Employee employee) {
		report += indent + employee.getName() + ": ";
		Handler handler = registry.get(employee.getClass());
		report += handler.handle(employee) + "\n";
	}
	public String getReport() {
		return report;
	}
	@Override
	public void process(Employee employee) {
		indent += "  ";
	}
	@Override
	public void postProcess(Employee employee) {
		indent = indent.substring(2);
	}
}
