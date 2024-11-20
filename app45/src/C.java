class C 
{
	static void test(float f1)
	{
		System.out.println("test:" + f1);
	}
	public static void main(String[] args) 
	{
		byte v1 = 100;
		short v2 = 100;
		int v3 = 100;
		long v4 = 100;
		float v5 = 100;
		double v6 = 100;
		
		test(v1);
		test(v2);
		test(v3);
		test(v4);
		test(v5);
	//	test(v6);
		System.out.println("done");
	}
}
