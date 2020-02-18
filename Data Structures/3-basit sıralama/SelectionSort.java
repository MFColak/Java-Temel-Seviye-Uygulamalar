package sort;

public class SelectionSort {
	private long dizi[];
	private int elemanSayisi;

	public SelectionSort(int max) {
		dizi = new long[max];
		elemanSayisi = 0;
	}

	public void insert(long x) {
		dizi[elemanSayisi] = x;
		elemanSayisi++;

	}

	public void display() {
		for (int i = 0; i < elemanSayisi; i++) {
			System.out.print(" " + dizi[i]);
		}
		System.out.println();

	}

	public void sort() {
		for (int i = 0; i < elemanSayisi - 1; i++) {
			swap(i, minBul(i));
		}
	}
	
	public int minBul(int bas) {
		int min=bas;
		for (int i = bas+1;i<elemanSayisi; i++)
			if (dizi[i]<dizi[min])
				min=i;
		return min;
	}
	
	public void swap(int a, int b) {
		long temp = dizi[a];
		dizi[a] = dizi[b];
		dizi[b] = temp;
	}
	
	
}
