package question3;
import java.util.*;

public class LexicographicalComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.title.equals(o2.title)) 
			return o1.author.compareTo(o2.author);
		else
			return o1.title.compareTo(o2.title);
	}



}
