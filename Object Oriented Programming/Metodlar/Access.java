
public class Access {
	int a;
	public int b;
	private int c;
	protected int d;
	
	public void setc(int i) {
		c=i;
	}
	public int getc() {
		return c;
	}
	private int sum() {
		return a+b+c+d;
	}
	public void result() {
		System.out.println("Sayıların toplamı="+sum());
	}
}
