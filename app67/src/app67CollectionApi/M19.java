package app67CollectionApi;

import java.util.ArrayList;

public class M19 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add(123);
		arr.add("abc");
		arr.add(12);
		arr.add(12111);
		arr.add(124);
		
		ArrayList arr1 = new ArrayList(arr);
		arr1.add("asd");
		arr1.add(54);
		arr1.add(true);
		arr1.add('1');
		arr1.add("True");
		arr1.addAll(5, arr); //dought 
		System.out.println(arr.contains("abc"));
		
		System.out.println(arr1);
		System.out.println(arr);

		
	}
}
