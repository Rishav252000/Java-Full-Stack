package app67CollectionApi;

import java.util.ArrayList;

public class M10 extends ArrayList{
	public static void main(String[] args) {
		M10 arr = new M10();
		
		arr.add(123);
		arr.add("abc");
		arr.add(12);
		arr.add(12111);
		arr.add(124);
		arr.add(54);
		arr.add(true);
		arr.add(false);
		arr.remove("123");
		//arr.removeRange(1, 5);
		System.out.println(arr);
		System.out.println(arr.remove("abc"));
		System.out.println(arr.remove("abcd"));
		//arr.clear(); //  remove or delete every elements the specifying the in index
		System.out.println(arr);
		System.out.println(arr.remove(3));
		System.out.println(arr.isEmpty()); //if arrayList is empty than it will return true;
		System.out.println(arr);
		
	}
}
