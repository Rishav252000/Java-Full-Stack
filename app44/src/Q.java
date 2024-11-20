class A
{
	void test(int i, int j)
	{
		System.out.println("A-test");
	}
}
class Q extends A
{
	void test(int p, int q)
	{
		super.test(p, q);
		System.out.println("Q-test begin");
		System.out.println("Q-test end");
	}
	
	public static void main(String[] args) 
	{
		Q obj = new Q();
		obj.test(23, 40);
		System.out.println("done");
	}
}
