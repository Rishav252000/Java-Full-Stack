package practice;

public class M16 {
//	int i;
//	static int j;
	static class C{
		int i = 12;
		static int j = 15;
		void test()
		{
			System.out.println(i);
			System.out.println(j);
			test2();
		}
		static void test2() {
			 System.out.println("static method");
		 }
	}
	public static void main(String[] args) {
		M16 m = new M16();
		M16.C c = new C();
		c.test();
	}
}
