class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int p = 10;
		test(p);
		System.out.println("main end:");
	}
	static void test(int i) 
	{
		System.out.println("test:" + i);
	}
}
