class A
{
	void test()
	{
		System.out.println("A-test");
	}
}
class B extends A
{
	void test()
	{
		System.out.println("B-test");
	}
}
class M2 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new B();
		A[] elements = {a1, a2};
		for(A element : elements)
		{
			element.test();
		}		
	}
}
