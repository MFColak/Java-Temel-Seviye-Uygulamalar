
public class specialForLoop {

	public static void main(String[] args) {
		// TODO Dizi i�eri�inin for ile g�sterilmesi
		int[] dizi= {1, 3, 5, 7};
		for (int i=0; i<dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		System.out.println("Di�er Y�ntem");
		for (int temp:dizi)
		{
			System.out.println(temp);
		}
	}

}
