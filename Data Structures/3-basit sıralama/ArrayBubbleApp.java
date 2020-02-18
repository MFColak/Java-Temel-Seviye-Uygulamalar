package sort;
import java.util.*;
public class ArrayBubbleApp {

	public static void main(String[] args) {
		ArrayBubble array = new ArrayBubble(200000);
		for (int i = 0; i < 100000; i++) {
			array.insert((long)(Math.random()*1000));	
		}
		long startTime = System.currentTimeMillis();
		array.oddEvenSort();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime/1000);
		//
	}
}
