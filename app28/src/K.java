class K 
{
	static int i = test1();
	static int j = test2();
	static int k = test1() + test2() + test3();
	static int test1()
	{
		System.out.println("test1:" + i + ", " + j + ", " + k);
		return i + j + k + 1;
	}
	static int test2()
	{
		System.out.println("test2:" + i + ", " + j + ", " + k);
		i += 1;
		j += i + 2;
		k += i + j + 3;
		return i + j + k + 4;
	}
	static int test3()
	{
		System.out.println("test31:" + i + ", " + j + ", " + k);
		i += i + j + k + 5;
		j += i + j + 6;
		k += i + 7;
		main(null);
		System.out.println("test32:" + i + ", " + j + ", " + k);
		return i + j + k + 8;
	}
	public static void main(String[] args) 
	{
		System.out.println("main:" + i + ", " + j + ", " + k);
		i += i + j + k + 9;
		j += i + j + k + 10;
		k += i + j + k + 11;
	}
}
