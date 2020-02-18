package NesneUygulama;

public class MainOgrenci {

	public static void main(String[] args) {
		OgrenciIslem ogrenciIslem = new OgrenciIslem();
		OgrenciIslem ogrenciIslem2 = new OgrenciIslem();

		ogrenciIslem = ogrenciIslem2;

		int sayi1 = 1;
		int sayi2 = 2;

		sayi2 = sayi1;
		sayi1 = 3;
		System.out.println(sayi2);

		ogrenciIslem.Ekle();
		ogrenciIslem.Guncelle();
		ogrenciIslem.Sil();

	}

}
