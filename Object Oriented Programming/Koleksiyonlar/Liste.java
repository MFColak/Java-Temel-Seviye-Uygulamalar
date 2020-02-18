import java.util.*;
public class Liste {
	
	public static void main(String[] args) {
		ArrayList<Integer> liste=new ArrayList();
		liste.add(1);
		liste.add(2);
		liste.add(3);
		ListIterator i=liste.listIterator();
		while(i.hasNext()) {
			System.out.print("elemanýn indisi= "+i.nextIndex());
			System.out.println(" elemanýn deðeri= "+i.next());
		}
		System.out.println(liste);
		liste.remove(0);//verilen indisteki deðeri siler
		System.out.println(liste);
		liste.add(0,10);//0 nolu indise yeni deðer ekler
		System.out.println(liste);
		System.out.println(liste.get(1));//1 nolu indisteki eleman		
		liste.set(2, 21);//2 nolu indisteki deðeri deðiþtirir
		System.out.println(liste);
		liste.add(15);//Arraylist sonuna deðeri ekler
		System.out.println(liste);
		Collections.sort(liste);
		System.out.println(liste);
	}
	

}
