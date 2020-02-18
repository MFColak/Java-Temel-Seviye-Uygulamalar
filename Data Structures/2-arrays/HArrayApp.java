package arrays;

public class HArrayApp {

	public static void main(String[] args) {
		int maxSize = 100; // dizi boyutu
		HArray dizi; // diziyi tan�mla
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
		//S�ras�z bir diziden, s�ralama algoritmas� kullanmadan, b�y�kten k����e s�ral bir dizi olu�turma
		dizi.display();
		while (dizi.getMax()!=-1) {
			dizi2.insert(dizi.getMax());
			dizi.removeMax();
		}
		System.out.println("1.Dizi");
		dizi.display();					//eski dizi bo�ald�
		System.out.println("2.Dizi");
		dizi2.display();
		dizi=dizi2;						// referans e�itleme yaparak eski dizi iptal oluyor.
		System.out.println("1.Dizi");
		dizi.display();			//s�ralanm�� yeni diziyi g�r�r.
		//--------------------------------------------------------
		if (dizi.getMax()==-1)			//getMax ve removeMax i�in uygulamalar
			System.out.println("Dizi Bo�");
		else
			System.out.println("En B�y�k say�:"+dizi.getMax());
		
		dizi.display();
		
		if (dizi.removeMax()) {
			System.out.println("En b�y�k de�er silindi");
		}
		dizi.display();
		//----------------------------------------------------------

		int searchKey = 35; // arama
		if (dizi.find(searchKey))
			System.out.println("Bulundu " + searchKey);
		else
			System.out.println("Bulunamad� " + searchKey);
		//-------------------------------------------------
		//silme
		dizi.delete(55);
		dizi.delete(00);
		dizi.delete(22);
		
		dizi.display();
	}

}
