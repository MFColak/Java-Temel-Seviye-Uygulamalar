package arrays;

public class LArray {
	private long[] dizi; // dizi referans�
	//----------------------------
	public LArray(int size) { // constructor
		dizi = new long[size];		// diziyi olu�tur
	} 	
	//---------------------------------
	public void setElem(int index, long value) // set value
	{
		dizi[index] = value;
	}
	//------------------------------------
	public long getElem(int index) // get value
	{
		return dizi[index];
	}
}
