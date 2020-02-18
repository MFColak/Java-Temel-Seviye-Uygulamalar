package Inner;

class Hayvan{
	abstract class Kus{
		public abstract void uc();
		public abstract void kon();
	}
}
//burada kus s�n�f�na ait soyut s�n�f 
//kullan�lacaksa once bu s�n�f� cevreleyen
//hayvan s�n�f�na ait bir nesne bulunmas� zorunludur.
class Kartal extends Hayvan.Kus{
	public Kartal(Hayvan hv) {
		//Hayvan s�n�f�na ait nesnenin yap�land�r�c�s�
		hv.super();
	}
	public void uc() {
		System.out.println("Kartal u�uyor");
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
