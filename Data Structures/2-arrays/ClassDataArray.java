package arrays;

public class ClassDataArray {
	private Person[] dizi;
	private int elelmanSayisi;

	public ClassDataArray(int max) {
		dizi = new Person[max];
		elelmanSayisi = 0;
	}

	// -------------------------------------------------
	public Person find(String searchName) {
		int j;
		for (j = 0; j < elelmanSayisi; j++)
			if (dizi[j].getSoyad().equals(searchName))
				break;
		if (j == elelmanSayisi) // sona ulaþtý mý?
			return null;
		else
			return dizi[j];
	}

	// --------------------------------------------------------
	public void insert(String last, String first, int age) {
		dizi[elelmanSayisi] = new Person(last, first, age);
		elelmanSayisi++;
	}

	// --------------------------------------------------
	public boolean delete(String searchName) { // belirtilen kaydý sil
		int j;
		for (j = 0; j < elelmanSayisi; j++) // ara
			if (dizi[j].getSoyad().equals(searchName))
				break;
		if (j == elelmanSayisi) // bulunamadý
			return false;
		else                               		// bulundu
        {
        for(int k=j; k<elelmanSayisi; k++)     // aþaðý kaydýr
           dizi[k] = dizi[k+1];
        elelmanSayisi--;                       // boyutu azalt
        return true;
        }
	}
	//----------------------------
	public void displayA(){						// listele
	      for(int j=0; j<elelmanSayisi; j++)       
	         dizi[j].displayPerson();        
	}
}
