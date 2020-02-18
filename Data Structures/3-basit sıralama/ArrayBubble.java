package sort;

public class ArrayBubble {
	private long dizi[];
	private int elemanSayisi;
	
	public ArrayBubble (int max) {
		dizi = new long [max];
		elemanSayisi = 0;
		}
	public void insert (long x) {
		dizi[elemanSayisi] = x;
		elemanSayisi++;
		
		
	}
	
	public void oddEvenSort() 
    { 
        boolean isSorted = false; // Initially array is unsorted 
  
        while (!isSorted) { 
            isSorted = true; 
            long temp = 0; 
  
            // Perform Bubble sort on odd indexed element 
            for (int i = 1; i <= elemanSayisi - 2; i = i + 2) { 
                if (dizi[i] > dizi[i + 1]) { 
                    temp = dizi[i]; 
                    dizi[i] = dizi[i + 1]; 
                    dizi[i + 1] = temp; 
                    isSorted = false; 
                } 
            } 
  
            // Perform Bubble sort on even indexed element 
            for (int i = 0; i <= elemanSayisi - 2; i = i + 2) { 
                if (dizi[i] > dizi[i + 1]) { 
                    temp = dizi[i]; 
                    dizi[i] = dizi[i + 1]; 
                    dizi[i + 1] = temp; 
                    isSorted = false; 
                } 
            } 
        } 
  
        return; 
    }
	
	public void display() {
		for (int i = 0; i<elemanSayisi; i++) {
			System.out.print(" " + dizi[i]);
		}
		System.out.println();
		
	}
	public void sort () {
		for(int i=0; i<elemanSayisi; i++) {
			for(int j=0; j<elemanSayisi-1-i ; j++) {
				if(dizi[j+1]<dizi[j]) {
					swap(j, j+1);
				}
			}
		}
		
	}
	public void swap(int a , int b) {
		long temp =dizi[a];
		dizi[a]=dizi[b];
		dizi[b]=temp;
	}
}
