package app69;

import java.util.Set;
import java.util.TreeSet;

public class M11 {
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
		Set<Integer> set1 = set.headSet(30);
		System.out.println(set1);
		Set<Integer> set2 = set.tailSet(30);
		System.out.println(set2);
		Set<Integer> set3 = set.tailSet(31);
		System.out.println(set3);
	}
}
