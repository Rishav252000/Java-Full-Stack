package Vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import java.util.ListIterator;


public class M1 {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add("Rishav");
		v1.add("Rajput");
		v1.add("age");
		v1.add(24);
		Enumeration e1 = v1.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}
}
