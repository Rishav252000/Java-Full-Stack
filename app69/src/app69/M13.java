package app69;

import java.util.Set;
import java.util.TreeSet;

public class M13 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(70);
		set.add(70);
		set.add(70);
		set.add(80);
		System.out.println(set);
		System.out.println(set.ceiling(24));
		System.out.println(set.floor(21));
	}
}
