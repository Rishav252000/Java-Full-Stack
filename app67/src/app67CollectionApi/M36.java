package app67CollectionApi;

import java.util.ArrayList;
import java.util.ListIterator;

public class M36 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(910);
		list.add(999);
		list.add(909);
		list.add(980);
		list.add(990);
		ListIterator it = list.listIterator();
		while(it.hasNext()) {  //Yeh check karta hai ki ListIterator ke paas agla element hai ya nahi.
			System.out.println(it.previousIndex()); //  Yeh current position ke previous index ko return karta hai.
	//		Agar iterator start point par hai, toh yeh -1 return karega.
			System.out.println(it.next()); //it.next(): Yeh iterator ko agle element par le jaata hai aur us element ki value return karta hai.
			System.out.println(it.nextIndex());//it.nextIndex(): Yeh agle element ka index return karta hai.
		}
		System.out.println(list);
	}
}
