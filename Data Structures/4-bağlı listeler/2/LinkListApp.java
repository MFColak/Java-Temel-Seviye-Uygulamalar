package linkList;

public class LinkListApp {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		
		theList.insertToHead(11, 1.99);
		theList.insertToHead(22, 2.99);
		theList.displayList();
		
		theList.insertToTail(33, 3.99);
		theList.insertToTail(55, 5.99);
		theList.displayList();
		
		theList.insertAfter(33, 44, 4.99);
		theList.displayList();
		
		theList.deleteAfter(22);
		theList.displayList();
		
		theList.deleteFromTail();
		theList.displayList();
		
		theList.deleteFormHead();
		theList.displayList();
		
		theList.delete(44);
		theList.displayList();
	}
}
