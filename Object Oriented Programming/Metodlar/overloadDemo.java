class Overload{
	public void test() {
		System.out.println("Hiç parametre yok");
	}
	public void test(int a) {
		System.out.println("a= "+a);
	}
	public void test(int a,int b) {
		System.out.println("a= "+ a + " b= "+ b);
	}
	public double test(double a) {
		System.out.println("double a= "+a);
		return a*a;
	}
}
public class overloadDemo {

	public static void main(String[] args) {
		// Bütün Test versiyonlarýný çaðýralým.
		Overload o=new Overload();
		o.test();
		o.test(12);
		o.test(12, 16);
		double result=o.test(12.34);
		System.out.println("o.test(12.34)'ün çýktýsý="+result);
	}

}
