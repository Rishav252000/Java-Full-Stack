package Genric;

class P{

}
class Q extends P{
	
}
class R extends Q{
	
}
class S extends R{
	
}
class T extends S{
	
}
class B< Z >{
	Z f1;
	
}
public class M3 {
	public static void main(String[] args) {
		B<?> b1 = null;
		b1 = new B<P>(); // P is acceptable
		b1 = new B<Q>(); // Q is acceptable
		b1 = new B<R>(); // R is acceptable
		b1 = new B<S>(); // S is acceptable
		b1 = new B<String>();
		b1 = new B<Number>();
		b1 = new B<Object>();
		B<? extends R> b2 = null;
		
		B<? extends Number> b4 = null;
		b4 = new B<Number>();
		b4.f1 = 10;
		System.out.println(b4.f1);
		
		
		B<? super Number> b5= null;
		b5 = new B<Number>();
		b5.f1 = 10;
		
		
		System.out.println(b5.f1);
		
		b2 = new B<R>(); // R is acceptable
		b2 = new B<S>(); // S is acceptable
		b2 = new B<T>(); // S is acceptable
		
		B<? super R> b3 = null;
		b3 = new B<R>(); // R is acceptable
		b3 = new B<Q>(); // S is acceptable
		b3 = new B<P>(); // S is acceptable
	//	b3 = new B<T>(); // S is acceptable
		
	}
}
