package pack1;

class C < Z > {
	Z f1;
}
	
public class M3 {
	public static void main(String[] args) {
		
		C <? extends Number> a1 = null;
        a1 = new C<Number>();
        a1 = new C<Integer>();
        a1 = new C<Byte>();
        System.out.println("done");
		
		
//		C < ? > c1 = null;
//		c1.f1 = 10;
//		c1.f1 = "abc";
//		c1.f1 = new Object();
//		
//		C < ? extends Number> c2 = null;
//		c2.f1 = 10;
//		c2.f1 = "abc";
//		c2.f1 = new Object();
//		
//		C < ? super Number> c3 = null;
//		c3.f1 = 10;
//		c3.f1 = "abc";
//		Object obj = new A();
//		c3.f1 = new Object();
//		
//		C < ? extends R > c4 = null;
//		
//		c4.f1 = 10;
//		c4.f1 = "abc";
//		c4.f1 = new Object(); 
		
	
//		c4 = new C<R>();
		
		
	}
}
