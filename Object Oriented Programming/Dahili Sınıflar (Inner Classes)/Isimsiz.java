package Inner;

interface Toplayici {
	   public int hesaplamaYap() ;
	}

	public class Isimsiz {

	   public Toplayici topla(final int a, final int b) {
	      return new Toplayici() {
	    	 @Override
	         public int hesaplamaYap() {

	            // final olan yerel degiskenlere ulasabilir. 
	            return a + b ; 
	         }
	      }; // noktali virgul sart

	   } // topla, metot sonu


	   public static void main(String args[]) {

	      Isimsiz Isz = new Isimsiz();
	      Toplayici t = Isz.topla(5,9);
	      int sonuc = t.hesaplamaYap();
	      System.out.println("Sonuc = 5 + 9 = " + sonuc );
	   }
	} // class Isimsiz
