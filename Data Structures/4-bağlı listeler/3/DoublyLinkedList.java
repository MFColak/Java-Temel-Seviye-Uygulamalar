package doublyLinked;

public class DoublyLinkedList {
	private Link head;
	private Link tail;

	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insertFirst(long dd) {
		Link newLink = new Link(dd);
		if (isEmpty())
			tail = newLink;
		else
			head.previous = newLink;
		newLink.next = head;
		head = newLink;
	}

	public void insertLast(long dd) {
		Link newLink = new Link(dd);
		if (isEmpty())
			head = newLink;
		else {
			tail.next = newLink;
			newLink.previous = tail;
		}
		tail = newLink;
	}

	public Link deleteFirst() {
		Link temp = head;
		if (head.next == null)
			tail = null;
		else
			head.next.previous = null;
		head = head.next;
		return temp;
	}

	public Link deleteLast() {
		Link temp = tail;
		if (head.next == null)
			head = null;
		else
			tail.previous.next = null;
		tail = tail.previous;
		return temp;
	}

	public boolean insertAfter(long key, long dd) {
		Link current = head;
		while (current.dData != key) {
			current = current.next;
			if (current == null)
				return false;
		}
		Link newLink = new Link(dd);
		if (current == tail) {
			newLink.next = null;
			tail=newLink;
		}
		else {
			newLink.next=current.next;
			current.next.previous=newLink;
		}
		newLink.previous=current;
		current.next=newLink;
		return true;
	}
	
	public Link deleteKey(long key) {
		Link current = head;
		while (current.dData!=key) {
			current= current.next;
			if (current == null)
				return null;
		}
		if (current==head)
			head=current.next;
		else
			current.previous.next=current.next;
		if (current == tail)
			tail =current.previous;
		else
			current.next.previous=current.previous;
		return current;
	}
	
	public void displayForward() {
		System.out.println("Liste (head-->tail):");
		Link current= head;
		while(current!=null)
		{
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
	}

	public void displayBackard() {
		System.out.println("Liste (tail-->head):");
		Link current= tail;
		while(current!=null)
		{
			current.displayLink();
			current=current.previous;
		}
		System.out.println("");
	}
}















