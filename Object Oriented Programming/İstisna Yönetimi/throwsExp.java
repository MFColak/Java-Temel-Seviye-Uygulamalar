
public class throwsExp {
	private int[] dizi=new int[] {1, 2, 3, 4};
	public int method(int index) throws Exception{
		return dizi[index];
	}
	
	public static void main(String[] args) {
		throwsExp obj=new throwsExp();
		
		for (int i=0;i<=4;i++) {
			int sayi;
			try {
				sayi = obj.method(i);
				System.out.println("Sayimiz:"+sayi);
			} catch (Exception e) {
				e.printStackTrace();
			}
		    
		}
	}
}
