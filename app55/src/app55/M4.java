package app55;
class Test{
	class A {
		
	}
	static class B{
		
	}
}
public class M4 {
	public static void main(String[] args) {
		Test.A a1;
		Test.B b1;
		
		Test t1 = new Test();
		a1 = t1.new A();
		
		b1 = new Test.B();
	}
}