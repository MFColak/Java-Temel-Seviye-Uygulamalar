import java.util.HashMap;
import java.util.Set;

public class HashTablosu {
	public static void main(String[] args)
	{
		HashMap<Integer,String>hash=new HashMap<Integer,String>(10,0.75f);
		hash.put(1,"Bir");
		hash.put(2,"�ki");
		hash.put(3,"��");
		hash.put(4,"D�rt");
		Set veri=hash.entrySet();
		Set key=hash.key.Set();
		System.out.println(hash);
		System.out.println(hash.containsKey(1));
		System.out.println(veri);
		System.out.println(key);
	}
	
	
}
