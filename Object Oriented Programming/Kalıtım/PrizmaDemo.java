// Quiz çözümüdür...
class Prizma{
	private double en;
	private double boy;
	private double derinlik;
	
	public Prizma() {
		en=-1;
		boy=-1;
		derinlik=-1;
	}
	public Prizma(double e, double b, double d) {
		en=e;
		boy=b;
		derinlik=d;
	}
	public Prizma(Prizma obj) {
		this.en=obj.getEn();
		this.boy=obj.getBoy();
		this.derinlik=obj.getDerinlik();
	}
	public void setEn(double en) {
		this.en=en;
	}
	public double getEn() {
		return en;
	}
	public void setBoy(double boy) {
		this.boy=boy;
	}
	public double getBoy() {
		return boy;
	}
	public void setDerinlik(double derinlik) {
		this.derinlik=derinlik;
	}
	public double getDerinlik() {
		return derinlik;
	}
	double alanHesapla() {
		double alan= 2 * (en * boy + boy * derinlik + en * derinlik);
		return alan;
	}
	
	double hacimHesapla() {
		return en * boy * derinlik;
	}
}

public class PrizmaDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prizma p1=new Prizma(10, 20, 15);
		double hacim = p1.hacimHesapla();
		double alan = p1.alanHesapla();
		System.out.println("Prizma 1'in Alaný=" + alan);
		System.out.println("Prizma 1'in Hacmi=" + hacim);
		Prizma p2=new Prizma(p1);
		p2.setBoy(5);
		p2.setEn(5);
		p2.setDerinlik(5);
		System.out.println("Prizma 2'in Alaný=" + p2.alanHesapla());
		System.out.println("Prizma 2'in Hacmi=" + p2.hacimHesapla());
	}
}
