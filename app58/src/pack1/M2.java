package pack1;
class P
{

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
public class M2 {
	public static void main(String[] args) {
		
		
		
		
		
		B<?> b1 = null;
		b1 = new  B<Integer>();
		b1 = new  B<String>();
		b1 = new  B<Boolean>();
		b1 = new  B<Double>();
		b1 = new  B<Character>();
		b1 = new  B<Float>();
		b1 = new  B<Number>();
		b1 = new  B<Object>();
		
		
		B<? extends R> b2 = null;
		
		b2 = new B<R>();
		b2 = new B<S>();
		b2 = new B<T>();
		
		B< ? super R > b3 = null;
		
		b3 = new B<P>();
		b3 = new B<Q>();
		b3 = new B<R>();
	}
}