package mergeSort;

public class DArray {
	private long[] theArray;
	private int elemanSayisi;
	
	public DArray(int max) {
		theArray = new long[max];
		elemanSayisi = 0;
	}
	
	public void insert(long value) {
		theArray[elemanSayisi]=value;
		elemanSayisi++;
	}
	
	public void display() {
		for (int i =0; i<elemanSayisi; i++)
			System.out.print(theArray[i] + " ");
		System.out.println("");
	}
	
	public void mergeSort() {
		long[] workSpace = new long[elemanSayisi];
		recMergeSort(workSpace, 0 , elemanSayisi-1);
	}
	
	private void recMergeSort (long[] workSpace, int lowerBound, int upperBound) {
		if (lowerBound == upperBound)
			return;
		else {
			int mid = (lowerBound+upperBound) / 2;
			recMergeSort(workSpace, lowerBound, mid);
			recMergeSort(workSpace, mid+ 1, upperBound);
			merge(workSpace, lowerBound, mid+1, upperBound);
		}
	}
	
	private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {
		int j=0; // workspace index
		int lowerBound =lowPtr;
		int mid = highPtr-1;
		int n = upperBound - lowerBound + 1;
		
		while (lowPtr <= mid && highPtr <= upperBound)
			if (theArray[lowPtr]<theArray[highPtr])
				workSpace[j++] = theArray[lowPtr++];
			else
				workSpace[j++] = theArray[highPtr++];
			
		while (lowPtr <=mid)
			workSpace[j++]= theArray[lowPtr++];
		
		while (highPtr<=upperBound)
			workSpace[j++]=theArray[highPtr++];
		
		for (j=0; j<n ; j++)
			theArray[lowerBound + j] = workSpace[j];
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
 