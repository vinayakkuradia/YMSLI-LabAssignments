package com.day1.session1.ex1;

public class DemoFuncationalInterface {

// Functional Interface: Interfaces having only single abstract method, and having zero or more defaults methods
	
	@FunctionalInterface	//Annotation for Functional Interface
	interface functionalInterfaceImpl {
		void singleAbstractMethod();
		
		// Optional
		default void defaultMethod() {
			System.out.println("I am an optional default method");
		}
	}
	
	
// Diamond Problem
	
		/*			A
				/		\
			B				C
		  		\		/
		  			D
		*/
	interface  A {
		default void methodOfConflict() {
			System.out.println("Method of A");
		};
	}
	
	interface  B extends A {
		default void methodOfConflict() {
			System.out.println("Method of B");
		};
	}
	
	interface  C extends A {
		default void methodOfConflict() {
			System.out.println("Method of C");
		};
	}
	
	interface  D extends B, C {
		//If below method is not overridden, It will give error 
		@Override
		default void methodOfConflict() {
			System.out.println("Method of D");
		};
	}
	
// Interface Evolution
	
	interface EvolvedInterface {
		// Abstract method from beginning
		void oldMethod();
		
		// Newly added method
		default void newMethod() {
			System.out.println("Defined here to fill gap between old and new class implementation");
		}
		
	}
	
	class previousClassUsingInterface implements EvolvedInterface {

		@Override
		public void oldMethod() {
			System.out.println("oldMethod() implemented");
		}
		
	}
	
	class newClassNeedingNewMethod implements EvolvedInterface {

		@Override
		public void oldMethod() {
			System.out.println("oldMethod() implemented");
		}
		
		@Override
		public void newMethod() {
			System.out.println("Free to implement new method");
		}
	}
	
	public static void main(String[] args) {
		
		//What is functional interface?
		
		/*
		 * What is functional interface?
		 * @FunctionalInterface
		 * Interface and diamond problem and solution
		 * Interface evolution: default method , static method examples
		 */
		
	}
}
