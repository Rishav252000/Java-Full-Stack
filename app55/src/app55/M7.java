package app55;
class B1{
	int i = 10;
	final int j = 20;
	class A{
		void test() {
			System.out.println(i);
			System.out.println(j);
		}
	}
	//i = 10;
}
public class M7 {
	public static void main(String[] args) {
//		int i = 10;
//		final int j = 20;
//		class A{
//			void test() {
//				System.out.println(i);
//				System.out.println(j);
//			}
//		}
		B1.A a1 = new B1().new A();
		a1.test();
		
		
		a1.test();
	}
}
