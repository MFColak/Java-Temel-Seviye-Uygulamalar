
public class TryCatch {

	public static void main(String[] args) {
		//divided by zero Exception
		int a=0, b=0;
		try {
			b = 40 / a;
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		System.out.println("Ýstisina sonrasý");
	}
}
