package mergeSort;

public class MergeSortApp {

	public static void main(String[] args) {
		int maxSize=100;
		DArray dizi = new DArray(maxSize);
		
	      dizi.insert(64);                // insert items
	      dizi.insert(21);
	      dizi.insert(33);
	      dizi.insert(70);
	      dizi.insert(12);
	      dizi.insert(85);
	      dizi.insert(44);
	      dizi.insert(3);
	      dizi.insert(99);
	      dizi.insert(0);
	      dizi.insert(108);
	      dizi.insert(36);
		
		dizi.display();
		
		dizi.mergeSort();
		dizi.display();
	
	}

}
