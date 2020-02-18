
public class nestedIF {

	public static void main(String[] args) {
		// Ýç-içe ifler
		int i=10, j=12, k=5, c=0;
		if (i==10) {
			if(j<=20) {
				c=k;
			}
			else {
				c = k * k;
			}
		}
		else {
			c=-k;
		}

	}

}
