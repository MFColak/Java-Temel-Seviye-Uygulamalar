public class test {

	public static void main(String[] args) {
		// Javada Nesne yaratma yöntemleri
		Box myBox;//Birinci Yöntem
		myBox=new Box();
		Box kutu= new Box();//Ýkinci Yöntem
		kutu.height=112;//Üye deðiþkenlere deðer atamak
		kutu.width=10.2;
		kutu.depth=96;
		double hacim=kutu.volume();//Bir metot çaðýrmak
		System.out.println("Kutunun Hacmi="+hacim);
		kutu.showResult();
		
		int i=kutu.multiply(12,5);//içerisine parametre alan metotlar
		System.out.println(i);
		
		//nesne deðiþkenkerinin birbirine atanmasý
		Box myBox2;
		myBox2=myBox;
		myBox.width=12;
		System.out.println(myBox2.width);
	}
}
