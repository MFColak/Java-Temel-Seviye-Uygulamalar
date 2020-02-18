
public class KuyrukYigit {

	public static void main(String[] args) {
		Kuyruk queue=new Kuyruk();
		Yigit stack=new Yigit();
		
		for (int i=0;i<=3;i++) {
			queue.ekle(i);
			stack.ekle(i);
		}
		while(!queue.isEmpty()) {
			System.out.print(queue.cikar()+" ");
		}
		System.out.println();
		while(!stack.isEmpty()) {
			System.out.print(stack.cikar()+" ");
		}
	}
}
