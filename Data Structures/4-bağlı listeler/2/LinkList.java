package linkList;

public class LinkList {
	private Link head;
	private Link tail;

	public LinkList() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void insertToHead(int id, double dd) {
		Link newLink = new Link(id, dd);
		if (isEmpty())
			tail = newLink;
		newLink.next = head;
		head = newLink;
	}

	public void insertToTail(int id, double dd) {
		Link newLink = new Link(id, dd);
		if (isEmpty())
			head = newLink;
		else
			tail.next = newLink;
		tail = newLink;
	}

	public void insertAfter(int key, int id, double dd) {
		Link newLink = new Link(id, dd);
		Link current = find(key);
		if (current.next == null)
			tail = newLink;
		newLink.next = current.next;
		current.next = newLink;
	}

	public int deleteFormHead() {
		int data = head.iData;
		if (head == tail)
			head = tail = null;
		else
			head = head.next;
		return data;
	}

	public int deleteFromTail() {
		int data = tail.iData;
		if (head == tail)
			head = tail = null;
		else {
			Link current;
			// for (current = head; current.next != tail; current = current.next);
			current = head;
			while (current.next != tail)
				current = current.next;
			tail = current;
			tail.next = null;
		}
		return data;
	}

	public void delete(int id) {
		if (!isEmpty())
			if (head == tail && id == head.iData)
				head = tail = null;
			else if (id == head.iData)
				head = head.next;
			else {
				Link previous;
				Link current;
				previous = head;
				current = head.next;
				while (current != null && current.iData != id) {
					previous = previous.next;
					current = current.next;
				}
				if (current!=null) {
					previous.next=current.next;
					if (current==tail)
						tail=previous;
				}
			}
	}
	
	public boolean isInList(int id){
		Link current;
		current=head;
		while (current!=null && current.iData!=id)
			current=current.next;
		return current!=null;
	}

	public Link find(int key) {
		Link current = head;
		while (current.iData != key) {
			if (current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}

	public void deleteAfter(int id) {
		Link current = find(id);
		if (current != null && current.next != null)
			current.next = current.next.next;
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
