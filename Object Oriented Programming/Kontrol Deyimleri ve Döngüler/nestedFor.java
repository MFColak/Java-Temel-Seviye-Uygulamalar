import java.util.Scanner;
public class nestedFor {
	public static void main(String[] args) {
		// TODO i�-i�e d�ng�ler
		Scanner input=new Scanner(System.in);
		System.out.print("Bir say� Giriniz:");
		int num = input.nextInt();
		if (num<1) {
			return;
		}else {
			for (int i=1;i<=num;i++) {
				for (int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
