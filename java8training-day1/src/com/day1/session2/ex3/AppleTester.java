package com.day1.session2.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class AppleTester {

		
		public static void main(String[] args) {

		List<Apple> apples = Arrays.asList(new Apple("red", 400), new Apple(
				"green", 300), new Apple("green", 200), new Apple("red", 250));
		
		//Most imp functional interface in java 8
		
		//Predicate	
			Predicate<Apple> isRed = a->a.getColor()=="red";
		//BiPredicate
			BiPredicate<Apple, Apple> comparableWeight = (a1, a2)->{int d = a1.getWeight()-a2.getWeight();  return (( d>0 ? d:-d)<= 100);};
		//Function
			Function<Apple, Integer> appleWeight = Apple::getWeight;
		//Consumer
			Consumer<Apple> displayColor = a->System.out.println(a.getColor());
		//biConsumer
			BiConsumer<Apple, Apple> printHeavierAppleWeight = (a1, a2) -> System.out.println(a1.getWeight()>a2.getWeight() ? a1.getWeight():a2.getWeight());; 	
		//Supplier
			Supplier<Integer> randomNumberGenerator = ()->{Random r=new Random(); return r.nextInt(1000);};
		//BiFunction
			BiFunction<Apple, Apple, Integer> addAppleWeight = (a1, a2)->a1.getWeight()+a2.getWeight();
		
		
		
	}
}

















