package assignment1.question1;

public class Fibonacci {

	public static void main(String[] args) {
	int limit=20, c=1, p1=1, p2=0;
	float sum=0;
	System.out.println("The first "+limit+" Fibonacci numbers are: ");
	for(int i=0; i<limit; i++) {
		System.out.print(c+" ");
		sum = sum +c;
		c = p1+p2;
		p2 = p1;
		p1 = c;
	}
	System.out.println("\nThe average is "+(sum/limit));
	}

}
