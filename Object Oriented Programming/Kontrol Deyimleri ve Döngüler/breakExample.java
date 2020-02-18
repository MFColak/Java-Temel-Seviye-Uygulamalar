
public class breakExample {

	public static void main(String[] args) {
		// TODO break Örneði
		for(int i=-7; i<7; i++) {
			if(i<0) {
				continue;
			}
			else if(i>0) {
				break;
			}
			else {
				System.out.println(i);
			}
		}
	}
}
