package Inner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClasses.Asal asal=new InnerClasses().new Asal();
		boolean sonuc=asal.asalSayi(101);
		System.out.println(sonuc);
		
		InnerClasses.PerfectNumber perfect=new InnerClasses().new PerfectNumber();
		System.out.println(perfect.isPerfect(8128));
		
		calculate.Toplama.topla(12, 7);
	}

}
