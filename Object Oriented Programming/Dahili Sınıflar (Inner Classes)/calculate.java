package Inner;

public class calculate {
	public class Bolme{
		public double bol(double a,double b) {
			return a/b;
		}
	}
	public static class Toplama{
		public static int topla(int a,int b) {
			return a+b;
		}
	}

	public static void main(String[] args) {
		double sonuc;
		calculate.Bolme obj=new calculate().new Bolme();
		sonuc=obj.bol(12, 5);
		System.out.println(sonuc);
		//static oldu�u i�in this ba�lant�s�n� kaybeder
		//calculate.Toplama tp=new calculate().new Toplama();//Hata
		calculate.Toplama tp2=new Toplama();
		tp2.topla(12, 18);
		sonuc=Toplama.topla(12, 9);//Nesnesiz eri�im
		System.out.println((int)sonuc);
	}
}
