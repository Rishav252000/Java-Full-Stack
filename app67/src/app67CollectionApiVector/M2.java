package app67CollectionApiVector;

import java.util.HashSet;
import java.util.Vector;

public class M2 {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(123);
		v1.add("Rishav");
		v1.add("Rajput");
		v1.add(82);
		v1.add(24);
//		v1.forEach((n) -> System.out.println(n));
		v1.add(3, "Home");
		v1.remove(0);
		v1.set(2, "Hello");
		
		System.out.println(v1);
		
		Vector v2 = new Vector(v1);
		v2.add(1);
		
		
		
		System.out.println(v2);
		v2.addAll(3, v1);
		v2.addAll(2, v1);
		HashSet set = new HashSet(v2);
		System.out.println(set);
	}
}
