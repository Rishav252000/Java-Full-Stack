package app67CollectionApi;

import java.util.ArrayList;
import java.util.Collections;

public class M20 {
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
		arr1.addAll(arr1); //dought 
		arr1.addAll(arr1); //dought 
		
		System.out.println(arr1);
		Collections.sort(arr);
		System.out.println(arr);

		
	}
}
