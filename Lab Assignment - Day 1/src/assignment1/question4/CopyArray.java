package assignment1.question4;

public class CopyArray {

	public static void displayArray(int [] array) {
		System.out.println("The elements of array at address "+ array +" are: ");
		for(int i=0; i<array.length; i++) 
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
	public static int[] copyOf(int[] array) {
		int [] outputArray = new int[array.length];
		for(int i=0; i<array.length; i++) {
			outputArray[i] = array[i];
		}
		return outputArray;
	}
	
	public static void main(String[] args) {
		int [] array = {15, 20, 46, 47, 57, 89};
		displayArray(array);
		int [] arrayCopy = copyOf(array); 
		displayArray(arrayCopy);
	}

}
