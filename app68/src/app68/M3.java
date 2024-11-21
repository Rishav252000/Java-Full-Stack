package app68;

import java.util.LinkedList;

public class M3 {
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
		list.push(333);
		System.out.println(list);
		list.push(444);
		System.out.println(list);
		System.out.println(list.pop()); // reading and removing the element 
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list);
	}

}
