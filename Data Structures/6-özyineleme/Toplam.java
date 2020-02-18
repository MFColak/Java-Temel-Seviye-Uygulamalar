package recursive;

import java.util.Scanner;

public class Toplam {
	public static void main(String[] args) {
		System.out.println("Bir sayý giriniz:");
		Scanner input =new Scanner(System.in);
		int sayi = input.nextInt();
		int sonuc = fakt(sayi);
		System.out.println("Faktöryel="+sonuc);
		input.close();
	}
	
	public static int fakt(int n) {
		if (n==1)
			return 1;
		else return (n * fakt(n-1));
	}
	
	public static int toplam2(int n) {
		System.out.println("Girdi-n:"+n);
		if (n==1)
		{
			System.out.println("Dönen: 1");
			return 1;
		}
		else {
			int temp = n+toplam2(n-1);
			System.out.println("Dönen :"+temp);
			return temp;
		}
	}
	
	
	
	
	
	
	
	
	
	
}
