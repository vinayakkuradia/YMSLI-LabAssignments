package stream.parallelism;

import java.util.Arrays;

public class Order {

	public static void main(String[] args) {
		Integer[] array = {40, 45, 86, 12, 5, 75, 63, 84};
//		Arrays.asList(array).stream().sorted().forEach(System.out::println);
//		System.out.println();
//		Arrays.asList(array).stream().parallel().sorted().forEach(System.out::println);
//		System.out.println();
//		Arrays.asList(array).stream().parallel().sorted().forEachOrdered(System.out::println);
//		System.out.println();
//		Arrays.asList(array).stream().parallel().filter(n->(n>30)).forEach(System.out::println);
		
		
		// Reducing using External Iteration - Accumulation or Mutable Accumulator Pattern
		Integer max=-1;
		for(Integer each: Arrays.asList(array)) {
			if(each>max) {
				max=each;
			}
		}
		System.out.println(max);
		
		// Reducing using Stream.reduce with parallel processing capabilities
		System.out.println(Arrays.asList(array).parallelStream().reduce(Integer::max).orElse(0));
		
		// Count
		System.out.println(Arrays.asList(array).parallelStream().map(d->1).reduce(0, (a,b)->a+b));
	
	
		
	}

}
