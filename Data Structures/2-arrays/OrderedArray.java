package arrays;

public class OrderedArray {
	private long[] dizi;
	private int elemanSayisi;

	public OrderedArray(int max) { // constructor
		dizi = new long[max];
		elemanSayisi = 0;
	}

	public int size() {
		return elemanSayisi;
	}

	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = elemanSayisi - 1;
		int curIn;

		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (dizi[curIn] == searchKey)
				return curIn;
			else if (lowerBound > upperBound)
				return elemanSayisi;
			else {
				if (dizi[curIn] < searchKey)
					lowerBound = curIn + 1;
				else
					upperBound = curIn - 1;
			}
		}
	}

	public void insert(long value) 			// diziye eleman ekleme
	{
		int j;
		for (j = 0; j < elemanSayisi; j++)
			if (dizi[j] > value) 				//lineer arama
				break;
		for (int k = elemanSayisi; k > j; k--)
			dizi[k] = dizi[k - 1];
		dizi[j] = value;
		elemanSayisi++; 
	}
	
	public boolean delete(long value) {
		int j = find(value);
		if (j == elemanSayisi)
			return false;
		else {
			for (int k = j; k < elemanSayisi; k++) // sonrakileri kaydýr
				dizi[k] = dizi[k + 1];
			elemanSayisi--;
			return true;
		}
	}

	public void display() // listele
	{
		for (int j = 0; j < elemanSayisi; j++)
			System.out.print(dizi[j] + " ");
		System.out.println("");
	}
}


//ceng1.cumhuriyet.edu.tr/lectures/bil2005















