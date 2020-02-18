
public class specialForLoop {

	public static void main(String[] args) {
		// TODO Dizi içeriðinin for ile gösterilmesi
		int[] dizi= {1, 3, 5, 7};
		for (int i=0; i<dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		System.out.println("Diðer Yöntem");
		for (int temp:dizi)
		{
			System.out.println(temp);
		}
	}

}
