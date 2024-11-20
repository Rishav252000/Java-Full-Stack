interface A
{
	void test1();
}
class B implements A
{
	public void test1()
	{
		System.out.println("test1");
	}
}
class L 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test1();
		System.out.println("done");
	}
}
