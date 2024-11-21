package app69;

import java.util.HashSet;

public class M2 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println(set.add(100));
		System.out.println(set.add(100));
		System.out.println(set.add(1100));
		System.out.println(set.add(1100));
		System.out.println(set.add(1100));
		System.out.println(set);
	}
}
