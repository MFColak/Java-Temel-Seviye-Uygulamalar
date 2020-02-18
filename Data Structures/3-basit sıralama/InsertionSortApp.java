package sort;

public class InsertionSortApp {

	public static void main(String[] args) {
		InsertionSort array = new InsertionSort(10);
		array.insert(2);
		array.insert(5);
		array.insert(11);
		array.insert(8);
		array.insert(4);
		array.insert(30);
		array.display();
		array.median();
		array.display();


	}
}

