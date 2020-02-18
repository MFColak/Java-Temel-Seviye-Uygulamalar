
public class Bool {

	public static void main(String[] args) {
		// Boolean Operatörler
		boolean a=true, b=false;
		boolean c = a|b;
		boolean d = a&b;
		boolean e=a^b;
		System.out.println("a veya b="+c+" a ve b="+d+" a xor b="+e);
		int num=100, bol=0;
		
		//Sýfýra Bölme hatasýndan kaçýnmak
		//Sadece & ile deneyiniz
		if(bol!=0 && num/bol>10){
			System.out.println("Bu kýsma giremez");
		}
		
	}

}
