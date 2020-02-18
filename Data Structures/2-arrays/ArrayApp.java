package arrays;

public class ArrayApp {
	public static void main(String[] args)
     {
	long[] dizi;                  // dizi referansý
	dizi = new long[100];         // dizi oluþturma
	int elemanSayisi = 0;     	// eleman sayýsý
    int j;                       	// dongu sayacý
    long searchKey;              	// arama anahtarý
    
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
    
    for(j=0; j<elemanSayisi; j++)      // elemanlarý listele
        System.out.print(dizi[j] + " ");
     System.out.println("");
     
     //--------------------------------------------------------
     searchKey = 66;					// 66 degerini ara
     for(j=0; j<elemanSayisi; j++)     	// tüm elemanlar için,
         if(dizi[j] == searchKey)    	// eleman mevcut mu?
        	 break;  					// evet, dongu sonlanmadan bitir
     if(j == elemanSayisi)  			// dizi sonunda mý?
    	 System.out.println(searchKey + " bulunamadý");
     else
         System.out.println(searchKey + " bulundu");
     //-----------------------------------------------------------
     
     searchKey = 55;             		// 55 degerini sil
     for(j=0; j<elemanSayisi; j++)     // deger aranýyor
     if(dizi[j] == searchKey)
        break;
     for(int k=j; k<elemanSayisi; k++) // üst elemanlarý kaydýr
         dizi[k] = dizi[k+1];
     elemanSayisi--;  
     
     //----------------------------------------------------------
     
     for(j=0; j<elemanSayisi; j++)      // elemanlarý listele
         System.out.print( dizi[j] + " ");
      System.out.println("");
     }
}
