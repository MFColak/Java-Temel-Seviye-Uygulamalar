import java.util.*;
public class SortedSet {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Istanbul");
		ts.add("Adana");
		ts.add("Ankara");
		ts.add("Izmir");
		ts.add("Sivas");
		//ts.add(1);
		Iterator i=ts.iterator();
		while (i.hasNext()) {
			System.out.println("Eleman="+i.next());
		}
		System.out.println(ts.size());
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet("Izmir"));
		System.out.println(ts.tailSet("Izmir"));
		System.out.println(ts.descendingSet());
		System.out.println(ts);
		
	}
}
