package queue;

public class LinkQueue {
	private FirstLastList theList;
	
	public LinkQueue() {
		theList = new FirstLastList();
	}
	
	public boolean isEmpty() {
		return theList.isEmpty();
	}
	
	public void insert(long i) {
		theList.insertLast(i);
	}
	
	public long remove() {
		return theList.deleteFirst();
	}
	
	public void displayQueue() {
		System.out.print("Kuyruk (front-->rear):");
		theList.displayList();
	}
}
