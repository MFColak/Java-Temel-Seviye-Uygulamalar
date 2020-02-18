class refTest{
	int a, b;
	
	refTest(int i, int j){
		a=i;
		b=j;
	}
	void transVar(int a, int b) {
		this.a=a*2;
		this.b=b*2;
	}
	
	void transRef(refTest obj) {
		obj.a *=2;
		obj.b *=2;
	}
	public refTest inc() {
		refTest temp=new refTest(a+1,b+1);
		return temp;
	}
		
}
public class transferParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		refTest ob=new refTest(10, 20);
		System.out.println("metottan Önce a="+a+" b="+b);
		System.out.println("metottan Önce obj.a="+ob.a+" obj.b="+ob.b);
		ob.transVar(a, b);
		ob.transRef(ob);
		System.out.println("metottan Sonra a="+a+" b="+b);
		System.out.println("metottan Sonra obj.a="+ob.a+" obj.b="+ob.b);
		refTest ob1=new refTest(2, 3);
		refTest ob2=ob1.inc();
		System.out.println("a= "+ob1.a+ " b= "+ob1.b);
		System.out.println("a= "+ob2.a+ " b= "+ob2.b);
	}
}
