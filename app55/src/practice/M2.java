package practice;
class A{
	class B{
		
		class C{
			public void m1() {
				System.out.println("C-inner class");
			}
		}
	}
}
public class M2 {
	public static void main(String[] args) {
//		A a = new A();
//		A.B b = a.new B();
//		A.B.C c = b.new C();
		//c.m1();
		
		A.B.C c = new A().new B().new C();
		c.m1();
	}
}
