package app67CollectionApi;

import java.util.ArrayList;

public class M3{
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
		arr.set(2, "test"); // set method is used for modify or replacing the value 
		System.out.println(arr);
		
	}
}