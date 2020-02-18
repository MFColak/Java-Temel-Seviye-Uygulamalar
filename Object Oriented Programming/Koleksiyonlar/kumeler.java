import java.util.HashSet;
import java.util.Iterator;

class kumeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hSet=new HashSet();
		String[] s= {"Ali","Ahmet","Mehmet","Fatma","Ali"};
		boolean chk;
		for (String temp:s) {
			chk=hSet.add(temp);//Kümeye Ekle
			if(!chk) {
				System.out.println("Kopya eleman bulundu!");
			}
		}
		//eleman silmek
		hSet.add(123+123);
		hSet.add(231.3445);
		hSet.add(true);
		hSet.remove("Fatma");
		System.out.println(hSet.size());
		Iterator i=hSet.iterator();
		while (i.hasNext()) {
			System.out.println("Eleman="+i.next());
		}
	}
}
