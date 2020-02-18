package sort;

public class InsertionSort {
	private long dizi[];
	private int elemanSayisi;

	public InsertionSort(int max) {
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
		int j;
		int tekrarSayisi = 0;
		for (int i=1; i<elemanSayisi;i++)
		{
			long temp = dizi[i];
			j=i;
			while (j>0 && dizi[j-1] >= temp)
			{
				if (dizi[j-1]==temp && dizi[j-1]!=-1){
					temp=-1;
					tekrarSayisi++;
				}
				dizi[j] = dizi[j-1];
				--j;
			}
			dizi[j]=temp;
		}

		System.out.println(tekrarSayisi);
		if (tekrarSayisi!=0)
			for(int i=tekrarSayisi;i<elemanSayisi;i++)
				dizi[i-tekrarSayisi]=dizi[i];
		elemanSayisi=elemanSayisi-tekrarSayisi;

	}
	public void median() {
		sort();
		if (elemanSayisi % 2 == 1)
			System.out.println(dizi[elemanSayisi/2]);
		else
			System.out.println((double)(dizi[elemanSayisi/2]+dizi[elemanSayisi/2-1])/2);
	}
}
