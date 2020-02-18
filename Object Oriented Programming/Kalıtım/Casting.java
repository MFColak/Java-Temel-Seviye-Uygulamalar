package inheritance;
class Canli{	
	public void adSoyle() {
		System.out.println("Canlý Sýnýfý");
	}
}

class Hayvan extends Canli{	
	public void adSoyle() {
		System.out.println("Hayvan Sýnýfý");
	}
}

class Omurgalý extends Hayvan{
	public void adSoyle() {
		System.out.println("Omurgalý Sýnýfý");
	}
}

class Omurgasýz extends Hayvan{
	public void adSoyle() {
		System.out.println("Omurgasýz Sýnýfý");
	}
}

public class Casting {
	public static void main(String[] args) {
		Canli c=new Canli();//Casting yok
		c.adSoyle();
		Canli h1=new Hayvan();//Upcasting
		h1.adSoyle();
		Canli h2=(Canli)new Hayvan();//Upcasting Yöntem 2
		h2.adSoyle();
		
		Hayvan h3=new Hayvan();
		Canli c2=h3;//Upcasting
		c2.adSoyle();
		Hayvan h4=(Hayvan)c2;//Downcasting
		c2.adSoyle();
		
		Omurgalý o1=new Omurgalý();
		Hayvan h5=o1;//upcasting
		Omurgalý o2=(Omurgalý)h5;//DownCasting
		o2.adSoyle();
	}
}
