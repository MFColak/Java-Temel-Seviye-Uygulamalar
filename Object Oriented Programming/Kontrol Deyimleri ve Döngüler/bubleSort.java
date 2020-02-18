import java.util.Random;

public class bubleSort {

	public static void main(String[] args) {
		// TODO Kabarcýk Sýralama Algoritmasý
		int[] dizi =new int[4];
		Random rnd=new Random();
		//Dizinin rastgele sayýlarla doldurulmasý
		for(int i=0; i<4;i++) {
			dizi[i]=rnd.nextInt(100);
			System.out.println("dizi["+i+"]="+dizi[i]);
		}
		//Sýralama algoritmasý
		for(int i=1; i<dizi.length;i++) {
			for(int j=dizi.length-1; j>=i; j--) {
				if(dizi[j]<dizi[j-1]) {
					int temp = dizi[j];
					dizi[j]=dizi[j-1];
					dizi[j-1]=temp;
				}	
			}
		}
		//Sýralanmýþ dizinin ekrana basýmý
		for(int array :dizi) {
			System.out.print(array+"-");
		}
	}
}
