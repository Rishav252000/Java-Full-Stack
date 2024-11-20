abstract class A
{
	abstract void test1();
	void test2()
	{
		System.out.println("A-test2");
	}
	abstract void test3();
}
abstract class B extends A
{
	void test1()
	{
		System.out.println("B-test1");
	}
}
class F 
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
