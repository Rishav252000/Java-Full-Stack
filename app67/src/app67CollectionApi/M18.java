package app67CollectionApi;

import java.util.ArrayList;

public class M18 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add(123);
		arr.add("abc");
		arr.add(12);
		arr.add(12111);
		arr.add(124);
		arr.add(54);
		arr.add(true);
		arr.add(false);
		arr.remove("123");
		System.out.println(arr);
		System.out.println(arr.remove("abc"));
		System.out.println(arr.remove("abcd"));
		ArrayList arr1 = new ArrayList(arr);
		arr1.add("asd");
		arr1.add(54);
		arr1.add(true);
		arr1.add('1');
		arr1.add("True");
		System.out.println("---------");
		arr1.addAll(2, arr); //dought 
		arr.retainAll(arr1);
		System.out.println(arr1);
		System.out.println(arr);

		
	}
}
