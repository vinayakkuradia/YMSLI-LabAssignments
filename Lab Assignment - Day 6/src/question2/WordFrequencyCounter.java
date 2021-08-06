package question2;

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class WordFrequencyCounter {

	
	public static Map <String, Integer>  countWordFrequency(String filename) {
		Map <String, Integer> wordMap = new HashMap <>(); 
		try {
			Scanner scannerObj = new Scanner(new File(filename));
			while(scannerObj.hasNext()) {
				String tempStore = scannerObj.next();
				Integer value = wordMap.get(tempStore);
				if(value!=null)
					wordMap.put(tempStore, ++value);
				else
					wordMap.put(tempStore, 1);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Exception occurred: "+e.getMessage());
		}
		return wordMap;
	}
	
	public static void printHashMap(Map <String, Integer> hashMap) {
		for(String key: hashMap.keySet())
			System.out.println(hashMap.get(key)+": "+key);
	}
	
	public static void main(String [] args) {
		Map <String, Integer> wordMap = countWordFrequency("story.txt");
		printHashMap(wordMap);
	}
}
