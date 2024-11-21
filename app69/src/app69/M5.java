package app69;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class M5 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(70);
		set.add(80);
		System.out.println(set);
		TreeSet<Integer> set1 = new TreeSet<Integer>(set);
		System.out.println(set.add(100));
		System.out.println(set.add(100));
		System.out.println(set);
		System.out.println("---------");
		System.out.println(set1);                                
	}
}
