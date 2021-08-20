package sessionserial.parallelprocessing;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> intArray = new ArrayList<>();
		intArray.add(55); intArray.add(4); intArray.add(32); intArray.add(21);
		intArray.add(27); intArray.add(14); intArray.add(23); intArray.add(38);
		
		intArray.stream()
		.parallel();

	}

}
