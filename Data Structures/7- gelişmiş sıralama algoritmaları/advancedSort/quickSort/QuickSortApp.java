package quickSort;

import shellSort.ArrayShell;

public class QuickSortApp {

	public static void main(String[] args) {
		int maxSize=10;
		ArrayQuick dizi = new ArrayQuick(maxSize);
		
		for (int i = 0; i < maxSize; i++)
		{
			long n = (int)(java.lang.Math.random()*99);
			dizi.insert(n);
		}
		dizi.display();
		dizi.quickSort();
		dizi.display();

	}

}
