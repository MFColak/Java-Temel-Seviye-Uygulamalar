
public class Bool {

	public static void main(String[] args) {
		// Boolean Operat�rler
		boolean a=true, b=false;
		boolean c = a|b;
		boolean d = a&b;
		boolean e=a^b;
		System.out.println("a veya b="+c+" a ve b="+d+" a xor b="+e);
		int num=100, bol=0;
		
		//S�f�ra B�lme hatas�ndan ka��nmak
		//Sadece & ile deneyiniz
		if(bol!=0 && num/bol>10){
			System.out.println("Bu k�sma giremez");
		}
		
	}

}
