public abstract class Kisi {
	protected String ad;
	protected String soyad;
	protected String dTarihi;
	
	public Kisi() {
		ad="";
		soyad="";
		dTarihi=null;
	}
	public Kisi(String ad, String soyad, String dTarihi) {
		this.ad=ad;
		this.soyad=soyad;
		this.dTarihi=dTarihi;
	}
	
	public abstract void kisiBilgisiGetir();
}
