package assignment2.question2;
import java.util.Scanner;

public class BoosStoreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookStore bs1 = new BookStore();
		bs1.display();
		bs1.order("ISBN1", 5, sc);
		bs1.display();
		bs1.sell("Title", 2);
		bs1.display();
		bs1.order("ISBN1", 5, sc);
		bs1.display();
		sc.close();
	}

}
