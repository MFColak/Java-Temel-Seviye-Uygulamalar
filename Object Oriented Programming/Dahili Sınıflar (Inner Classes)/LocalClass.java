package Inner;

interface function{
	public double kareAl(double sayi);
}

public class LocalClass {
	public double square(double num) {
		//Yerel Sýnýf Tanýmý
		class kareAlma implements function{
			@Override
			public double kareAl(double sayi) {
				return sayi*sayi;
			}
		}
		kareAlma obj=new kareAlma();
		return obj.kareAl(num);
	}
	
	public static void main(String[] args) {
		LocalClass lc=new LocalClass();
		System.out.println(lc.square(12));
	}
}
