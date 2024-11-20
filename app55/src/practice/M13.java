package practice;

public class M13 {
	private int i = 10;
	private int j = 10;
	private int k = 10;
	public class B
	{
		void test()
		{
			System.out.println(i);
			System.out.println(j);
			System.out.println(k);
		}
	}
	public class C
	{
		void test1()
		{
			System.out.println(i);
			System.out.println(j);
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		M13 m = new M13();
		M13.B b = m.new B();
		M13.C c = m.new C();
		c.test1();
		b.test();
		
	}
}
