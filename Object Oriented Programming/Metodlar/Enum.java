package ENUM;

enum Arabalar{
	AUDI(210,"Kýrmýzý"),MERCEDES(200,"Beyaz"),BMW(240,"Siyah");
	public int hiz;
	public String renk;
	
	Arabalar(int hiz,String renk){
		this.hiz=hiz;
		this.renk=renk;
	}
	int hizGoster() {
		return hiz;
	}
}
public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arabalar.AUDI.hiz=230;
		Arabalar.BMW.renk="Lacivert";
		for (Arabalar A:Arabalar.values()) {
			System.out.print(A.name()+" ");
			System.out.println(A.hiz+" "+A.renk);
		}
		System.out.println(Arabalar.BMW.hizGoster());
		System.out.println(Arabalar.MERCEDES.ordinal());
	}
}
