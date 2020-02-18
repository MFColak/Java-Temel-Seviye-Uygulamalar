package Abstract;

public abstract class Kisi {
	String adSoyad;
	String dogumTarihi;
	char cinsiyet;
	
	public Kisi(String adSoyad, String dtarih, char cinsiyet) {
		this.adSoyad=adSoyad;
		this.dogumTarihi=dtarih;
		this.cinsiyet=cinsiyet;
	}
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad=adSoyad;
	}
	//Soyut bir metot tanýmladýk.
	public abstract void kisiBilgileri();
	//public abstract int toplam(int a, int b);
}
