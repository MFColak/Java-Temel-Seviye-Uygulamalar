public class AccsessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access ob=new Access();
		ob.a=10;
		ob.b=20;
		//ob.c=30 Eriþilemez
		ob.d=40;
		ob.setc(30);//Setter Metodu
		//ob.sum(); Eriþilemez
		ob.result();
		//Getter Metodu
		System.out.println("c nin deðeri="+ob.getc());
	}
}
