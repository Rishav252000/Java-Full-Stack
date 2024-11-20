class D 
{
	static int test()
	{
		System.out.println("test");
		return 20;
	}
	public static void main(String[] args) 
	{
	//	byte v1 = test();
	//	short v2 = test();
		int v3 = test();
		long v4 = test();
		float v5 = test();	//	float v5 = (float) test();
		double v6 = test();
		System.out.println("done");
	}
}
