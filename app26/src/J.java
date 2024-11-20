class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String i = "abc";
		test(i);
		System.out.println("main end:");
	}
	static void test(int i) 
	{
		System.out.println("test:" + i);
	}
}
