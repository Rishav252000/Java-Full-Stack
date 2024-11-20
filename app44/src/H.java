class A
{
	void test()
	{
		System.out.println("test");
	}
}
class H extends A 
{
	void test(int i)
	{
		System.out.println("test(int)");
	}
	
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.test();
		System.out.println("------------------");
		h1.test(20);
		System.out.println("------------------");
	}
}
