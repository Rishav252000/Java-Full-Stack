package app55;
class Test1{
	class A{
		
	}
	static class B{
		
	}
}
public class M17 {
	public static void main(String[] args) {
		Test1.A a1 = null;
		Test1.B b1 = null;
		
		a1 = new Test1().new A();
		Test1 a2 = new Test1();
		 a1 =  a2.new A();
		 
		 
		b1 = new Test1.B();
	}
}
