package app67CollectionApi;
import java.util.ArrayList;

public class M1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(false);
		ArrayList list2 = (ArrayList)list.clone();
		
	
		list.add('a');
		list.add(12.5);
		list.add("abc");
		list.add(123);
		list.remove(2);
		list.remove(0);
		list.remove(1);
		list.remove(0);
		list.remove(0);
		
		list.add(123);
		list.add("asdf");
		list.add('a');
		list.add(12.4);
		list.add(true);
		
		list.forEach((n) -> System.out.println(n));
		list.removeAll(list);
		
		System.out.println(list);
		list.forEach((n) -> System.out.println(n));
		//list.removeIf();
		
		System.out.println(list);
	//	System.out.println(list.get(0));
	//	System.out.println(list.get(1));
	//	System.out.println(list.lastIndexOf(12));
	//	System.out.println(list);
	}
}
