import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Girdiðiniz sayýya kadar olan"
				+ "tüm sayýlarýn karelerini hesaplayan program");
		System.out.print("Lütfen bir sayý giriniz:");
		int num=s.nextInt();
		int count=1;
		while (count <= num) {
			System.out.println("Sayac="+count+" Sayacýn karesi="+count*count);
			count++;
		}
		s.close();
	}
}
