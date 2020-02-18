package arrays;

public class ArrayApp {
	public static void main(String[] args)
     {
	long[] dizi;                  // dizi referans�
	dizi = new long[100];         // dizi olu�turma
	int elemanSayisi = 0;     	// eleman say�s�
    int j;                       	// dongu sayac�
    long searchKey;              	// arama anahtar�
    
    //---------------------------------------------------
    
    dizi[0] = 77;
    dizi[1] = 99;
    dizi[2] = 44;
    dizi[3] = 55;
    dizi[4] = 22;
    dizi[5] = 88;
    dizi[6] = 11;
    dizi[7] = 00;
    dizi[8] = 66;
    dizi[9] = 33;
    elemanSayisi = 10;            // 10 deger eklendi
    
    //--------------------------------------------------
    
    for(j=0; j<elemanSayisi; j++)      // elemanlar� listele
        System.out.print(dizi[j] + " ");
     System.out.println("");
     
     //--------------------------------------------------------
     searchKey = 66;					// 66 degerini ara
     for(j=0; j<elemanSayisi; j++)     	// t�m elemanlar i�in,
         if(dizi[j] == searchKey)    	// eleman mevcut mu?
        	 break;  					// evet, dongu sonlanmadan bitir
     if(j == elemanSayisi)  			// dizi sonunda m�?
    	 System.out.println(searchKey + " bulunamad�");
     else
         System.out.println(searchKey + " bulundu");
     //-----------------------------------------------------------
     
     searchKey = 55;             		// 55 degerini sil
     for(j=0; j<elemanSayisi; j++)     // deger aran�yor
     if(dizi[j] == searchKey)
        break;
     for(int k=j; k<elemanSayisi; k++) // �st elemanlar� kayd�r
         dizi[k] = dizi[k+1];
     elemanSayisi--;  
     
     //----------------------------------------------------------
     
     for(j=0; j<elemanSayisi; j++)      // elemanlar� listele
         System.out.print( dizi[j] + " ");
      System.out.println("");
     }
}
