package app67CollectionApi;

import java.util.ArrayList;

public class M2 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add(123);
		arr.add(12);
		arr.add(12111);
		arr.add(124);
		arr.add(54);
		arr.add(12);
		arr.add(123);
		System.out.println(arr);
		arr.add(2, "test"); // inserting the element 
		System.out.println(arr);
		
	}
}
