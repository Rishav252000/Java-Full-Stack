class S
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("hello  " + test1(test2(i++  +  i) + i++) + i);
		//System.out.println("hello  " + test1(test2(21) + i++) + i);
		//System.out.println("hello  " + test1(51 + 11) + 12);
		//System.out.println("hello  " + test1(62) + 12);
		//System.out.println("hello  " + 72 + 12);
		//System.out.println("hello  72"  + 12);
		//System.out.println("hello  7212");
		System.out.println("=============");
		System.out.println("hello  " + i);	//	hello 12
	}
	public static int test1(int i) 
	{
		System.out.println("test1");
		return i + 10;
	}
	public static int test2(int i) 
	{
		System.out.println("test2");
		return i + 30;
	}
}
