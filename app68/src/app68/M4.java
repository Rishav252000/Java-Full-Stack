package app68;

import java.util.PriorityQueue;
import java.util.Queue;

public class M4 {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(123);
		queue.add(1234);
		queue.add(12345);
		queue.add(100);
		queue.add(123456);
		queue.add(1234567);
		System.out.println(queue);
		System.out.println(queue.poll()); 
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
