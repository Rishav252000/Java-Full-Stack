package app55;

public class M3 {
	class A{
		
	}
	static class B{
		
	}
	public static void main(String[] args) {
		A a1;
		B b1;
		
		
	//	a1 = new A();
		b1 = new B();
		
		M3 obj = new M3();
		a1 = obj.new A();
		a1 = new M3().new A();
		
		b1 = new B();
		b1 = new M3.B();
		
		System.out.println("done");
	}
}
