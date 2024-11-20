package pack1;
class A <Z> {
	Z f1;
}
public class M1 {
	public static void main(String[] args) {
		A< ? > a1 = null;
		a1 = new A<Integer>();
		a1 = new A<String>();
		a1 = new A<Boolean>();
		a1 = new A<Short>();
		a1 = new A<Byte>();
		a1 = new A<Float>();
		a1 = new A<Double>();
		a1 = new A<Number>();
		a1 = new A<Object>();
		a1 = new A<Math>();
		a1 = new A<M1>();
		a1 = new A<System>();
		
//if we are extending the class of number then
		// we can achieve either Number or 
		// subclass of Number
		A < ? extends Number > a2 = null;
		a2 = new A<Integer>();
		a2 = new A<Long>();
		a2 = new A<Float>();
		a2 = new A<Double>();
		a2 = new A<Number>();
		
		A< ? super Number > a3 = null;
		a3 = new A<Object>();
		a3 = new A<Number>();
		
		System.out.println("done");
	}
}
