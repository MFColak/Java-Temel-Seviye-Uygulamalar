package arrays;

public class OrderedApp {

	public static void main(String[] args) {
		int maxSize = 100; // array size
		OrderedArray dizi; // reference to array
		dizi = new OrderedArray(maxSize); // create the array
		
		dizi.insert(77); 
		dizi.insert(99);
		dizi.insert(44);
		dizi.insert(55);
		dizi.insert(22);
		dizi.insert(88);
		dizi.insert(11);
		dizi.insert(00);
		dizi.insert(66);
		dizi.insert(33);
		
		dizi.display();
		
		int searchKey = 55; // search for item
		if (dizi.find(searchKey) != dizi.size())
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can't find " + searchKey);
		
		dizi.delete(00); // delete 3 items
		dizi.delete(55);
		dizi.delete(99);
		
		dizi.display();
	}

}
