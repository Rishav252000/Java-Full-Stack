class C 
{
	
	static int i;
	
	static
	{
		test();
	}
	
	static void test()
	{
		System.out.println(B.i);	//	indirect read
		B.i = 10;	//	indirect write
		System.out.println(i);	//	indirect read
		i = 10;	//	indirect write
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
