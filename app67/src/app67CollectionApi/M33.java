package app67CollectionApi;

import java.util.ArrayList;
import java.util.ListIterator;

public class M33 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(910);
		list.add(999);
		list.add(909);
		list.add(980);
		list.add(990);
		ListIterator it = list.listIterator();
		Object obj;
		while(it.hasNext()) {
			obj = it.next();
			System.out.println(obj);
			if(obj.equals(990)) {
				it.set(88888);
			}
			
		}
		list.add(100);
		System.out.println(list);
		
	}
}
