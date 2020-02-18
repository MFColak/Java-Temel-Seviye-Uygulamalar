class Box{
	double width;
	double height;
	double depth;
	
	//Bir nesnenin kopyas�n� yaratmak
	public Box(Box obj) {
		width=obj.width;
		height=obj.height;
		depth=obj.depth;		
	}
	//�lk de�er vermeden kullan�lan yap�land�r�c�
	public Box() {
		width=0.0;
		height=0.0;
		depth=0.0;
	}
	//de�er atamas� yapan yap�land�r�c�
	public Box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}

	public double volume() {
		return width*height*depth;
	}
}

public class paramObjBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box myBox=new Box();
		Box myBox2=new Box(10, 15, 20);
		
		Box myClone=new Box(myBox2);
		
		double vol=myBox.volume();
		System.out.println("myBox Hacmi="+vol);
		double vol2=myBox2.volume();
		double volClone=myClone.volume();
		System.out.println("myBox2 vol="+vol2+" myClone vol="+volClone);
	}

}
