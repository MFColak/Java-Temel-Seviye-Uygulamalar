package recursive;

import java.util.Scanner;

public class FibIterative {

	public static void main(String[] args) {
		System.out.println("Bir sayý giriniz:");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		long startTime= System.currentTimeMillis();
		long sonuc = fibRec(sayi); // long sonuc = fibonacci(sayi);
		long endTime = System.currentTimeMillis();
		double totalTime = (endTime-startTime)/1000.0;
		System.out.println(sayi+". fibonacci terimi:"+sonuc);
		System.out.println(totalTime);
		input.close();
	}

	public static long fibRec(int n) { // recursive uygulamasý
		if ((n==0)||(n==1))
			return n;
		else 
			return fibRec(n-1) + fibRec(n-2);
	}
	
	public static long fibonacci(int n) { //iteratif uygulamasý
		long preNumber=0;
		long prepreNumber;
		long current=1;
		
		for (int i = 1; i < n; i++) {
			prepreNumber = preNumber;
			preNumber = current;
			current = preNumber + prepreNumber;
		}
		return current;
	}
}
