class A
{
	final void test()
	{
		System.out.println("A-test");
	}
}

class X extends A 
{
	void test()
	{
		System.out.println("X-test");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
