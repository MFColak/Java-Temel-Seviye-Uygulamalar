package shellSort;

public class ShellSortApp {

	public static void main(String[] args) {
		int maxSize=10;
		ArrayShell dizi = new ArrayShell(maxSize);
		
		for (int i = 0; i < maxSize; i++)
		{
			long n = (int)(java.lang.Math.random()*99);
			dizi.insert(n);
		}
		dizi.display();
		dizi.shellSort();
		dizi.display();
		
	}

}
