class U 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("-----------");
		U.test();
		System.out.println("main end");
	}
	public static void test() 
	{
		System.out.println("test");
	}
}
