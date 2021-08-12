package java8.optional;

import java.util.*;

public class UseOfOptional {
	
	public static void main(String[] args) {
		Optional<String> optObj = Optional.ofNullable("This is a string");
		Optional<String> optObj1 = Optional.ofNullable(null);
		System.out.println(optObj.orElse("Not found"));
		System.out.println(optObj1.orElse("Not found"));
		
		List<Integer> intList = new ArrayList<>();
		intList.add(52);
		intList.add(456);
		intList.add(25);
		intList.add(825);
		intList.add(135);
		Optional<Integer> intOptObj = intList.stream().max((i1, i2)->i1.compareTo(i2));
		System.out.println(intOptObj.orElse(0));
	}

}
