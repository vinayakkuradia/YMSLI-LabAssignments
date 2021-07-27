package my.day3.session1;

class A {
	private int i;
	A(int i) {
		this.i=i;
	}
	public int getI() {
		return i;
	}
}

class B extends A {
	private int j;
	B(int i, int j) {
		super(i);
		this.j=j;
	}
	public int getJ() {
		return j;
	}
	
	
}


public class DemoInh {

	public static void main(String[] args) {
		B b = new B(3, 5);
		System.out.println("i: "+b.getJ());
	}

}
