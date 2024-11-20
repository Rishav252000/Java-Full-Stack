package app55;

public class M12 {
	static void m1(A a1) {
		a1.test1();
		a1.test1();
		
	}
	public static void main(String[] args) {
		m1(new A());
		System.out.println("---------------");
		m1(new A() {
			void test1() {
				System.out.println("AIC_TEST1");
			}
		});
		
		m1(new A());
		System.out.println("---------------");
		m1(new A() {
			void test1() {
				System.out.println("AIC_TEST1");
			}
		});
		System.err.println("-----------");
	}
	
}
