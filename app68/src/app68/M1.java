package app68;

import java.util.LinkedList;

public class M1 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1007);
		list.add(1006);
		list.add(1005);
		list.add(1004);
		list.add(1003);
		list.add(1002);
		list.add(1001);
		
		System.out.println(list);
		System.out.println(list.peek()); // peak() is used for read the head element
		System.out.println(list);
		System.out.println(list.peekFirst()); // peakFirst() is used for read the First element
		System.out.println(list);
		System.out.println(list.peekLast());// peakLast() is used for read the Last element
		System.out.println(list);
	}
}
