class Test{
	public int a, b;
	public Test( int i, int j) {
		a=i;
		b=j;
	}
	boolean equals(Test obj) {
		if(a==obj.a && b==obj.b) 
			return true;
		else
			return false;
	}
}
public class objectPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ob1=new Test(100, 200);
		Test obj2=new Test(100, 200);
		Test obj3= new Test(1, 1);
		
		System.out.println("ob1 == ob2: "+ob1.equals(obj2));
		System.out.println("ob1 == ob3: "+ob1.equals(obj3));
	}
}
