import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedSet {
	public static void main(String[] args) {
		LinkedHashSet lHSet=new LinkedHashSet();
		lHSet.add("Ahmet");
		lHSet.add("Mehmet");
		lHSet.add("Fatma");
		lHSet.add("Hasan");
		//lHSet.remove("Fatma");//Eleman silmek
		
		Iterator i=lHSet.iterator();
		while (i.hasNext()) {
			System.out.println("Eleman="+i.next());
		}	
	}
}
