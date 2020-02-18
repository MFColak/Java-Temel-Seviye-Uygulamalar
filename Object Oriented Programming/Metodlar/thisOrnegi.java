
public class thisOrnegi {
	private String ad;
	private String soyad;
	
	public thisOrnegi(String ad) {
		this(ad,"Ünsal");
	}
	public thisOrnegi(String ad, String soyad) {
		this.ad=ad;
		this.soyad=soyad;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisOrnegi ob=new thisOrnegi("Emre");
		System.out.println(ob.ad+" "+ob.soyad);
	}
}
