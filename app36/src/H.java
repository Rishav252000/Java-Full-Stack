class H 
{
	static int i;
	H()
	{
		System.out.println("H():"+ i);
	}
	void test1()
	{
		System.out.println("test1():"+ i);
	}	
	static void test2()
	{
		System.out.println("test2():"+ i);
	}	
	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
		test2();
		H obj =new H();
		obj.test1();
	}	
	{
		System.out.println("IIB:" + i);
	}
	static
	{
		System.out.println("sib:"+ i);
	}
}
