
public class NestedTryCatch {
	public static void main(String[] args) {
		int[] dizi= {1,2};
		try {
			try {
				int a=1, b=0;
				b=a/(a-a);
			}
			catch(ArithmeticException e) {
				System.out.println(e.toString());
			}
			dizi[3]=9;	
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
	}
}
