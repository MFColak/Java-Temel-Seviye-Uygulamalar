package sort;

public class SelectionSortApp {

	public static void main(String[] args) {
		SelectionSort array = new SelectionSort(100);
		array.insert(15);
		array.insert(12);
		array.insert(36);
		array.insert(4);
		array.insert(8);
		array.insert(10);
		array.display();
		System.out.println();
		array.sort();
		array.display();
	}
}

