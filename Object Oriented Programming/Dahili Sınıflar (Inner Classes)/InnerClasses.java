package Inner;

public class InnerClasses {
	public boolean ck;
	//Asal Sayýlarý bulan inner class
	public class Asal{
		public boolean asalSayi(int sayi) {
			int num=0;
			boolean check=false;
			if(sayi>1) {
				for (int i=2;i<sayi;i++) {
					if (sayi%i==0) {
						num++;
					}
				}
				if(num==0)
					check=true;
				else
					check=false;
			}
			
			return check;
		}
	}//inner class sonu
	
	protected class PerfectNumber{
		protected boolean isPerfect(int num) {
			int sum=0;
			boolean check;
			for (int i=1;i<num;i++) {
				if(num%i==0)
					sum+=i;
			}
			if(num==sum)
				check=true;
			else
				check=false;
			return check;
		}
	}	
}
