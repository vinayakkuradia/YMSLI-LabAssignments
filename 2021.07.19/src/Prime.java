
public class Prime {

	public static boolean PrimeCheck(int n) {
		if (n==1)
			return true;
		else {
			boolean flag=true;
			for (int i=2; i<=(int)(n/2); i++) {
				if (n%i==0) {
					flag = false;
					break;
				}
			}
			return flag;
		}
	}
	
	public static void PrintPrime(int n) {
		int count=0;
		
		for (int i=1; i<100000; i++) {
			if (PrimeCheck(i)) {
				count++;
				System.out.print(i+", ");
			}
			if (count>=n) {
				System.out.println();
				break;	
			}
		}
	}
	
	public static void PrintPrimeBW(int n1, int n2) {		
		for (int i=n1; i<=n2; i++) {
			if (PrimeCheck(i)) {
				System.out.print(i+", ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		PrintPrime(5);
		PrintPrimeBW(3, 21);
	}

}
