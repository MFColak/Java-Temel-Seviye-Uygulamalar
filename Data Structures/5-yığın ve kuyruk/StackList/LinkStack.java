package linkStack;

public class LinkStack {
	private LinkList theList;
	
	public LinkStack() {
		theList = new LinkList();
	}
	
	public void push(long i) {
		theList.insertFirst(i);
	}
	
	public long pop() {
		return theList.deleteFirst();
	}
	
	public boolean isEmpty() {
		return theList.isEmpty();
	}
	
	public void displayStack() {
		System.out.print("Stack( top-->bottom) :");
		theList.displayList();
	}
	public long peek() {
		return theList.firstData();
	}
	
}
