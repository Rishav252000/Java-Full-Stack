package app67CollectionApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class M30 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(910);
		list.add(999);
		list.add(909);
		list.add(980);
		list.add(990);
		ListIterator it = list.listIterator();
		
		 //
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		list.add(100);
		System.out.println(list);
	}
}
