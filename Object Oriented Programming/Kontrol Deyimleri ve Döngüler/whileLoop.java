import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Girdi�iniz say�ya kadar olan"
				+ "t�m say�lar�n karelerini hesaplayan program");
		System.out.print("L�tfen bir say� giriniz:");
		int num=s.nextInt();
		int count=1;
		while (count <= num) {
			System.out.println("Sayac="+count+" Sayac�n karesi="+count*count);
			count++;
		}
		s.close();
	}
}
