import java.util.Scanner;
public class kosul {
	public static void main(String[] args) {
		// Kontrol Ýfadeleri
		int not=0;
		System.out.print("Lütfen Dönem sonu not ort. girin:");
		Scanner s=new Scanner(System.in);
		not=s.nextInt();
		if(not > 100 || not <0) {
			System.out.print("Lütfen 0-100 arasýnda bir not giriniz");
			return;
		}		
		if (not>=90){
			System.out.println("Harf Notunuz: AA");
		}
		else if(not>=85) {
			System.out.println("Harf Notunuz: BA");
		}
		else if(not>=80) {
			System.out.println("Harf Notunuz: BB");
		}
		else if(not>=70) {
			System.out.println("Harf Notunuz: CB");
		}
		else if(not>=60) {
			System.out.println("Harf Notunuz: CC");
		}
		else if(not>=50) {
			System.out.println("Harf Notunuz: DD");
		}
		else {
			System.out.println("Harf Notunuz: FF");
		}
		s.close();
	}
}
