class M6
{
	static void test(B b1)
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		Object o1 = new C();
		A a1 = new B();
		B b1 = new C();
		C c1 = new D();
		D d1 = new D();
//		test(o1);
//		test(a1);
		test(b1);
		test(c1);
		test(d1);
		System.out.println("done");
	}
}
