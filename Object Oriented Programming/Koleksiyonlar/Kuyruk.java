import java.util.LinkedList;

public class Kuyruk {
	private LinkedList list=new LinkedList();
	
	public void ekle(Object item) {
		list.addLast(item);
	}
	
	public Object cikar() {
		return list.removeFirst();
	}
	public Object ilkItem() {
		return list.getFirst();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
