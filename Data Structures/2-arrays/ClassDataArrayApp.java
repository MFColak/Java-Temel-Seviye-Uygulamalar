package arrays;

public class ClassDataArrayApp {

	public static void main(String[] args) {
		int maxSize = 100;
		ClassDataArray dizi;
		dizi = new ClassDataArray(maxSize);

		dizi.insert("Evans", "Patty", 24);
		dizi.insert("Smith", "Lorraine", 37);
		dizi.insert("Yee", "Tom", 43);
		dizi.insert("Adams", "Henry", 63);
		dizi.insert("Hashimoto", "Sato", 21);
		dizi.insert("Stimson", "Henry", 29);
		dizi.insert("Velasquez", "Jose", 72);
		dizi.insert("Lamarque", "Henry", 54);
		dizi.insert("Vang", "Minh", 22);
		dizi.insert("Creswell", "Lucinda", 18);

		dizi.displayA();
		String searchKey = "Stimson";
		Person found;
		found = dizi.find(searchKey);

		if (found != null) {
			System.out.print("Found ");
			found.displayPerson();
		} else
			System.out.println("Can't find " + searchKey);

		System.out.println("Deleting Smith, Yee, and Creswell");
		dizi.delete("Smith");
		dizi.delete("Yee");
		dizi.delete("Creswell");
		
		dizi.displayA(); 
	}

}
