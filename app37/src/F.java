class F 
{
	F()
	{
		System.out.println("F():" + this);
	}
	
	
	{
		System.out.println("IIB:" + this);
	}
	
	void test()
	{
		System.out.println("test:" + this);
	}
	
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println("main:" +  f1);
		f1.test();
	}
}
