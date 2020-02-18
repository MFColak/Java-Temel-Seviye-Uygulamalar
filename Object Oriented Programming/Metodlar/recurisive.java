import java.util.Scanner;

public class recurisive {
	public static int fact(int i) {
		if(i==1) {
			return 1;
		} 
		int result =i * fact(i-1);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Bir sayý giriniz:");
		int sayi=s.nextInt();
		int i=recurisive.fact(sayi);
		System.out.println("faktoryel="+i);
		Test ts=new Test(1, 2);
	}
}
