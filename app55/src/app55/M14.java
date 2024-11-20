package app55;

public class M14 {
	static void t1(D obj) {
		obj.test1();
		obj.test2();
	}
	public static void main(String[] args) {
	//	t1( new D());
		t1(new D() {
			public void test1() {
				System.out.println("D-test()");
			}
			public void test2() {
				System.out.println("D-test2()");
			}
		});
	}
}
