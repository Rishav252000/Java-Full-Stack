class A
{
	static void test()
	{
		System.out.println("A-test()");
	}
}
class B extends A
{
	static void test()
	{
		System.out.println("B-test()");
	}
}
class M4 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new B();
		A[] elements = {a1, a2};
		for(A element : elements)
		{
			element.test();		//	A.test();
		}
	}
}
