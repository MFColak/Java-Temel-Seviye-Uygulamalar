
public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=64, b, c;
		int i;
		i=a<<2;//a y� 4 ile �arp�yoruz
		b=(byte)(a<<2);//En �ncelikli biti kaybettik
		c=(byte) (a>>2);//a y� ikiye b�ld�k
		System.out.println("a="+a+" i="+i+" ve b="+b+" c="+c);
	}
}
