package app63;

final class M14 {
	final class A{
		void test() {
			System.out.println("final method");
		}
	}
	public static void main(String[] args) {
		M14 m = new M14();
		M14.A a = m.new A();
		a.test();
	}
}
