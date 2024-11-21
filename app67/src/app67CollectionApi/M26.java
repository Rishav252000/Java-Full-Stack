package app67CollectionApi;

import java.util.ArrayList;
import java.util.Iterator;

public class M26 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(910);
		list.add(999);
		list.add(909);
		list.add(980);
		list.add(990);
		Iterator it = list.iterator();
		Object obj;
		while(it.hasNext()) {
			obj = it.next();
			System.out.println(obj);
			if(obj.equals(910)) {
				it.remove();
			}
		}
		System.out.println(list);
	}
}
