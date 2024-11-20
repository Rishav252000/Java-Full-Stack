class A 
{
	
	A()
	{
		System.out.println("A()");
	}
	
	void test()
	{
		System.out.println("test()");
	}
	
	public static void main(String[] args) 
	{
		A a1 = null;
		
		a1 = new A();
		
		System.out.println("done");
	}
}
