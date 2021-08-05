package question1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


class NameComparatator implements Comparator<Merchandise> {

	@Override
	public int compare(Merchandise o1, Merchandise o2) {
		return o1.getItemCode().compareTo(o2.getItemCode());
	}

}

class PriceComparatator implements Comparator<Merchandise> {

	@Override
	public int compare(Merchandise o1, Merchandise o2) {
		return (int) (o2.getUnitPrice() - o1.getUnitPrice());
	}

}


public class MerchandiseInventoryTest {
	
	static ArrayList<Merchandise> merchandiseList = new ArrayList<Merchandise>(11);
	static int counter = -1;
	
	public static String [] readAndLoadFile(String fileName) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
			String line = null;

			while ((line = bufferedReader.readLine()) != null) {
				String [] stringParts = line.split(" ");
				merchandiseList.add(new Merchandise(stringParts[0], Integer.parseInt(stringParts[1]), Float.parseFloat(stringParts[2])));
			}
		} 
		
		catch (IOException e) {
			System.out.println("Excption occured: " + e.getMessage());
		}catch (Exception exc) {
			System.out.println("Excption occured: " + exc.getMessage());
		}

		return null;
	}
	
	public static void displayAll() {
		for(Merchandise m: merchandiseList) {
			m.displayDetails();
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {

		readAndLoadFile("input.dat");
		Collections.sort(merchandiseList, new NameComparatator());	
		displayAll();
		Collections.sort(merchandiseList, new PriceComparatator());
		displayAll();
	}

}
