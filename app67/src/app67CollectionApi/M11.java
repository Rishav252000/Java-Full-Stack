package app67CollectionApi;

import java.util.ArrayList;

public class M11 {
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
		System.out.println("------------------");
		
		ArrayList arr1 = new ArrayList(arr);
		
		
		arr1.add("asd");
		arr1.add(54);
		arr1.add(true);
		System.out.println(arr1);
		System.out.println("------------------");
		System.out.println(arr.remove(3));
		arr1.clear();
		System.out.println(arr1.isEmpty()); //if arrayList is empty than it will return true;
		System.out.println(arr);
		
		System.out.println("------------------");
		//arr.clear(); //  remove or delete every elements the specifying the in index
		
		
		
	}
}
