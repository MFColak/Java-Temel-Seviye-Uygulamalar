package arrays;

public class HArrayApp {

	public static void main(String[] args) {
		int maxSize = 100; // dizi boyutu
		HArray dizi; // diziyi tanýmla
		dizi = new HArray(maxSize); 
		HArray dizi2 = new HArray(maxSize);
		// --------------------------------------
		dizi.insert(77);
		dizi.insert(99);
		dizi.insert(44);
		dizi.insert(55);
		dizi.insert(22);
		dizi.insert(88);
		dizi.insert(11);
		dizi.insert(00);
		dizi.insert(66);
		dizi.insert(33);
		//--------------------------------------------
		//Sýrasýz bir diziden, sýralama algoritmasý kullanmadan, büyükten küçüðe sýral bir dizi oluþturma
		dizi.display();
		while (dizi.getMax()!=-1) {
			dizi2.insert(dizi.getMax());
			dizi.removeMax();
		}
		System.out.println("1.Dizi");
		dizi.display();					//eski dizi boþaldý
		System.out.println("2.Dizi");
		dizi2.display();
		dizi=dizi2;						// referans eþitleme yaparak eski dizi iptal oluyor.
		System.out.println("1.Dizi");
		dizi.display();			//sýralanmýþ yeni diziyi görür.
		//--------------------------------------------------------
		if (dizi.getMax()==-1)			//getMax ve removeMax için uygulamalar
			System.out.println("Dizi Boþ");
		else
			System.out.println("En Büyük sayý:"+dizi.getMax());
		
		dizi.display();
		
		if (dizi.removeMax()) {
			System.out.println("En büyük deðer silindi");
		}
		dizi.display();
		//----------------------------------------------------------

		int searchKey = 35; // arama
		if (dizi.find(searchKey))
			System.out.println("Bulundu " + searchKey);
		else
			System.out.println("Bulunamadý " + searchKey);
		//-------------------------------------------------
		//silme
		dizi.delete(55);
		dizi.delete(00);
		dizi.delete(22);
		
		dizi.display();
	}

}
