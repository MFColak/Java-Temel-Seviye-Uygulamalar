import java.util.*;
public class Liste {
	
	public static void main(String[] args) {
		ArrayList<Integer> liste=new ArrayList();
		liste.add(1);
		liste.add(2);
		liste.add(3);
		ListIterator i=liste.listIterator();
		while(i.hasNext()) {
			System.out.print("eleman�n indisi= "+i.nextIndex());
			System.out.println(" eleman�n de�eri= "+i.next());
		}
		System.out.println(liste);
		liste.remove(0);//verilen indisteki de�eri siler
		System.out.println(liste);
		liste.add(0,10);//0 nolu indise yeni de�er ekler
		System.out.println(liste);
		System.out.println(liste.get(1));//1 nolu indisteki eleman		
		liste.set(2, 21);//2 nolu indisteki de�eri de�i�tirir
		System.out.println(liste);
		liste.add(15);//Arraylist sonuna de�eri ekler
		System.out.println(liste);
		Collections.sort(liste);
		System.out.println(liste);
	}
	

}
