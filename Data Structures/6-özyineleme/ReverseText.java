package recursive;

import java.util.Scanner;

public class ReverseText {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Metin Giriniz: ");
		String metin = input.nextLine();

		System.out.println(reverse(metin));
	}

	public static String reverse(String metin) {
		if (metin.length() == 0)
			return metin;
		else {
			int n = metin.length();
			return metin.charAt(n - 1) + reverse(metin.substring(0, n - 1));
		}
	}
}
