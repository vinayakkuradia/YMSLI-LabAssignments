package assignment3.question3;

public class Invoice implements Payable {
	int quantity;
	double pricePerItem;
	String partNum, partDescription;
	
	public double getPayment() {
		System.out.println("Part No.: "+partNum+", Part Description: "+partDescription+"\nQuantity: "+quantity+", Price (Per Item): "+pricePerItem+"\nTotal Payment: "+quantity*pricePerItem);
		return quantity*pricePerItem;
	}
	
	int getQuantity() {
		return quantity;
	}
	
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	double getPricePerItem() {
		return pricePerItem;
	}
	
	void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	String getPartNum() {
		return partNum;
	}
	
	void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	
	String getPartDescription() {
		return partDescription;
	}
	
	void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	@Override
	public String toString() {
		return "Invoice [quantity=" + quantity + ", pricePerItem=" + pricePerItem + ", partNum=" + partNum
				+ ", partDescription=" + partDescription + "]";
	}
	
}
