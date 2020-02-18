package inheritance;

public class Kisi {
	private String adSoyad;
	private String dogumTarihi;
	private char cinsiyet;

	public Kisi() {
		this.adSoyad="";
		this.dogumTarihi="";
		this.cinsiyet=' ';
	}

	public Kisi(String adSoyad, String dogumTarihi, char cinsiyet) {
		this.adSoyad = adSoyad;
		this.dogumTarihi = dogumTarihi;
		this.cinsiyet = cinsiyet;
	}
	public Kisi(Kisi obj) {
		//aþaðýdaki üç satýr ayný iþi yapmaktadýr.
		this.adSoyad=obj.adSoyad;
		//this.setAdSoyad(obj.getAdSoyad());
		//this.setAdSoyad(obj.adSoyad);
		this.setDogumTarihi(obj.getDogumTarihi());
		this.cinsiyet=obj.getCinsiyet();
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public char getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(char cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public void yaz() {
		System.out.println("Kisi Sýnýfý");
	}
}
