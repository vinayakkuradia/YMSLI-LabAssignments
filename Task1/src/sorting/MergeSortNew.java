package sorting;

public class MergeSortNew {

	public static void merge(int[]inputArray, int initialIndex, int midIndex, int finalIndex) {
		// Calculating size of temporary arrays
		int tempIndex1=midIndex-initialIndex+1, tempIndex2=finalIndex-midIndex;

		// Creating two temporary arrays
		int [] L = new int[tempIndex1 + 1], R = new int[tempIndex2 + 1];

		// Copying the contents of original array into two different arrays
		for (int i = 0; i < tempIndex1; i++)
			L[i] =inputArray[initialIndex+i];

		for (int j = 0; j < tempIndex2; j++)
			R[j] = inputArray[midIndex+j+1];

		System.out.print("L : ");
		printArray(L, tempIndex1 - 1);
		System.out.print("R : ");
		printArray(R, tempIndex2 - 1);

		// Assigning largest number to the end of each temporary array
		L[tempIndex1] = 3647; R[tempIndex2] = 3647;

		int i = 0, j = 0, k = 0;

		for (k = initialIndex; k <= finalIndex; k++) {
			if (L[i] < R[j])
				inputArray[k] = L[i++];
			else
				inputArray[k] = R[j++];
		}

		System.out.println("Current array is: ");
		printArray(inputArray);
		System.out.println();
	}

	public static void mergesort(int inputArray[], int initialIndex, int finalIndex) {
		if (initialIndex<finalIndex) {
			int midIndex=(initialIndex+finalIndex)/2;
			mergesort(inputArray, initialIndex, midIndex);
			mergesort(inputArray, midIndex+1, finalIndex);
			merge(inputArray, initialIndex, midIndex, finalIndex);
		}
	}

	public static void printArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]);
			if (i + 1 < inputArray.length)
				System.out.print(", ");
			else
				System.out.println();
		}
	}

	public static void printArray(int[] inputArray, int endingIndex) {
		if (!(endingIndex + 1 > inputArray.length))
			for (int i = 0; i <= endingIndex; i++) {
				System.out.print(inputArray[i]);
				if (i + 1 <= endingIndex)
					System.out.print(", ");
				else
					System.out.println();
			}
		else
			System.out.println("Array index out of bound!");
	}

	public static void printArray(int[] inputArray, int beginingIndex, int endingIndex) {
		if (!(endingIndex + 1 > inputArray.length) && (beginingIndex > 0) && beginingIndex <= endingIndex)
			for (int i = beginingIndex; i <= endingIndex; i++) {
				System.out.print(inputArray[i]);
				if (i + 1 <= endingIndex)
					System.out.print(", ");
				else
					System.out.println();
			}
		else
			System.out.println("Array index out of bound!");
	}

	public static void main(String args[]) {
		int[] inputArray = { 5, 2, 4, 3, 8, 7, 9 };
		System.out.println("The initial array is: ");
		printArray(inputArray);
		mergesort(inputArray, 0, inputArray.length-1);
		System.out.println("The sorted array is: ");
		printArray(inputArray);
	}
}
