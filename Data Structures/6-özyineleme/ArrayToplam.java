package recursive;

public class ArrayToplam {
	
	
	public static void main(String[] args) {
		 int dizi[]= {1,2,3,4,5};
		System.out.println(toplam(dizi,dizi.length));
	}
	
	public static int toplam(int A[],int n) {
		if (n==0)
			return 0;
		if (A[n-1] % 2 == 1)
			return toplam(A,n-1);
		return(toplam(A,n-1)+A[n-1]);
	}
}