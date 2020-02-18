package inheritance;
class Canli{	
	public void adSoyle() {
		System.out.println("Canl� S�n�f�");
	}
}

class Hayvan extends Canli{	
	public void adSoyle() {
		System.out.println("Hayvan S�n�f�");
	}
}

class Omurgal� extends Hayvan{
	public void adSoyle() {
		System.out.println("Omurgal� S�n�f�");
	}
}

class Omurgas�z extends Hayvan{
	public void adSoyle() {
		System.out.println("Omurgas�z S�n�f�");
	}
}

public class Casting {
	public static void main(String[] args) {
		Canli c=new Canli();//Casting yok
		c.adSoyle();
		Canli h1=new Hayvan();//Upcasting
		h1.adSoyle();
		Canli h2=(Canli)new Hayvan();//Upcasting Y�ntem 2
		h2.adSoyle();
		
		Hayvan h3=new Hayvan();
		Canli c2=h3;//Upcasting
		c2.adSoyle();
		Hayvan h4=(Hayvan)c2;//Downcasting
		c2.adSoyle();
		
		Omurgal� o1=new Omurgal�();
		Hayvan h5=o1;//upcasting
		Omurgal� o2=(Omurgal�)h5;//DownCasting
		o2.adSoyle();
	}
}
