package app55;
abstract class C {
	abstract void test1();
	void test2(){
		System.err.println("C-test2");
	}
}
public class M10 {
	public static void main(String[] args) {
		C c2 = new C()
				{
			void test1(){
				System.out.println("AIC-test1");
			}
		};
		c2.test1();
		c2.test2();
	}
}
