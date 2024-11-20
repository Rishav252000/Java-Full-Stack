package ObjectClass;

import java.util.ArrayList;


public class M4 {
	public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(90);
        list1.add(910);
        list1.add(190);
        
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(90);
        list2.add(910);
        list2.add(190);
        
        System.out.println(list1.equals(list2));
}
}
