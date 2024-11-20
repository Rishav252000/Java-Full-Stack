package app67CollectionApi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collection;

public class M24 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add(123);
		arr.add(123);
		arr.add(12);
		arr.add(12111);
		arr.add(124);
		arr.add(54);
		arr.add(32);
		arr.add(5544);
		arr.remove("123");
		arr.add(123);
		arr.add(123);
		arr.add(12);
		arr.add(12111);
		arr.add(124);
		arr.add(54);
		arr.add(32);
		arr.add(5544);
		arr.remove("123");
		
		System.out.println(arr);
		HashSet set = new HashSet(arr);
		arr.clear();
		arr.addAll(set); //
		System.out.println(arr.size());

		
	}
}
