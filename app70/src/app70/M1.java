package app70;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;



public class M1 {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(1, "Rishav");
		h1.put(6, "Aadarsh");
		h1.put(2, "Neha");
		h1.put(3, "Priya");
		h1.put(4, "Sonal");
		h1.put(5, "Rajput");
		System.out.println(h1);
		System.out.println("---------------");
		TreeMap<Integer, String> hashmap = new TreeMap<Integer, String>(Collections.reverseOrder());
		hashmap.putAll(h1);
		System.out.println(hashmap);
		System.out.println();
		System.out.println(hashmap.ceilingEntry(1));
		System.out.println();
		System.out.println(hashmap.floorKey(2));
		System.out.println();
		//System.out.println(hashmap.replace(2, "Chacha"));
		System.out.println();
		System.out.println(hashmap.pollFirstEntry());
		System.out.println("------");
		System.out.println(hashmap);
		System.out.println(hashmap.pollLastEntry());
		System.out.println(hashmap);
		System.out.println("--------------------");
		System.out.println(hashmap.pollLastEntry());
		System.out.println();
		System.out.println(hashmap);
		//hashmap.putFirst(7, "Gopal");
	}
}
