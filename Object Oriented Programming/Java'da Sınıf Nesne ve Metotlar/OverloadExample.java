
public class OverloadExample {
	
	public int sum(int num1, int num2) {
		return num1+num2;	
	}
	public int sum(int num1,int num2, int num3) {
		return num1+num2+num3;
	}
	public double sum (double num1,double num2,double num3) {
		return num1+num2+num3;
	}

	public static void main(String[] args) {
		OverloadExample over=new OverloadExample();
		int sum1=over.sum(12, 24);
		int sum2=over.sum(12, 24, 36);
		double sum3=over.sum(4.7, 7.8, 16.0);
		System.out.println("sum1="+sum1+" sum2="+sum2+" sum3="+sum3);
	}
}
