package question1;

public class Merchandise {
	private String itemCode;
	String getItemCode() {
		return itemCode;
	}

	void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	int getQuantity() {
		return quantity;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	float getUnitPrice() {
		return unitPrice;
	}

	void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	private int quantity;
	private float unitPrice;
	
	public Merchandise(String itemCode, int quantity, float unitPrice) {
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public void displayDetails() {
		System.out.println("Item Code: "+itemCode+", Quantity: "+quantity+", Unit Price: "+unitPrice);
	}
	
	
}
