package app56;

interface A{
	void test();
	
}

public class M1 {
	public static void main(String[] args) {
		A a1 = new A() {
			public void test() {
				System.out.println("A-test");
			}
		};
		a1.test();
		
		System.out.println("-------------");
		
		A a2 = () -> System.out.println("Lamba exp -test");
		a2.test();
		
		System.out.println("-------------");
		
		A a3 = () -> {
			class A{
				 void test2() {
					System.out.println("inner class test2");
				}
			}
			A a = new A();
			a.test2();
			System.out.println("stmt1");
		};
		a3.test();
		
		
		
	}
}
