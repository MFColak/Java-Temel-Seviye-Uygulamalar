package Abstract;

public class Ogrenci extends Kisi {
	long ogrNo;
	String bolum;
	
	public Ogrenci(String adSoyad, String dtarih, char cinsiyet, long ogrNo, String bolum) {
		super(adSoyad,dtarih,cinsiyet);
		this.ogrNo=ogrNo;
		this.bolum=bolum;
	}

	@Override
	public void kisiBilgileri() {
		System.out.println("Kisi ad� Soyad�:"+getAdSoyad());
		System.out.println("��renci Numaras�:"+ogrNo);
		System.out.println("Do�um tarihi:"+ super.dogumTarihi);
		System.out.println("Cinsiyet:"+cinsiyet);
		System.out.println("B�l�m�:"+this.bolum);
	}
	
	public static void main(String[] args) {
		Ogrenci ogr=new Ogrenci("John Snow", "10/10/2006",'E', 123456, "Stark");
		ogr.kisiBilgileri();
	}

}
