package Inner;

class Hayvan{
	abstract class Kus{
		public abstract void uc();
		public abstract void kon();
	}
}
//burada kus sýnýfýna ait soyut sýnýf 
//kullanýlacaksa once bu sýnýfý cevreleyen
//hayvan sýnýfýna ait bir nesne bulunmasý zorunludur.
class Kartal extends Hayvan.Kus{
	public Kartal(Hayvan hv) {
		//Hayvan sýnýfýna ait nesnenin yapýlandýrýcýsý
		hv.super();
	}
	public void uc() {
		System.out.println("Kartal uçuyor");
	}
	public void kon() {
		System.out.println("Kartal kondu");
	}
}

public class AbstractInnerClass {
	
	public static void main(String args[]) {
		Hayvan hv=new Hayvan();
		Kartal krt=new Kartal(hv);
		krt.uc();
		krt.kon();
	}

}
