class A
{
	boolean test(int i, int j)
	{
		System.out.println("A-test");
		return false;
	}
}
class O extends A
{
	int test(int p, int q)
	{
		System.out.println("I-test");
		return 30;
	}
	
	public static void main(String[] args) 
	{
		O obj = new O();
		obj.test(23, 40);
		System.out.println("done");
	}
}
