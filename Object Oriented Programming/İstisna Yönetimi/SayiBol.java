import java.util.Scanner;

public class SayiBol {
	public static int sayiBol(int bolunen, int bolen) {
		if (bolen==0)
			throw new ArithmeticException("Sayý sýfýrdan farklý olmalý");
		else
			return bolunen /bolen;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Birinci sayý:");
			int a= s.nextInt();
			System.out.println("Ýkinci sayý:");
			int b= s.nextInt();
			System.out.println("Sonuc: "+sayiBol(a, b));
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
