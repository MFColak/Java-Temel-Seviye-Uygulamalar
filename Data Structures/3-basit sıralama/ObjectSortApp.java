package sort;

public class ObjectSortApp {

	public static void main(String[] args) {
		int maxSize = 100;
		ObjectArrayInsertion dizi = new ObjectArrayInsertion(100);

		dizi.insert("Evans", "Patty", 24);
		dizi.insert("Smith", "Doc", 59);
		dizi.insert("Smith", "Lorraine", 37);
		dizi.insert("Smith", "Paul", 37);
		dizi.insert("Yee", "Tom", 43);
		dizi.insert("Hashimoto", "Sato", 21);
		dizi.insert("Stimson", "Henry", 29);
		dizi.insert("Velasquez", "Jose", 72);
		dizi.insert("Vang", "Minh", 22);
		dizi.insert("Creswell", "Lucinda", 18);
		
		System.out.println("Sýralamadan Önce");
		dizi.display();
		
		dizi.insertionSort();
		System.out.println("Sýralamdan sonra");
		dizi.display();
	}
}
