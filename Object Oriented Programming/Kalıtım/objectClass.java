package inheritance;

public class objectClass {
	public static void main(String[] args) {
		Kisi obj=new Kisi("Osman Arda", "01/01/1995", 'E');
		Object o=obj;//Object türünden bir nesneye casting
		//instance of nesnenin tipini sorgular.
		if(o instanceof Kisi) {
			Kisi k=(Kisi)o;//Kisi sýnýfýna Casting gerçekleþir.
			System.out.println(k.getAdSoyad());
			System.out.println(k.getDogumTarihi());
			System.out.println(k.getCinsiyet());
		}
	}
}
