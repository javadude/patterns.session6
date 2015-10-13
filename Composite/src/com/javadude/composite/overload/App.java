package com.javadude.composite.overload;

public class App {
	public static void main(String[] args) {
		CompositeEmployee ceo = 
			new CEO("Stevo")
				.add(new VP("Mike")
					.add(new Manager("The Cat")
						.add(new Worker("Thing 1"))
						.add(new Worker("Thing 2"))
						.add(new Worker("Thing 3"))
					)
					.add(new Manager("Melissa")
						.add(new Worker("The Beeb"))
						.add(new Worker("The Beav"))
					)
				)
				.add(new VP("Sue")
					.add(new Manager("Martin")
						.add(new Worker("Charlie"))
						.add(new Worker("Emilio"))
					)
					.add(new Manager("The Mouse")
						.add(new Worker("Britney"))
						.add(new Worker("Justin"))
						.add(new Worker("Annette"))
					)
				);
		
		ReportProcessor reportProcessor = new ReportProcessor();
		ceo.useProcessor(reportProcessor);
		System.out.println(reportProcessor.getReport());
	}
}
