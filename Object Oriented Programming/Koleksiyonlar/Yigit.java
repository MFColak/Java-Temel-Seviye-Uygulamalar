import java.util.LinkedList;

public class Yigit {
	private LinkedList list=new LinkedList();
	
	public void ekle(Object item) {
		list.addFirst(item);
	}
	public Object cikar() {
		return list.removeFirst();
	}
	public Object ilkitem() {
		return list.getFirst();
		
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
