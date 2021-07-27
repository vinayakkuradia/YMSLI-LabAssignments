package my.day3.session1;

class Box2D {
	private int l, b;
	public Box2D(int l, int b) {
		this.l = l;
		this.b = b;
	}
	
	public int getL() {
		return l;
	}

	public int getB() {
		return b;
	}

	public void printBox() {
		System.out.println("l: "+this.getL()+" b: "+this.getB());
	}
}

 class Box3D extends Box2D {
	private int h;
	public Box3D(int l, int b, int h) {
		super(l, b);
		this.h = h;			
	}
	
	public int getH() {
		return h;
	}

	public void printBox() {
		System.out.println("l: "+this.getL()+" b: "+this.getB()+ " h: "+this.getH());
	}
}

 class Box3DWithColor extends Box3D {
	private String color;
	public Box3DWithColor(int l, int b, int h, String color) {
		super(l, b, h);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void printBox() {
		System.out.println("l: "+this.getL()+" b: "+this.getB()+ " h: "+this.getH()+ " color: "+ this.getColor());
	}
}

public class Boxes {
	
	public static void main(String[] args) {
		Box3DWithColor box = new Box3DWithColor(5, 6, 7, "Blue");
		box.printBox();
	}

}
