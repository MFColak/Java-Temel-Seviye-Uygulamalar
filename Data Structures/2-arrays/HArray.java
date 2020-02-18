package arrays;

public class HArray {
	private long[] dizi;
	private int elemanSayisi;

	// -----------------------------------

	public HArray(int max) { // constructor
		dizi = new long[max];
		elemanSayisi = 0;
	}
	// ---------------------------------------

	public boolean find(long searchKey) { // eleman arama var/yok
		int j;
		for (j = 0; j < elemanSayisi; j++)
			if (dizi[j] == searchKey)
				break;
		if (j == elemanSayisi)
			return false;
		else
			return true;
	} // end find()

//---------------------
	public void insert(long value) // diziye eleman ekleme
	{
		dizi[elemanSayisi] = value;
		elemanSayisi++;
	}

	// -------------------------
	public boolean delete(long value) {
		int j;
		for (j = 0; j < elemanSayisi; j++) // önce ara
			if (value == dizi[j])
				break;
		if (j == elemanSayisi) // bulunamadý
			return false;
		else // bulundu
		{
			for (int k = j; k < elemanSayisi; k++) // sonrakileri kaydýr
				dizi[k] = dizi[k + 1];
			elemanSayisi--; // boyutu azalt
			return true;
		}
	}

	// -------------------------------
	public void display() // listele
	{
		for (int j = 0; j < elemanSayisi; j++)
			System.out.print(dizi[j] + " ");
		System.out.println("");
	}

	public long getMax() {

		if (elemanSayisi == 0)
			return -1;
		else {
			long max = dizi[0];
			for (int j = 1; j < elemanSayisi; j++)
				if (dizi[j] > max)
					max = dizi[j];
			return max;
		}
	}

	public boolean removeMax() {
		if (getMax() == -1) {
			System.out.println("Dizi Boþ");
			return false;
		} else
			return delete(getMax());
	}
}


