import java.util.Scanner;
public class Seasons {
	public static void main(String[] args) {
		// Switch-case �rne�i
		int mounth;
		Scanner s=new Scanner(System.in);
		System.out.print("L�tfen 1 ile 12 aras�nda "
				+ "bir ay giriniz:");
		mounth= s.nextInt();
		switch (mounth) {
		case 12:
		case 1:
		case 2:
			System.out.println("K�� Mevsimi");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Bahar Mevsimi");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Yaz Mevsimi");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Sonbahar Mevsimi");
			break;
		default:
			System.out.println("Bir mevsim de�il");	
		}
//		s.close();
	}

}
