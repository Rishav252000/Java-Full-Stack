package app67CollectionApi;

import java.util.ArrayList;
import java.util.Iterator;

public class M28 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(910);
		list.add(999);
		list.add(909);
		list.add(980);
		list.add(990);
		Iterator it = list.iterator();//fail-fast iterator
		list.add(100); //
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
