package oops;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cs1 = new Customer(001, "Vinayak Kuradia", 'M');
		System.out.println(cs1.getID()+ " " +  cs1.getName()+ " " + cs1.getGender());
	}

}
