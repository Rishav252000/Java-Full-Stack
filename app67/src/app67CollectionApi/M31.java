package app67CollectionApi;

import java.util.ArrayList;
import java.util.ListIterator;

public class M31 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(910);
		list.add(999);
		list.add(909);
		list.add(980);
		list.add(990);
		ListIterator it = list.listIterator();
		list.add(100);
		 //
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
//		System.out.println("------------");
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//			
//		}
		
	}
}
