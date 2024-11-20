abstract class A
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test4();
	void test5()
	{
	}
	void test6()
	{
	}
}
class C 
{
	A obj;

	A hello()
	{
		return obj;
	}
	
	void hello1(A a1)
	{
	}
	
	public static void main(String[] args) 
	{
		A a1 = null;
		a1 = new A();
		System.out.println("Hello World!");
	}
}
