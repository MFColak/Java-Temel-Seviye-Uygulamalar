package linkList;
public class LinkList {
	private Link head;
	
	public LinkList() {
		head = null;
	}
	public boolean isEmpty() {
		return(head==null);
	}
	
	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id,dd);
		newLink.next = head;
		head = newLink;
	}
	public Link deleteFirst() {
		Link temp = head;
		head = head.next;
		return temp;
	}
	
	public Link find(int key) {
		Link current = head;
		while (current.iData != key)
		{
			if (current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}
	
	public Link delete(int key) {
		Link current = head;
		Link previous = head;
		while (current.iData !=key) {
			if (current.next== null)
				return null;
			else
			{
				previous = current;
				current = current.next;
			}
		}
		if (current == head)
			head = head.next;
		else 
			previous.next = current.next;
		return current;
	}
	
	
	
	public void displayList() {
		System.out.println("Liste (ilk-->son)");
		Link current = head;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}








}
