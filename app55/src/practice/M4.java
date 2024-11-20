package practice;

public class M4 {
	int y = 10;
	static int z = 15;
	public void m2() {
		 int x = 5;
	class A{
		
		public void m1()
		{
			 int a = 12;
			System.out.println(x);
			class C{
				static void m3() {
	//				System.out.println(x);
					//System.out.println(y);
					System.out.println(z);
				}
			}
			C c1 = new C();
			c1.m3();
			
		}
		
	}
	class B{
		public void m2() {
			System.out.println(y);
			System.out.println(z);
			System.out.println(x);
		}
	}
	A a1 = new A();
	a1.m1();
	
	B b1 = new B();
	b1.m2();
	}
	public static void main(String[] args) {
		
		M4 m = new M4();
		m.m2();
	}
}
