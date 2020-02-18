package sort;

public class ObjectArrayInsertion {
	private Person[] dizi;
	private int elemanSayisi;
	
	public ObjectArrayInsertion(int max)
	{
		dizi = new Person[max];
		elemanSayisi=0;
	}
	
	public void insert(String last, String first, int age) {
		dizi[elemanSayisi]=new Person (last,first,age);
		elemanSayisi++;
	}
	
	public void display() {
		for (int i=0; i<elemanSayisi; i++)
			dizi[i].displayPerson();
	}
	
	public void insertionSort() {
		int i,j;
		for (i=1;i<elemanSayisi;i++) {
			Person temp = dizi[i];
			j=i;
			while (j>0 && dizi[j-1].getSoyad().compareTo(temp.getSoyad())>=0)
			{
				dizi[j]= dizi[j-1];
				--j;
			}
			dizi[j]=temp;
		}
	}
	
	
		
}
