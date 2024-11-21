package app68;

import java.util.LinkedList;

public class M2 {
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
		System.out.println(list.poll()); // if inside the sop poll() is used for read the head element and removed from list
		System.out.println(list);
		System.out.println(list.pollFirst()); // if inside the sop pollFirst() is used for read the First element and removed from list
		System.out.println(list);
		System.out.println(list.pollLast());// if inside the sop pollLast() is used for read the Last element and removed from list
		System.out.println(list);
	}
}
