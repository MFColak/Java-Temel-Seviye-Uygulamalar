
public class gettrerSetter {
	private int sayi;
	private String ad;
	
	public int getSayi() {
		return sayi;
	}
	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public static void main(String[] args) {
		gettrerSetter getSet=new gettrerSetter();
		getSet.setAd("Emre");
		getSet.setSayi(25);
		System.out.println("Nesnenin Adı="+getSet.getAd());
		System.out.println("Nesnenin sayi="+getSet.getSayi());
	}

}
