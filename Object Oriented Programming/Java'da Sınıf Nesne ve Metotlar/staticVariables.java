class values{
	public static int staticNum;
	public int num;
	public static final double pi=3.14;
}
public class staticVariables {

	public static void main(String[] args) {
		values val1=new values();
		values val2=new values();
		val1.staticNum=5;
		val2.num=9;
		System.out.println("static="+val1.staticNum+" normal="+val1.num);
		System.out.println("static="+val2.staticNum+" normal="+val2.num);
		values.staticNum=11;
		System.out.println("val1.static="+val1.staticNum+" val2.static="+val2.staticNum);
		System.out.println("Sabitimiz="+values.pi);
	}
}
