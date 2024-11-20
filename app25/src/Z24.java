class Z24
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = test();
		System.out.println("main end:" + i);
	}
	public static int test() 
	{
		System.out.println("test");
		int j = 40;
		return j + 50;
	}
}
