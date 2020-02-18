import java.util.Scanner;
public class Seasons {
	public static void main(String[] args) {
		// Switch-case Örneði
		int mounth;
		Scanner s=new Scanner(System.in);
		System.out.print("Lütfen 1 ile 12 arasýnda "
				+ "bir ay giriniz:");
		mounth= s.nextInt();
		switch (mounth) {
		case 12:
		case 1:
		case 2:
			System.out.println("Kýþ Mevsimi");
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
			System.out.println("Bir mevsim deðil");	
		}
//		s.close();
	}

}
