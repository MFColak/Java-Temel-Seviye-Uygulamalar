public class AccsessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access ob=new Access();
		ob.a=10;
		ob.b=20;
		//ob.c=30 Eri�ilemez
		ob.d=40;
		ob.setc(30);//Setter Metodu
		//ob.sum(); Eri�ilemez
		ob.result();
		//Getter Metodu
		System.out.println("c nin de�eri="+ob.getc());
	}
}
