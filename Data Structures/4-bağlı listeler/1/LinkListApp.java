package linkList;

public class LinkListApp {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		
		theList.insertFirst(22, 2.99);
		theList.insertFirst(33, 3.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(55, 5.99);
		
		theList.displayList();
		
		while (!theList.isEmpty()) {
			Link aLink =theList.deleteFirst();
			System.out.print("Silindi");
			aLink.displayLink();
			System.out.println("");
		}
		theList.insertFirst(22, 2.99);
		theList.insertFirst(33, 3.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(55, 5.99);
		
		Link f = theList.find(44);
		if (f!=null)
			System.out.println(f.iData+ "deðeri bulundu");
		else 
			System.out.println("Link bulunamadý");
		
		Link d = theList.delete(44);
		if (d != null)
			System.out.println(d.iData + " silindi");
		else
			System.out.println("Silinemedi");
		theList.displayList();
	}

}
