class M4 
{
	static void test(A a1)
	{
		System.out.println("test:" + a1);
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		C c2 = new D();
		B b1 = new D();		//	B b1 = (B) new D();
		B b2 = new C();
		B b3 = new B();
		test(c1);
		test(c2);	//	test((A) c2);
		test(b1);
		test(b2);
		test(b3);
		test(new D());
		test(new B());
		test(new C());	//	test((A) new C());
		test(new A());
		System.out.println("done");
	}
}
