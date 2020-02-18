package NesneUygulama;

public class Stok {
	private int id;
	private String adi;
	String aciklama;
	double fiyat;
	int miktar;
	private String kod;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getKod() {
		return this.adi.substring(0, 1)+id;
	}


}
