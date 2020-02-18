package arrays;

public class LArray {
	private long[] dizi; // dizi referansý
	//----------------------------
	public LArray(int size) { // constructor
		dizi = new long[size];		// diziyi oluþtur
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
