package sessionserial.mapiterate;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteration {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<>();
		map.put("Java 8", 1.8); map.put("Java 5", 1.5); map.put("Java 7", 1.7); map.put("Java 6", 1.6);
		
		System.out.println("Keyset: "+ map.keySet());
		System.out.println("Values: " + map.values());
		System.out.println("EntrySet: "+ map.entrySet());
		
		map.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);
		
		map.entrySet().stream()
		.sorted(Entry.comparingByKey())
		.map(Entry::getKey)
		.forEach(System.out::println);
		
		map.entrySet().stream()
		.sorted(Entry.comparingByValue())
		.map(Entry::getValue)
		.forEach(System.out::println);
		
	}

}
