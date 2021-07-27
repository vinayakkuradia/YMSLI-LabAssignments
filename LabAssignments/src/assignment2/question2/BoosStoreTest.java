package assignment2.question2;

public class BoosStoreTest {

	public static void main(String[] args) {
		BookStore bs1 = new BookStore();
		bs1.display();
		bs1.order("ISBN1", 5);
		bs1.display();
		bs1.sell("Title", 2);
		bs1.display();
		bs1.order("ISBN1", 5);
		bs1.display();
	}

}
