package app67CollectionApi;

import java.util.ArrayList;

public class M6 {
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
		arr.clear(); //  remove or delete every elements the specifying the in index
		System.out.println(arr);
		System.out.println(arr.isEmpty()); //if arrayList is empty than it will return true;
		
		
	}
}
