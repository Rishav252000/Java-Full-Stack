class A
{
	void test()
	{
		System.out.println("A-test");
	}
}
class I extends A
{
	void test()
	{
		System.out.println("I-test");
	}
	
	public static void main(String[] args) 
	{
		I obj = new I();
		obj.test();
		System.out.println("done");
	}
}
