package app69;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class M8 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		set.add(10);
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
	}
}
