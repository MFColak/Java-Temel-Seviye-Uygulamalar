public class test {

	public static void main(String[] args) {
		// Javada Nesne yaratma y�ntemleri
		Box myBox;//Birinci Y�ntem
		myBox=new Box();
		Box kutu= new Box();//�kinci Y�ntem
		kutu.height=112;//�ye de�i�kenlere de�er atamak
		kutu.width=10.2;
		kutu.depth=96;
		double hacim=kutu.volume();//Bir metot �a��rmak
		System.out.println("Kutunun Hacmi="+hacim);
		kutu.showResult();
		
		int i=kutu.multiply(12,5);//i�erisine parametre alan metotlar
		System.out.println(i);
		
		//nesne de�i�kenkerinin birbirine atanmas�
		Box myBox2;
		myBox2=myBox;
		myBox.width=12;
		System.out.println(myBox2.width);
	}
}
