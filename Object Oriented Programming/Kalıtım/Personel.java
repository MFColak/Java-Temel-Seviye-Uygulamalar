package inheritance;

public class Personel extends Kisi {
	private int sicilNo;
	private String birim;
	private String unvan;
	private long dahiliTel;
	
	public Personel(String adSoyad, String dogumTarihi, char cinsiyet,
			int sicilNo, String birim, String unvan, long dahiliTel) {
		super(adSoyad, dogumTarihi, cinsiyet);
		//super.setAdSoyad(adSoyad);
		this.sicilNo = sicilNo;
		this.birim = birim;
		this.unvan = unvan;
		this.dahiliTel = dahiliTel;
	}
	public Personel() {
		super();
		this.sicilNo=-1;
		this.birim="";
		this.unvan="";
		this.dahiliTel=-1;
	}
	public Personel(Kisi obj,int sicilNo, String birim, String unvan, long dahiliTel) {
		super(obj);
		this.sicilNo = sicilNo;
		this.birim = birim;
		this.unvan = unvan;
		this.dahiliTel = dahiliTel;
	}
	
	public int getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}
	public String getBirim() {
		return birim;
	}
	public void setBirim(String birim) {
		this.birim = birim;
	}
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	public long getDahiliTel() {
		return dahiliTel;
	}
	public void setDahiliTel(long dahiliTel) {
		this.dahiliTel = dahiliTel;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personel per=new Personel("Ekim Kara", "30/10/2017", 'K', 2900, 
				"Bilgisayar","ProfDr",232);
		System.out.println(per.getAdSoyad()+" " +per.getDogumTarihi()+" "+per.sicilNo);
		//Yeni personel tanýmý
		Kisi k=new Kisi("Erdem Kýsa","17/08/1998",'E');
		Personel per1=new Personel(k,1478,"Bilgisayar","Doç.Dr.",7881);
		System.out.println(per1.getAdSoyad()+" " +per1.getDogumTarihi()+" "+per1.sicilNo);
	}
}
