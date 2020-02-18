package quickSort;

public class ArrayQuick {
	private long[] dizi;
	private int elemanSayisi;

	public ArrayQuick(int max) {
		dizi = new long[max];
		elemanSayisi = 0;
	}

	public void insert(long value) {
		dizi[elemanSayisi] = value;
		elemanSayisi++;
	}

	public void display() {
		for (int i = 0; i < elemanSayisi; i++)
			System.out.print(dizi[i] + " ");
		System.out.println("");
	}
	
	public void quickSort() {
		recQuickSort(0,elemanSayisi-1);
	}
	
	public void recQuickSort(int left, int right) {
		if (right -left <=0)
			return;
		else {
			long pivot = dizi[right];
			
			int partition = partitionIt(left, right, pivot);
			recQuickSort(left, partition-1);
			recQuickSort(partition+1,right);
		}
	}
	
	public int partitionIt(int left, int right, long pivot) {
		int leftPtr =left -1;
		int rightPtr = right;
		
		while (true) {
			while (dizi[++leftPtr]<pivot);
			while (rightPtr > 0 && dizi[--rightPtr] > pivot);
			
			if (leftPtr>=rightPtr)
				break;
			else
				swap(leftPtr,rightPtr);
		}
		swap(leftPtr,right);
		return leftPtr;
	}
	
	public void swap (int dex1,int dex2) {
		long temp = dizi[dex1];
		dizi[dex1]=dizi[dex2];
		dizi[dex2]=temp;
	}
	
	
	
	
	
	
}
