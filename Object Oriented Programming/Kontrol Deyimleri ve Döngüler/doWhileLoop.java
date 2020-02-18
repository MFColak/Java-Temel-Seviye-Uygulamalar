import java.util.Scanner;

public class doWhileLoop {

	public static void main(String[] args) {
		// do-while döngüsü Öreði
		double num=0.0;
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("Programdan çýkmak için sýfýr giriniz:");
			System.out.print("Lütfen bir sayý giriniz:");
			num=s.nextDouble();
			double root=Math.sqrt(num);
			System.out.println("Girilen sayý="+num +" sayýnýn karekökü="+root);
			System.out.println("--------------------");
		}while(num !=0);
		System.out.println("Programdan çýkýlýyor...");
		s.close();
	}

}
