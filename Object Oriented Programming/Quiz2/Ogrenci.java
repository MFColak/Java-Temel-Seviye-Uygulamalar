public class Ogrenci extends Kisi {
	private long ogrNo;
	private String Bolum;
	
	public Ogrenci() {
		super();
		ogrNo=-1;
		Bolum=null;
	}
	public Ogrenci(String ad, String soyad, String dTarihi,long ogrNo, String Bolum) {
		super(ad,soyad,dTarihi);
		this.ogrNo=ogrNo;
		this.Bolum=Bolum;
	}
	@Override
	public void kisiBilgisiGetir() {
		String bilgiler=this.ad+" "+this.soyad+" "+this.dTarihi.toString()+
				" "+String.valueOf(this.ogrNo)+" "+this.Bolum;
		System.out.println(bilgiler);
		
	}
	public long getOgrNo() {
		return ogrNo;
	}
	public void setOgrNo(long ogrNo) {
		this.ogrNo = ogrNo;
	}
	public String getBolum() {
		return Bolum;
	}
	public void setBolum(String bolum) {
		Bolum = bolum;
	}

}
