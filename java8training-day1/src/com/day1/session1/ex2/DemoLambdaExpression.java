package com.day1.session1.ex2;

public class DemoLambdaExpression {
	/*
	 * Lambda expession vs ann inner class refectoring example => ann inner class==>
	 * lambda expression
	 */

	@FunctionalInterface
	interface Greeter {
		void greet();

		static void greetWithMsg(String msg) {
			System.out.println(msg);
		};
	}

	public static void main(String[] args) {

		// Anonymous Class
		Greeter englishGreeter = new Greeter() {

			@Override
			public void greet() {
				Greeter.greetWithMsg("Hello Sir");
			}

		};

		englishGreeter.greet();

		// Lambda Expression
		Greeter spanishGreeter = () -> System.out.println("Hola señor!");
		spanishGreeter.greet();
		
		Greeter frenchGreeter = () -> Greeter.greetWithMsg("Bonjour Monsieur");
		frenchGreeter.greet();
				//"Bonjour Monsieur"
	}
}
