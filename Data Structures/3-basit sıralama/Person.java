package sort;

public class Person {
	private String soyadi;
	private String adi;
	private int yas;

	public Person(String last, String first, int a) {
		soyadi = last;
		adi = first;
		yas = a;
	}

	public void displayPerson() {
		System.out.print("   Soyad: " + soyadi);
		System.out.print(", Ad: " + adi);
		System.out.println(", Yaþ: " + yas);
	}
	public String getSoyad()           // get soyadi
	   { 
		return soyadi;
	   }
}
