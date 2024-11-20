package app55;

public class M2 {
	void test1() {
	}
	static void test2() {
		
	}
	public static void main(String[] args) {
//		test1();
		test2();
		M2 obj = new M2();
		obj.test1();
		new M2().test1();
		M2.test2();
	}
}
