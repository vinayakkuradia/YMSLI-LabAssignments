package sorting;

public class MergeSort {
	public static int a = 6;

	public static void merge(int [] A, int p, int q, int r)
	 {
	 	//Calculating size of temporary arrays
	 	
		 int n1 = q-p+1, n2 = r-q;  
		 
	 	//Creating two temporary arrays
	 	
		int [] L = new int [n1+1]; int [] R = new int[n2+1];
	 	
	 	//Copying the contents of original array into two different arrays
	 	
	 	for(int i=0; i<n1; i++)
	 	{
	 		L[i] = A[p+i];
		 }
		 
		 for(int j=0; j<n2; j++)
	 	{
	 		R[j] = A[q+j+1];
		 }
		 
		System.out.print("\nL : ");
		for(int i=0; i<n1; i++)
		{
			System.out.print(L[i]+" ");
		}
		System.out.print(" R : ");
		
		for(int i=0; i<n2; i++)
		{
			System.out.print(R[i]+" ");
		}
		System.out.println(); 
		 
		 //Assigning largest number te end of each temporary array
		 
		 L[n1] = 3647; R[n2] = 3647;
	 	
		int i=0, j=0, k=0;
		
		
		for(k=p; k<=r; k++)
		{
			if(L[i]<R[j])
			 {
				A[k] = L[i];
				i++;
			 }
			 
			else
			 {
				A[k] = R[j];
				j++;
			 }
			}
		
			System.out.println("Current array is: ");
			for(int l=0; l<a+1; l++)
			{
				System.out.print(A[l]+" ");
			}
			System.out.println();
	 }
	 
	public static void mergesort(int A[], int p, int r)
	 {
	 	if(p<r)
	 	{
	 		int q = (p + r) / 2;
	 		mergesort(A, p, q);
	 		mergesort(A, q+1, r);
	 		merge(A, p, q, r);
		 }
	 }
	
	public static void main(String args []) {
		int data[]= {5, 2, 4, 3, 8, 7, 9};
	 	System.out.println("The initial array is: ");
		for(int i=0; i<a+1; i++)
		{
			System.out.print(data[i]+ " ");
		}
		System.out.println();
		
	 	mergesort(data, 0, a);
	 	
	 	System.out.println(); 	
	 	System.out.println("The sorted array is: ");
	 	for(int i=0; i<a+1; i++)
		{
			System.out.print(data[i]+" ");
		}
	 	System.out.println();
	}
}
