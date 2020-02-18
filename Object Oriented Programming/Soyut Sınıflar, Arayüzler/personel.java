package Abstract;

public class personel extends Kisi implements Calisan{
	public int dersSaati;
	public String unvan;
	public String bolum;
	public int sicilNo;
	
	public personel(String adSoyad, String dtarih, char cinsiyet,
			int dersSaati, String unvan, String bolum, int sicil) {
		
		super(adSoyad, dtarih, cinsiyet);
		this.dersSaati=dersSaati;
		this.unvan=unvan;
		this.bolum=bolum;
		this.sicilNo=sicil;
	}

	@Override
	public void kisiBilgileri() {
		System.out.println("Kisi ad� Soyad�:"+getAdSoyad());
		System.out.println("Sicil Numaras�:"+sicilNo);
		System.out.println("Do�um tarihi:"+ super.dogumTarihi);
		System.out.println("Cinsiyet:"+cinsiyet);
		System.out.println("B�l�m�:"+this.bolum);
		System.out.println("Kurumu:"+Calisan.kurum);
		
	}

	@Override
	public double maasHesapla(int dersSaati) {
		double maas=10*dersSaati;
		return maas;
	}

	@Override
	public void unvanGoster() {
		System.out.println(this.unvan);
	}
	
	public static void main(String[] args) {
		//Ki�i s�n�f�ndan bir nesne tan�mlanamaz
		//Kisi k=new Kisi();
		personel per=new personel("Daenerys Targaryen", "MS.298", 'K', 40, "Queen", "Targaryen", 3);
		double kas�m=per.maasHesapla(per.dersSaati);
		System.out.print("Unvan:		");
		per.unvanGoster();
		System.out.println("Ad Soyad:	"+per.getAdSoyad());
		System.out.println("Maas:		"+kas�m);
		System.out.println("-------------------------------------");
		
		per.kisiBilgileri();
	}

}
