import java.util.Scanner;

public class doWhileLoop {

	public static void main(String[] args) {
		// do-while d�ng�s� �re�i
		double num=0.0;
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("Programdan ��kmak i�in s�f�r giriniz:");
			System.out.print("L�tfen bir say� giriniz:");
			num=s.nextDouble();
			double root=Math.sqrt(num);
			System.out.println("Girilen say�="+num +" say�n�n karek�k�="+root);
			System.out.println("--------------------");
		}while(num !=0);
		System.out.println("Programdan ��k�l�yor...");
		s.close();
	}

}
