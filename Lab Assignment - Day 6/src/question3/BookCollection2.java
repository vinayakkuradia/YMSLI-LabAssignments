package question3;
//Without using collection
public class BookCollection2 {
	public static int collectionLimit = 30;
	private String ownerName;
	private Book [] bookArray= new Book[collectionLimit];
	private int counter=-1;
	
	BookCollection2(String ownerName) {
		this.ownerName = ownerName;
	}
	
	BookCollection2(String ownerName, Book [] inputBookArray) {
		this.ownerName = ownerName;
		if(inputBookArray.length<=collectionLimit) {
			for (int i=0; i<inputBookArray.length; i++) {
				bookArray[++counter] = inputBookArray[i];
			}
		}
				
	}
	
	public void addBook(Book book) {
		if(counter<collectionLimit-1)
			bookArray[counter] = book;
	}
	
	public void addBooks(Book [] inputBookArray) {
		if(inputBookArray.length+counter<=collectionLimit) {
			for (int i=0; i<bookArray.length; i++) {
				bookArray[++counter] = inputBookArray[i];
			}
		}
	}
	
	public boolean hasBook(Book book) {
		for(int i=0; i<counter; i++) {
			if(bookArray[i].author.equals(book.author) && bookArray[i].title.equals(book.title))
				return true;
		}
		return false;
	}
	
	public void sort() {
		
	}

	@Override
	public String toString() {
		StringBuilder outputStrBuilder=new StringBuilder();
		outputStrBuilder.append("Owner: "+ownerName +"\nCollection:\n");
		for(int i=0; i<=counter; i++) {
				outputStrBuilder.append(bookArray[i]);
				if(i+1<=counter)
					outputStrBuilder.append(",\n");
		}
		return outputStrBuilder.toString();
	}
	
}
