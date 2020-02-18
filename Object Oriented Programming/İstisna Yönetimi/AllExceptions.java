
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AllExceptions {

	public static void main(String[] args) {
		int sayi=-1;
		System.out.println("L�tfen bir say� giriniz (��kmak i�in -1 giriniz):");
		List<Integer> myList=new ArrayList<Integer>();
		do {
			//sayi=sayiAlv1();
			try {
				
				//sayi=sayiAlv2();
				sayi=sayiAlv3();
			}
			catch(NumberFormatException ex) {
				System.out.println("L�tfen bir sayi giriniz!");
			}
			//Say� -1 den farkli ise ilsteye ekle
			if(sayi!=-1) {
				myList.add(sayi);
			}
		}while(sayi!=-1);
		System.out.println("-----------------------");
		System.out.println("Girdi�iniz Say�lar:");
		System.out.println("-----------------------");
		for (int liste:myList) {
			System.out.print(" "+liste);
		}
	}
	
	public static int sayiAlv1() {
		Scanner in=new Scanner(System.in);
		String sayi=in.next();
		int girilenSayi;
		try {
			girilenSayi=Integer.parseInt(sayi);
		}
		catch(NumberFormatException ex) 
		{
			System.out.println("Sadece bir say� girebilirsiniz.");
			return -1;
		}
		return girilenSayi;
	}
	
	public static int sayiAlv2() throws NumberFormatException{
		Scanner in=new Scanner(System.in);
		String sayi=in.next();
		int girilenSayi;
		girilenSayi=Integer.parseInt(sayi);
		return girilenSayi;
	}
	
	public static int sayiAlv3() throws NumberFormatException{
		Scanner in=new Scanner(System.in);
		String sayi=in.next();
		int girilenSayi;
		try {
			girilenSayi=Integer.parseInt(sayi);
		}
		catch(NumberFormatException ex) 
		{
			throw ex;
		}
		return girilenSayi;
	}
}
