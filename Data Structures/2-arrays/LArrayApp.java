package arrays;

public class LArrayApp {
	public static void main(String[] args) {
		LArray dizi;
		dizi = new LArray(100); 	// create object
		int elemanSayisi = 0; 		// eleman say�s�
		int j; 						// dongu sayac�
		//--------------------------------------------
		dizi.setElem(0, 77);
		dizi.setElem(1, 99);
		dizi.setElem(2, 44);
		dizi.setElem(3, 55);
		dizi.setElem(4, 22);
		dizi.setElem(5, 88);
		dizi.setElem(6, 11);
		dizi.setElem(7, 00);
		dizi.setElem(8, 66);
		dizi.setElem(9, 33);
		elemanSayisi = 10; 			// 10 deger eklendi
		//------------------------------------------
		for (j = 0; j < elemanSayisi; j++)
			System.out.print(dizi.getElem(j)+ " ");
		System.out.println("");
		//----------------------------------------------
		int searchKey = 26; 					// deger arama
		for (j = 0; j < elemanSayisi; j++) 		// t�m elemanlar aras�nda
			if (dizi.getElem(j) == searchKey) 	// eleman mevcut mu?
				break;
		if (j == elemanSayisi) 					
			System.out.println("Bulunamad� " + searchKey);
		else // yes
			System.out.println("Bulundu " + searchKey);
		//-----------------------------------------------
		for (j = 0; j < elemanSayisi; j++) 		// ara 55
			if (dizi.getElem(j) == 55)
				break;
		for (int k = j; k < elemanSayisi; k++) 	// sonrakileri kayd�r
			dizi.setElem(k, dizi.getElem(k + 1));
		elemanSayisi--; 
		//------------------------------------------------
		for (j = 0; j < elemanSayisi; j++) 		// elemanlar� listele
			System.out.print(dizi.getElem(j) + " ");
		System.out.println("");
	}
}
