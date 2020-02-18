package linkStack;

public class LinkList {
	private Link head;
	
	public LinkList() {
		head=null;
	}
	
	public boolean isEmpty() {
		return (head==null);
	}
	
	public void insertFirst(long dd) {
		Link newLink = new Link(dd);
		newLink.next= head;
		head=newLink;
	}
	
	public long deleteFirst() {
		Link temp=head;
		head= head.next;
		return temp.dData;
	}
	
	public void displayList() {
		Link current=head;
		while (current !=null) {
			current.displayLink();
			current= current.next;
		}
		System.out.println("");
	}
	
	public long firstData() {
		return head.dData;
	}
}
