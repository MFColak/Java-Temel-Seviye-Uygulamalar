import java.util.Scanner;
public class nestedFor {
	public static void main(String[] args) {
		// TODO iç-içe döngüler
		Scanner input=new Scanner(System.in);
		System.out.print("Bir sayý Giriniz:");
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
