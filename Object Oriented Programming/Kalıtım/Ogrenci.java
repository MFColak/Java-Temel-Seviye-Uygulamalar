package inheritance;

public class Ogrenci extends Kisi {
	private int ogrNo;
	private String bolum;
	
	public Ogrenci() {
		super();
		this.ogrNo=0;
		this.bolum="";
	}

	public Ogrenci(String adSoyad, String dogumTarihi, char cinsiyet,int ogrNo,String bolum) {
		super(adSoyad, dogumTarihi, cinsiyet);
		this.ogrNo=ogrNo;
		this.bolum=bolum;
	}
	public Ogrenci(Kisi obj,int ogrNo, String bolum) {
		super(obj);
		this.ogrNo=ogrNo;
		this.setBolum(bolum);
	}
	public Ogrenci(Ogrenci obj) {
		super(obj.getAdSoyad(),obj.getDogumTarihi(),obj.getCinsiyet());
		this.setOgrNo(obj.ogrNo);
		this.bolum=obj.getBolum();
	}
	
	public int getOgrNo() {
		return ogrNo;
	}

	public void setOgrNo(int ogrNo) {
		this.ogrNo = ogrNo;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	@Override
	public void yaz() {
		System.out.println("Ogrenci Sýnýfý");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kisi birey=new Kisi("Ali Veli","17/12/2010",'E');
		Ogrenci ogr=new Ogrenci("Ayþe Tatlý", "10/10/2000", 'K', 2014510088, "Bilgisayar");
		//System.out.print(ogr.getAdSoyad()+" "+ogr.getDogumTarihi()+" ");
		//System.out.println(ogr.getCinsiyet()+" "+ogr.getOgrNo()+" "+ogr.getBolum());
		birey.yaz();
		birey=ogr;
		//System.out.println(birey.getAdSoyad()+" "+birey.getCinsiyet());
		//System.out.println(birey.getOgrNo());//Çalýþmaz
		ogr.yaz();
		ogr.getAdSoyad();
		ogr.getCinsiyet();
		ogr.getAdSoyad();
		
		//Diðer constructorlarýn kullanýmý
		Kisi k1=new Kisi(birey);
		Ogrenci ogr2=new Ogrenci(k1, 2010141086, "Elektronik");
		//System.out.println(ogr2.getAdSoyad()+" "+ogr2.getCinsiyet()+" "+ogr2.getBolum());
	}
}
