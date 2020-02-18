import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Kuyruk2 {
	public static void main(String[] args) {
		Queue kuyruk=new LinkedList();
		Stack yigit=new Stack();
		kuyruk.add(1); yigit.push(1);
		kuyruk.add(2); yigit.push(2);
		kuyruk.add(3); yigit.push(3);
		kuyruk.offer(78);
		
		System.out.println(yigit.peek().toString());
		while(!kuyruk.isEmpty()) {
			System.out.println(kuyruk.remove());
		}
		while(!yigit.isEmpty()) {
			System.out.println(yigit.pop());
		}
	}
}
