class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(1.5, 45);
		System.out.println("main end:");
	}
	static void test(double i, int j) 
	{
		System.out.println("test:" + i);
		System.out.println("test:" + j);
	}
}
