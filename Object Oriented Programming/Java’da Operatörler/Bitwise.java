
public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=64, b, c;
		int i;
		i=a<<2;//a yý 4 ile çarpýyoruz
		b=(byte)(a<<2);//En öncelikli biti kaybettik
		c=(byte) (a>>2);//a yý ikiye böldük
		System.out.println("a="+a+" i="+i+" ve b="+b+" c="+c);
	}
}
