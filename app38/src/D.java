class C
{
	void test()
	{
		System.out.println("C-test");
	}
}


class D extends C 
{
	void hello()
	{
		System.out.println("D-hello");
	}
	
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test();
		d1.hello();
		System.out.println("done");
	}
}
