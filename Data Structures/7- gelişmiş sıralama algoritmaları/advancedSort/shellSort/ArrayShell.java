package shellSort;

public class ArrayShell {
	private long[] dizi;
	private int elemanSayisi;

	public ArrayShell(int max) {
		dizi = new long[max];
		elemanSayisi = 0;
	}

	public void insert(long value) {
		dizi[elemanSayisi] = value;
		elemanSayisi++;
	}

	public void display() {
		for (int i = 0; i < elemanSayisi; i++)
			System.out.print(dizi[i] + " ");
		System.out.println("");
	}

	public void shellSort() {
		int i, j;
		long temp;

		int h = 1;
		while (h <= elemanSayisi / 3)
			h = h * 3 + 1;
		while (h > 0) {
			for (i = h; i < elemanSayisi; i++) {
				temp = dizi[i];
				j = i;
				while (j > h - 1 && dizi[j - h] >= temp) {
					dizi[j] = dizi[j - h];
					j -= h;
				}
				dizi[j] = temp;
			} // end for
			h = (h - 1) / 3;
		} // end while
	}
}
