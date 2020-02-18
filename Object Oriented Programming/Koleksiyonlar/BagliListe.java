import java.util.*;
public class BagliListe {

	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.add(1);ls.add(2);
		ls.add(3);ls.add(24);
		System.out.println("Tüm Liste: "+ls);
		ls.addFirst(12);
		System.out.println(ls.getFirst());
		ListIterator i=ls.listIterator();
		while (i.hasNext()) {
			System.out.println("Eleman="+i.next());
		}	
	}
}
