package app58;
class B
{
	void test(Integer i) {
		
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.test(10001);
		
		B b2 = new B();
		b1.test(102);
		
		B b3 = new B();
		b1.test(201);
		
		B b4 = new B();
		b1.test(1100);
		
		System.out.println("done");
	}
}
