
public class ArrayOutOfIndex {

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4, 5};
		int a=0, b=0;
		try {
			System.out.println("Try Bloðu");
			a = 20 / b;
			System.out.println("array[6]="+array[6]);
			
		}
		
		catch(ArithmeticException e) {
			System.err.println(e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("Dizi indeks hatasý!");
		}
	}
}
