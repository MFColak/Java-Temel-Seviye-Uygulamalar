
public class Cast {

	public static void main(String[] args) {
		// Cast Dönüþümleri
		int a=257;
		byte b;
		b = (byte) a;
		System.out.println("orjinal sayý="+a+" Byte hali="+b);
		double d = 323.58;
		a = (int) d;
		System.out.println("orjinal sayý="+d+" Ýnt hali="+a);
		b = (byte) d;
		System.out.println("orjinal sayý="+d+" byte hali="+b);
	}
}
