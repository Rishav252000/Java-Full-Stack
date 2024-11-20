class Z4 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = test1(i++  +  i)  +  i  +  test2(i++  +  i)  +  
				i++  +  test3(++i + i)  +  i  +
				test4(i++  +  i)  +  i  +  test1(++i  +  i)  +  
				i++  +  test2(++i + i)  +  i +
				test4(--i  +  i--)  +  i  +  test1(i--  +  --i)  +  
				i++  +  test2(--i + i)  +  i +
		System.out.print(i);	
		System.out.println(", " + j);	
	}
	public static int test1(int i) 
	{
		return i++  +   i;	
	}
	public static int test2(int i) 
	{
		return ++i  +   i;	
	}
	public static int test3(int i) 
	{
		return i--  +  i;	
	}
	public static int test4(int i) 
	{
		return --i  +  i;	
	}
}
