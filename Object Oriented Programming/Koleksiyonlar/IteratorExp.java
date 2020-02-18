import java.util.HashSet;
import java.util.Iterator;

public class IteratorExp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> c=new HashSet<String>();
		c.add("a");c.add("abc");c.add("abcd sdff");
		Iterator<String> i=c.iterator();
		
		while (i.hasNext()) {
			System.out.println("New item="+ i.next());
			i.remove();
		}
	}
}
