class A
{
	public void test(int i, int j)
	{
		System.out.println("A-test");
	}
}
class L extends A
{
	protected void test(int p, int q)
	{
		System.out.println("I-test");
	}
	
	public static void main(String[] args) 
	{
		K obj = new K();
		obj.test(23, 40);
		System.out.println("done");
	}
}
