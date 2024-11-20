package app67CollectionApi;

import java.util.ArrayList;
import java.util.Collections;

public class M22 {
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
		System.out.println(arr);
		System.out.println(arr.remove("abc"));
		System.out.println(arr.remove("abcd"));
		ArrayList arr1 = new ArrayList(arr);
		
		
		System.out.println(arr1);
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);

		
	}
}
