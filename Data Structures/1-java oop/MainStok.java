package NesneUygulama;

public class MainStok {

	public static void main(String[] args) {
		Stok stok=new Stok();
		
		stok.setId(1);
		stok.setAdi("Bilgisayar");
		stok.aciklama="Masaüstü";
		stok.fiyat=1000;
		stok.miktar=5;
		
		System.out.println(stok.getAdi());
		System.out.println(stok.getKod());
	}

}
