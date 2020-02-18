package stack;

public class StackApp {

	public static void main(String[] args) {
		Stack theStack =new Stack(10);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		System.out.println(theStack.pop());
		
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.print(value+" ");
		}
	}
}
