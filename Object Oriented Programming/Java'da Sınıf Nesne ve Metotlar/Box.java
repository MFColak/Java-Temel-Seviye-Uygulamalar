
public class Box{
	double width;
	double height;
	public double depth;
	private String size;
	protected String type;
	
	public Box() {
		width=0.0;
		height=0.0;
		depth=0.0;
		size="";
		type="";
	}
	public Box(double w,double h,double d, String s, String t){
		width=w;
		height=h;
		depth=d;
		size=s;
		type=t;
	}

	public double volume() {
		return width*height*depth;
	}
	int multiply(int num1, int num2) {
		return num1 * num2;
	}
	void showResult() {
		double vol=this.volume();
		System.out.println(vol);
	}
	public String getSize() {
		return this.size;
	}
	public void setSize(String s) {
		size=s;
	}
}
